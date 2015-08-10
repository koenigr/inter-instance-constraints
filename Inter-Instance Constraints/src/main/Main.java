package main;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;

import de.invation.code.toval.parser.ParserException;
import de.invation.code.toval.validate.ParameterException;
import de.uni.freiburg.iig.telematik.sewol.log.LockingException;
import de.uni.freiburg.iig.telematik.sewol.log.Log;
import de.uni.freiburg.iig.telematik.sewol.log.LogEntry;
import de.uni.freiburg.iig.telematik.sewol.log.LogTrace;
import de.uni.freiburg.iig.telematik.sewol.writer.PerspectiveException;
import iicmchecker.IICMChecker;

public class Main {
	
private static String rulelocation = "rulefiles";
/*
private static String[] rulefiles = {
				"example1" , "example2", "example3" , "example_definition_file" ,
				"IntraInstance_hierarchical" , "InterInstance_hierarchical", 
				"InterProcess_hierarchical", "IntraInstance_nonhierarchical",
			    "InterInstance_nonhierarchical", "InterProcess_nonhierarchical",
			    "negationrules", "rules", "orrules"
};*/

private static String[] rulefiles = {"arithmetic"};
private static String outputlocation = "prologfiles";
/*
 * severe Grundlegender Ablauf
 * warning 
 * info  Methodenbeginn
 * fine  Argumente
 */
private static Level loggerLevel = Level.WARNING; 
// TODO Logger Outputlocation
	
static IICMChecker checker;
  
public static void main(String[] args) {
	
	// TODO parse from args
	
	LogCreator lc = new LogCreator();
	List<List<Log<LogEntry>>> log1 = new ArrayList<List<Log<LogEntry>>>();
	try {
		log1 = lc.createLog();
	} catch (ParameterException | LockingException | PerspectiveException
			| IOException | ParserException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	System.out.println("Starting checker");
	checker = new IICMChecker();
	checker.setLoggerLevel(loggerLevel);
	checker.setRuleLocation(rulelocation);
	checker.setRuleFiles(rulefiles);
	checker.addLog(log1);
	checker.setOutputLocation(outputlocation);
	checker.run();
}
}
