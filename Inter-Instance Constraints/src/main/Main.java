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

private static String[] rulefiles = {"concrete"};
private static String outputlocation = "prologfiles";


private static Level loggerLevel = Level.ALL; 
	
static IICMChecker checker;
  
public static void main(String[] args) {
	
	
	LogCreatorForC1 lc1 = new LogCreatorForC1();
	LogCreatorForC2 lc2 = new LogCreatorForC2();
	LogCreatorForC3 lc3 = new LogCreatorForC3();
	LogCreatorForC4 lc4 = new LogCreatorForC4();
	LogCreatorForC5 lc5 = new LogCreatorForC5();
	LogCreatorForC6 lc6 = new LogCreatorForC6();
	LogCreatorForC7 lc7 = new LogCreatorForC7();
	LogCreatorForC8 lc8 = new LogCreatorForC8();
	LogCreatorForC9 lc9 = new LogCreatorForC9();
	
	List<List<Log<LogEntry>>> log_for_c1 = new ArrayList<List<Log<LogEntry>>>();
	List<List<Log<LogEntry>>> log_for_c2 = new ArrayList<List<Log<LogEntry>>>();
	List<List<Log<LogEntry>>> log_for_c3 = new ArrayList<List<Log<LogEntry>>>();
	List<List<Log<LogEntry>>> log_for_c4 = new ArrayList<List<Log<LogEntry>>>();
	List<List<Log<LogEntry>>> log_for_c5 = new ArrayList<List<Log<LogEntry>>>();
	List<List<Log<LogEntry>>> log_for_c6 = new ArrayList<List<Log<LogEntry>>>();
	List<List<Log<LogEntry>>> log_for_c7 = new ArrayList<List<Log<LogEntry>>>();
	List<List<Log<LogEntry>>> log_for_c8 = new ArrayList<List<Log<LogEntry>>>();
	List<List<Log<LogEntry>>> log_for_c9 = new ArrayList<List<Log<LogEntry>>>();
	
	try {
		log_for_c1 = lc1.createLog();
		log_for_c2 = lc2.createLog();
		log_for_c3 = lc3.createLog();
		log_for_c4 = lc4.createLog();
		log_for_c5 = lc5.createLog();
		log_for_c6 = lc6.createLog();
		log_for_c7 = lc7.createLog();
		log_for_c8 = lc8.createLog();
		log_for_c9 = lc9.createLog();
	} catch (ParameterException | LockingException | PerspectiveException
			| IOException | ParserException e) {
		e.printStackTrace();
	}
	
	System.out.println("Starting checker");
	checker = new IICMChecker();
	checker.setLoggerLevel(loggerLevel);
	checker.setRuleLocation(rulelocation);
	checker.setRuleFiles(rulefiles);
	checker.addLog(log_for_c1);
	// checker.addLog(log_for_c2);
	// checker.addLog(log_for_c3);
	// checker.addLog(log_for_c4);
	// checker.addLog(log_for_c5);
	// checker.addLog(log_for_c6);
	// checker.addLog(log_for_c7);
	// checker.addLog(log_for_c8);
	//checker.addLog(log_for_c9);
	checker.setOutputLocation(outputlocation);
	checker.run();
}
}
