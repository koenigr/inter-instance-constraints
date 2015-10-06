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
import de.uni.freiburg.iig.telematik.sewol.log.DataAttribute;
import de.uni.freiburg.iig.telematik.sewol.log.EventType;
import de.uni.freiburg.iig.telematik.sewol.log.LockingException;
import de.uni.freiburg.iig.telematik.sewol.log.Log;
import de.uni.freiburg.iig.telematik.sewol.log.LogEntry;
import de.uni.freiburg.iig.telematik.sewol.log.LogTrace;
import de.uni.freiburg.iig.telematik.sewol.writer.PerspectiveException;

public class LogCreatorForC7 {

private static Logger logger = LoggerFactory.getLogger();


public List<List<Log<LogEntry>>> createLog() throws LockingException, 
	CompatibilityException, ParameterException, PerspectiveException, 
	IOException, ParserException {
		
LogEntry entryA1 = new LogEntry("Antrag annehmen");
entryA1.setEventType(EventType.start);
entryA1.setOriginator("A142");
entryA1.setRole("Kundenberater");
entryA1.setTimestamp(new Date(1440077732000l));
entryA1.addMetaAttribute(new DataAttribute("Kreditwunsch", 5000));

		
LogEntry entryC2 = new LogEntry("Antrag prüfen 1");
entryC2.setEventType(EventType.complete);
entryC2.setOriginator("A524");
entryC2.setRole("Kundenberater");
entryC2.setTimestamp(new Date(1440683852000l));

		
/*
 * Create Log Traces
 */
logger.info("Creating Log Trace for C7");
LogTrace<LogEntry> traceA = new LogTrace<LogEntry>();
traceA.addEntry(entryA1);
traceA.addEntry(entryC2);
LogTrace<LogEntry> traceB = new LogTrace<LogEntry>();
traceB.addEntry(entryA1);
traceB.addEntry(entryC2);
LogTrace<LogEntry> traceC = new LogTrace<LogEntry>();
traceC.addEntry(entryA1);
traceC.addEntry(entryC2);
LogTrace<LogEntry> traceD = new LogTrace<LogEntry>();
traceD.addEntry(entryA1);
traceD.addEntry(entryC2);
		
/*
* Create Logs
*/
		
Log<LogEntry> log = new Log<LogEntry>();
log.addTrace(traceA);
log.addTrace(traceB);
log.addTrace(traceC);
log.addTrace(traceD);


List l1 = new ArrayList<List>();
List l2 = new ArrayList<Log>();
l2.add(log);
l1.add(l2);	

logger.info("finished creation");
return l1;		
}
}

