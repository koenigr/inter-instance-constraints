package logparser;

import java.io.File;
import java.util.Iterator;
import java.util.List;

import de.invation.code.toval.parser.ParserException;
import de.invation.code.toval.validate.ParameterException;
import de.uni.freiburg.iig.telematik.sewol.log.LogEntry;
import de.uni.freiburg.iig.telematik.sewol.log.LogTrace;
import de.uni.freiburg.iig.telematik.sewol.parser.ParsingMode;
import de.uni.freiburg.iig.telematik.sewol.parser.xes.XESLogParser;

public class LogParser {
	
public void parseLog() {
	XESLogParser lp = new XESLogParser();
	System.out.println(System.getProperty("user.dir"));
	File file = new File("logfiles/test.mxml");
	System.out.println(lp.canParse(file));
	List<List<LogTrace<LogEntry>>> result = null;
	try {
		result = lp.parse(file, ParsingMode.COMPLETE);
	} catch (ParameterException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (ParserException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	System.out.println(result.size());
	Iterator<List<LogTrace<LogEntry>>> rIt = result.iterator();
	while (rIt.hasNext()) {
		List<LogTrace<LogEntry>> scndres = rIt.next();
		Iterator scndIt = scndres.iterator();
		while (scndIt.hasNext()) {
			System.out.println("\nNew Trace started: ");
			LogTrace<LogEntry> trace = (LogTrace<LogEntry>) scndIt.next();
			System.out.println("activities: " + trace.getActivities().toString());
			System.out.println("case number: " + trace.getCaseNumber());
			System.out.println("num of similar instances: " + trace.getNumberOfSimilarInstances());
			System.out.println("dist activities: " + trace.getDistinctActivities().toString());
			System.out.println("entries: " + trace.getEntries().toString());
			System.out.println("similar instances:  " + trace.getSimilarInstances().toString());
		}
	}
	
	System.out.println(result.get(0).get(0).getActivities().toString());
}
}
