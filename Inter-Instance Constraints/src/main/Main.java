package main;

import java.util.logging.Level;

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

private static String[] rulefiles = {"concrete"};
private static String loglocation = "logfiles";
private static String[] logfiles = {"logfile"};
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
	
	checker = new IICMChecker();
	checker.setLoggerLevel(loggerLevel);
	checker.setRuleLocation(rulelocation);
	checker.setRuleFiles(rulefiles);
	checker.setLogLocation(loglocation);
	checker.setLogFiles(logfiles);
	checker.setOutputLocation(outputlocation);
	checker.run();
}
}
