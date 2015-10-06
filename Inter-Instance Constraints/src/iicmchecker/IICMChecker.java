package iicmchecker;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import iicmchecker.compliancechecker.Compliancechecker;
import iicmchecker.constraintReader.IIListener;
import iicmchecker.constraintReader.Inter_InstanceLexer;
import iicmchecker.constraintReader.Inter_InstanceParser;
import iicmchecker.logtransformer.LogTransformer;
import iicmchecker.storage.StorageHelper;
import iicmchecker.utils.logging.LoggerFactory;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import de.uni.freiburg.iig.telematik.sewol.log.Log;
import de.uni.freiburg.iig.telematik.sewol.log.LogEntry;

public class IICMChecker {
	
Logger logger = LoggerFactory.getLogger();
	
String rulelocation;
String[] rulefiles;	
String outputlocation;
Level loggerLevel = Level.ALL;
List<List<List<Log<LogEntry>>>> LogList = new ArrayList<List<List<Log<LogEntry>>>>();


public void setLoggerLevel(Level loggerLevel) {this.loggerLevel = loggerLevel;}

public void setRuleLocation(String rulelocation) {this.rulelocation = rulelocation;}

public void setRuleFiles(String[] rulefiles) {this.rulefiles = rulefiles;}

public void setOutputLocation(String outputlocation) {this.outputlocation = outputlocation;}

private void init() {
	logger.info("Initializing IICMChecker");
	StorageHelper.setOutputLocation(outputlocation);
	LoggerFactory.setLevel(loggerLevel);
	try {
		LoggerFactory.setup();
	} catch (IOException e) {
		e.printStackTrace();
	}
}

public void run() {
logger.entering("IICMChecker", "run()");
init();
parseRuleFiles();	
readLogs();
storeKnowledgeBase();
runComplianceChecker();
}



private void parseRuleFiles() {
	
/*
* Parse the rule files and write the rules to prologfiles
*/
for (String file : rulefiles) {

try {
		
File f = new File(rulelocation + "/" +  file);
InputStream fs = new FileInputStream(f);
// create a CharStream that reads from standard input
ANTLRInputStream input = new ANTLRInputStream(fs);
// create a lexer that feeds off of input CharStream
Inter_InstanceLexer lexer = new Inter_InstanceLexer(input);
// create a buffer of tokens pulled from the lexer
CommonTokenStream tokens = new CommonTokenStream(lexer);
// create a parser that feeds off the tokens buffer
Inter_InstanceParser parser = new Inter_InstanceParser(tokens);
// begin parsing at rule file
Inter_InstanceParser.FileContext tree = parser.file();

fs.close();

ParseTreeWalker walker = new ParseTreeWalker();
walker.walk(new IIListener(), tree);

// tree.inspect(parser);


} catch(Exception e) {
	e.printStackTrace();
}

}
}

private void readLogs() {
for (List<List<Log<LogEntry>>> log : LogList) {

try {

/*
 * Read the logs and create a prolog file
*/
LogTransformer ltransformer = new LogTransformer();
ltransformer.transform(log);

} catch (Exception e) {
	e.printStackTrace();
}

}
}

private void storeKnowledgeBase() {
StorageHelper.getInstance().printToFile();
}


private void runComplianceChecker() {

/*
 * Run the Modelchecker
 */
Compliancechecker mc = new Compliancechecker();
	mc.run();
}

public void addLog(List<List<Log<LogEntry>>> log) {
	LogList.add(log);
}

}

