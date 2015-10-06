package main;

import iicmchecker.utils.logging.LoggerFactory;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import de.invation.code.toval.parser.ParserException;
import de.invation.code.toval.validate.CompatibilityException;
import de.invation.code.toval.validate.ParameterException;
import de.uni.freiburg.iig.telematik.sewol.log.DataAttribute;
import de.uni.freiburg.iig.telematik.sewol.log.EventType;
import de.uni.freiburg.iig.telematik.sewol.log.LockingException;
import de.uni.freiburg.iig.telematik.sewol.log.Log;
import de.uni.freiburg.iig.telematik.sewol.log.LogEntry;
import de.uni.freiburg.iig.telematik.sewol.log.LogTrace;
import de.uni.freiburg.iig.telematik.sewol.writer.PerspectiveException;

public class LogCreatorForC5 {

private static Logger logger = LoggerFactory.getLogger();


public List<List<Log<LogEntry>>> createLog() throws LockingException, 
	CompatibilityException, ParameterException, PerspectiveException, 
	IOException, ParserException {
		

LogEntry entryA1 = new LogEntry("Antrag prüfen 1");
entryA1.setEventType(EventType.complete);
entryA1.setOriginator("Susi");
entryA1.setRole("Kundenberater");
entryA1.addMetaAttribute(new DataAttribute("Kreditwunsch", 5000));
entryA1.addMetaAttribute(new DataAttribute("Kunde", "Tom"));

LogEntry entryA2 = new LogEntry("Antrag prüfen 2");
entryA2.setEventType(EventType.complete);
entryA2.setOriginator("Susi");
entryA2.setRole("Kundenberater");
entryA2.addMetaAttribute(new DataAttribute("Kreditwunsch", 5000));
entryA2.addMetaAttribute(new DataAttribute("Kunde", "Tom"));

		
/*
 * Create Log Traces
 */
logger.info("Creating Log Trace for C5");
LogTrace<LogEntry> traceA = new LogTrace<LogEntry>();
traceA.addEntry(entryA1);
traceA.addEntry(entryA2);
		
/*
* Create Logs
*/
		
Log<LogEntry> log = new Log<LogEntry>();
log.addTrace(traceA);


List l1 = new ArrayList<List>();
List l2 = new ArrayList<Log>();
l2.add(log);
l1.add(l2);	

logger.info("Finished creation of log trace for C5");
return l1;		
}
}

