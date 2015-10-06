package main;

import iicmchecker.utils.logging.LoggerFactory;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
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

public class LogCreatorForC9 {

private static Logger logger = LoggerFactory.getLogger();

public List<List<Log<LogEntry>>> createLog() throws LockingException, 
	CompatibilityException, ParameterException, PerspectiveException, 
	IOException, ParserException {
		
LogEntry entryA = new LogEntry("Antrag empfangen 1");
entryA.setOriginator("Mark");
entryA.setTimestamp(new Date(1440680241000l));

LogEntry entryB = new LogEntry("Antrag empfangen 2");
entryB.setEventType(EventType.start);
entryB.setOriginator("Mark");
entryB.setTimestamp(new Date(1440683841000l));

LogEntry entryC = new LogEntry("Antrag empfangen 3");
entryC.setEventType(EventType.start);
entryC.setOriginator("Mark");
entryC.setTimestamp(new Date(1440687441000l));

LogEntry entryD = new LogEntry("Antrag empfangen 4");
entryD.setEventType(EventType.start);
entryD.setOriginator("Mark");
entryD.setTimestamp(new Date(1440687481000l));

LogEntry entryE = new LogEntry("Antrag empfangen 5");
entryE.setEventType(EventType.start);
entryE.setOriginator("Mark");
entryE.setTimestamp(new Date(1440687581000l));

LogEntry entryF = new LogEntry("Antrag empfangen 6");
entryF.setEventType(EventType.start);
entryF.setOriginator("Mark");
entryF.setTimestamp(new Date(1440687781000l));

		
/*
 * Create Log Traces
 */
logger.info("Creating Log Trace for C9");
LogTrace<LogEntry> traceA = new LogTrace<LogEntry>();
traceA.addEntry(entryA);
traceA.addEntry(entryB);
traceA.addEntry(entryC);
traceA.addEntry(entryD);
traceA.addEntry(entryE);
traceA.addEntry(entryF);
		
/*
* Create Logs
*/
		
Log<LogEntry> log = new Log<LogEntry>();
log.addTrace(traceA);


List l1 = new ArrayList<List>();
List l2 = new ArrayList<Log>();
l2.add(log);
l1.add(l2);	

logger.info("finished creation of Log for C9");
return l1;		
}
}

