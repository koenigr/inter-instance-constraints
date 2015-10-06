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

public class LogCreatorForC6 {

private static Logger logger = LoggerFactory.getLogger();

public List<List<Log<LogEntry>>> createLog() throws LockingException, 
	CompatibilityException, ParameterException, PerspectiveException, 
	IOException, ParserException {
		
LogEntry entryA1 = new LogEntry("Antrag prüfen 1");
entryA1.setEventType(EventType.start);
entryA1.setOriginator("Mark");
entryA1.addMetaAttribute(new DataAttribute("Kreditwunsch", 40000));
entryA1.addMetaAttribute(new DataAttribute("Kunde", "Kunde12"));

LogEntry entryA2 = new LogEntry("Antrag prüfen 1");
entryA2.setEventType(EventType.complete);
entryA2.setOriginator("Mark");
entryA2.addMetaAttribute(new DataAttribute("Kreditwunsch", 40000));
entryA2.addMetaAttribute(new DataAttribute("Kunde", "Kunde12"));
		
LogEntry entryC1 = new LogEntry("Antrag prüfen 1");
entryC1.setEventType(EventType.start);
entryC1.setOriginator("Mark");
entryC1.addMetaAttribute(new DataAttribute("Kreditwunsch", 40000));
entryC1.addMetaAttribute(new DataAttribute("Kunde", "Kunde12"));

LogEntry entryC2 = new LogEntry("Antrag prüfen 1");
entryC2.setEventType(EventType.start);
entryC2.setOriginator("Mark");
entryC2.addMetaAttribute(new DataAttribute("Kreditwunsch", 40000));
entryC2.addMetaAttribute(new DataAttribute("Kunde", "Kunde12"));
		

		
/*
 * Create Log Traces
 */
logger.info("Creating Log Trace for C6");
LogTrace<LogEntry> traceA = new LogTrace<LogEntry>();
traceA.addEntry(entryA1);
LogTrace<LogEntry> traceB = new LogTrace<LogEntry>();
traceB.addEntry(entryA2);
LogTrace<LogEntry> traceC = new LogTrace<LogEntry>();
traceC.addEntry(entryC1);
LogTrace<LogEntry> traceD = new LogTrace<LogEntry>();
traceD.addEntry(entryC1);
		
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

logger.info("Finished creation for C6");
return l1;		
}
}

