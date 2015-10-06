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

public class LogCreatorForC1 {

private static Logger logger = LoggerFactory.getLogger();


public List<List<Log<LogEntry>>> createLog() throws LockingException, 
	CompatibilityException, ParameterException, PerspectiveException, 
	IOException, ParserException {
		
LogEntry entryA1 = new LogEntry("Antrag empfangen");
entryA1.setEventType(EventType.start);
entryA1.setOriginator("Mark");
entryA1.setRole("Azubi");
entryA1.setTimestamp(new Date(499161600000l));
entryA1.addMetaAttribute(new DataAttribute("Kreditwunsch", 5000));

LogEntry entryA2 = new LogEntry("Antrag empfangen");
entryA2.setEventType(EventType.complete);
entryA2.setOriginator("Mark");
entryA2.setRole("Azubi");
entryA2.setTimestamp(new Date(1445405280000l));
entryA2.addMetaAttribute(new DataAttribute("Kreditwunsch", 5000));


LogEntry entryB1 = new LogEntry("Antrag prüfen 1");
entryB1.setEventType(EventType.start);
entryB1.setOriginator("Mark");
entryB1.setRole("Manager");
entryB1.setTimestamp(new Date(499136600000l));
		
LogEntry entryB2 = new LogEntry("Antrag prüfen 1");
entryB2.setEventType(EventType.complete);
entryB2.setOriginator("Mark");
entryB2.setRole("Manager");
entryB2.setTimestamp(new Date(499461600000l));
		
LogEntry entryC1 = new LogEntry("Kunde kontaktieren");
entryC1.setEventType(EventType.start);
entryC1.setOriginator("Susi");
entryC1.setRole("Manager");
entryC1.setTimestamp(new Date(499536600000l));
		
LogEntry entryC2 = new LogEntry("Kunde kontaktieren");
entryC2.setEventType(EventType.complete);
entryC2.setOriginator("Susi");
entryC2.setRole("Manager");
entryC2.setTimestamp(new Date(499537600000l));

		
/*
 * Create Log Traces
 */
logger.info("Creating Log Trace for C1");
LogTrace<LogEntry> traceA = new LogTrace<LogEntry>();
traceA.addEntry(entryA1);
traceA.addEntry(entryA2);
traceA.addEntry(entryB1);
traceA.addEntry(entryB2);
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

logger.info("finished creation");
return l1;		
}
}

