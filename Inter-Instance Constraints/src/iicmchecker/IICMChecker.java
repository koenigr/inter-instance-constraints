package iicmchecker;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import iicmchecker.compliancechecker.Compliancechecker;
import iicmchecker.constraintReader.IIListener;
import iicmchecker.constraintReader.Inter_InstanceLexer;
import iicmchecker.constraintReader.Inter_InstanceParser;
import iicmchecker.logging.LoggerFactory;
import iicmchecker.logtransformer.LogCreator;
import iicmchecker.logtransformer.LogParser;
import iicmchecker.logtransformer.LogTransformer;
import iicmchecker.storage.StorageHelper;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import de.uni.freiburg.iig.telematik.sewol.log.LogEntry;
import de.uni.freiburg.iig.telematik.sewol.log.LogTrace;

public class IICMChecker {
	
Logger logger = LoggerFactory.getLogger();
	
String rulelocation;
String[] rulefiles;	
String loglocation;
String[] logfiles;
String outputlocation;
Level loggerLevel = Level.ALL;


public void setLoggerLevel(Level loggerLevel) {this.loggerLevel = loggerLevel;}

public void setRuleLocation(String rulelocation) {this.rulelocation = rulelocation;}

public void setRuleFiles(String[] rulefiles) {this.rulefiles = rulefiles;}

public void setLogLocation(String loglocation) {this.loglocation = loglocation;}

public void setLogFiles(String[] logfiles) {this.logfiles = logfiles;}

public void setOutputLocation(String outputlocation) {this.outputlocation = outputlocation;}

private void init() {
	logger.entering("IICMChecker", "init()");
	StorageHelper.setOutputLocation(outputlocation);
	LoggerFactory.setLevel(loggerLevel);
	try {
		LoggerFactory.setup();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	// TODO hier alle init Sachen statt im Constructor von den Teilen
}

public void run() {
logger.entering("IICMChecker", "run()");
init();
parseRuleFiles();	
//parseLogFiles();
storeKnowledgeBase();
//runComplianceChecker();
}



private void parseRuleFiles() {
logger.entering("IICMChecker", "parseRuleFiles()");
	
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

private void parseLogFiles() {
logger.entering("IICMChecker", "parseLogFiles()");
for (String logfile : logfiles) {

try {
/*
* Create some test logs		
 */
// TODO der LogCreator muss hier später raus, weil er nichts mit dem Programm zu tun hat
LogCreator lcreator = new LogCreator(loglocation, logfile);
lcreator.createLog();


/*
* Parse logs
*/
LogParser lparser = new LogParser();
List<List<LogTrace<LogEntry>>> logs = lparser.parseLog(loglocation, logfile);

/*
 * Read the logs and create a prolog file
*/
LogTransformer ltransformer = new LogTransformer();
ltransformer.transform(logs);

} catch (Exception e) {
	e.printStackTrace();
}

}
}

private void storeKnowledgeBase() {
logger.entering("IICMChecker", "storeKnowledgeBase()");
// TODO die location angeben
StorageHelper.getInstance().printToFile();
}


private void runComplianceChecker() {
logger.severe("agadfgadf");
logger.entering("IICMChecker", "runComplianceChecker()");
logger.severe("agadfgadf");

/*
 * Run the Modelchecker
 */
Compliancechecker mc = new Compliancechecker();
	mc.run();
}

}

