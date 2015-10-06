package main;

import iicmchecker.utils.logging.LoggerFactory;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import de.invation.code.toval.parser.ParserException;
import de.invation.code.toval.validate.CompatibilityException;
import de.invation.code.toval.validate.ParameterException;
import de.uni.freiburg.iig.telematik.sewol.log.EventType;
import de.uni.freiburg.iig.telematik.sewol.log.LockingException;
import de.uni.freiburg.iig.telematik.sewol.log.Log;
import de.uni.freiburg.iig.telematik.sewol.log.LogEntry;
import de.uni.freiburg.iig.telematik.sewol.log.LogTrace;
import de.uni.freiburg.iig.telematik.sewol.writer.PerspectiveException;

public class LogCreatorForC3 {

private static Logger logger = LoggerFactory.getLogger();


public List<List<Log<LogEntry>>> createLog() throws LockingException, 
	CompatibilityException, ParameterException, PerspectiveException, 
	IOException, ParserException {

LogEntry entryA2 = new LogEntry("Antrag empfangen");
entryA2.setEventType(EventType.complete);
entryA2.setRole("Kundenberater");
entryA2.setOriginator("Mark");
		
LogEntry entryC1 = new LogEntry("Antrag prüfen 1");
entryC1.setEventType(EventType.complete);
entryC1.setOriginator("Mark");
		
LogEntry entryC2 = new LogEntry("Antrag prüfen 2");
entryC2.setEventType(EventType.complete);
entryC2.setOriginator("Mark");

		
/*
 * Create Log Traces
 */
logger.info("Creating Log Trace for C3");
LogTrace<LogEntry> traceA = new LogTrace<LogEntry>();
traceA.addEntry(entryA2);
traceA.addEntry(entryC1);
traceA.addEntry(entryC2);
		
/*
* Create Logs
*/
		
Log<LogEntry> log = new Log<LogEntry>();
log.addTrace(traceA);


List l1 = new ArrayList<List>();
List l2 = new ArrayList<Log>();
l2.add(log);
l1.add(l2);	

logger.info("Finished creation of log trace for C3");
return l1;		
}
}

