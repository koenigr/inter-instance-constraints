package main;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import de.invation.code.toval.parser.ParserException;
import de.invation.code.toval.validate.CompatibilityException;
import de.invation.code.toval.validate.ParameterException;
import de.uni.freiburg.iig.telematik.sewol.format.LogFormatFactory;
import de.uni.freiburg.iig.telematik.sewol.log.DULogEntry;
import de.uni.freiburg.iig.telematik.sewol.log.DataAttribute;
import de.uni.freiburg.iig.telematik.sewol.log.EventType;
import de.uni.freiburg.iig.telematik.sewol.log.LockingException;
import de.uni.freiburg.iig.telematik.sewol.log.Log;
import de.uni.freiburg.iig.telematik.sewol.log.LogEntry;
import de.uni.freiburg.iig.telematik.sewol.log.LogTrace;
import de.uni.freiburg.iig.telematik.sewol.parser.ParsingMode;
import de.uni.freiburg.iig.telematik.sewol.parser.xes.XESLogParser;
import de.uni.freiburg.iig.telematik.sewol.writer.LogWriter;
import de.uni.freiburg.iig.telematik.sewol.writer.PerspectiveException;

public class LogCreator {

private static String loglocation = "logfiles"; 
private static String logfile = "logfile";

public static void main(String[] args) {
	try {
		createLog();
	} catch (ParameterException | LockingException | PerspectiveException
			| IOException | ParserException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}

public static List<List<Log<LogEntry>>> createLog() throws LockingException, 
	CompatibilityException, ParameterException, PerspectiveException, 
	IOException, ParserException {
		
LogEntry entryA1 = new LogEntry("Antrag empfangen");
entryA1.setEventType(EventType.start);
entryA1.setOriginator("Mark");
entryA1.setGroup("Kundenberater");
entryA1.setRole("Kundenberater");
entryA1.setTimestamp(new Date(499161600000l));
entryA1.addMetaAttribute(new DataAttribute("Kreditwunsch", 5000));

LogEntry entryA2 = new LogEntry("Antrag empfangen");
entryA2.setEventType(EventType.complete);
entryA2.setOriginator("Mark");
entryA2.setGroup("Kundenberater");
entryA2.setRole("Kundenberater");
entryA2.setTimestamp(new Date(1445405280000l));
entryA2.addMetaAttribute(new DataAttribute("Kreditwunsch", 5000));


LogEntry entryB1 = new LogEntry("Antrag prüfen 1");
entryB1.setEventType(EventType.start);
entryB1.setOriginator("Mark");
entryB1.setGroup("Manager");
entryB1.setTimestamp(new Date(499136600000l));
		
LogEntry entryB2 = new LogEntry("Antrag prüfen 1");
entryB2.setEventType(EventType.complete);
entryB2.setOriginator("Mark");
entryB2.setGroup("Manager");
entryB2.setTimestamp(new Date(499461600000l));
		
LogEntry entryC1 = new LogEntry("Vertrag vorbereiten");
entryC1.setEventType(EventType.start);
entryC1.setOriginator("Susi");
entryC1.setGroup("Manager");
entryC1.setTimestamp(new Date(499536600000l));
		
LogEntry entryC2 = new LogEntry("Vertrag vorbereiten");
entryC2.setEventType(EventType.complete);
entryC2.setOriginator("Susi");
entryC2.setGroup("Manager");
entryC2.setTimestamp(new Date(499537600000l));

// 2nd trace
LogEntry entry2A1 = new LogEntry("Antrag empfangen");
entry2A1.setEventType(EventType.start);
entry2A1.setOriginator("Mark");
entry2A1.setGroup("Kundenberater");
entry2A1.setRole("Kundenberater");
entry2A1.setTimestamp(new Date(499161600000l));
entry2A1.addMetaAttribute(new DataAttribute("Kreditwunsch", 60000));

LogEntry entry2A2 = new LogEntry("Antrag empfangen");
entry2A2.setEventType(EventType.complete);
entry2A2.setOriginator("Mark");
entry2A2.setGroup("Kundenberater");
entry2A2.setRole("Kundenberater");
entry2A2.setTimestamp(new Date(1445405280000l));
entry2A2.addMetaAttribute(new DataAttribute("Kreditwunsch", 60000));

LogEntry entry2B1 = new LogEntry("Antrag prüfen 1");
entry2B1.setEventType(EventType.start);
entry2B1.setOriginator("Mark");
entry2B1.setGroup("Manager");
entry2B1.setTimestamp(new Date(499136600000l));
		
LogEntry entry2B2 = new LogEntry("Antrag prüfen 1");
entry2B2.setEventType(EventType.complete);
entry2B2.setOriginator("Mark");
entry2B2.setGroup("Manager");
entry2B2.setTimestamp(new Date(499461600000l));

LogEntry entry2B3 = new LogEntry("Antrag prüfen 2");
entry2B3.setEventType(EventType.start);
entry2B3.setOriginator("Mark");
entry2B3.setGroup("Manager");
entry2B3.setTimestamp(new Date(499136600000l));
		
LogEntry entry2B4 = new LogEntry("Antrag prüfen 2");
entry2B4.setEventType(EventType.complete);
entry2B4.setOriginator("Mark");
entry2B4.setGroup("Manager");
entry2B4.setTimestamp(new Date(499461600000l));
		
LogEntry entry2C1 = new LogEntry("Vertrag vorbereiten");
entry2C1.setEventType(EventType.start);
entry2C1.setOriginator("Susi");
entry2C1.setGroup("Manager");
entry2C1.setTimestamp(new Date(499536600000l));
		
LogEntry entry2C2 = new LogEntry("Vertrag vorbereiten");
entry2C2.setEventType(EventType.complete);
entry2C2.setOriginator("Susi");
entry2C2.setGroup("Manager");
entry2C2.setTimestamp(new Date(499537600000l));
		
/*
 * Create Log Traces
 */
System.out.println("Creating trace A");
LogTrace<LogEntry> traceA = new LogTrace<LogEntry>();
traceA.addEntry(entryA1);
traceA.addEntry(entryA2);
traceA.addEntry(entryB1);
traceA.addEntry(entryB2);
traceA.addEntry(entryC1);
traceA.addEntry(entryC2);

System.out.println("Creating trace B");
LogTrace<LogEntry> traceB = new LogTrace<LogEntry>();
traceB.addEntry(entry2A1);
traceB.addEntry(entry2A2);
traceB.addEntry(entry2B1);
traceB.addEntry(entry2B2);
traceB.addEntry(entry2B3);
traceB.addEntry(entry2B4);
traceB.addEntry(entry2C1);
traceB.addEntry(entry2C2);
		
/*
* Create Logs
*/
		
Log<LogEntry> log = new Log<LogEntry>();
log.addTrace(traceA);
log.addTrace(traceB);


List l1 = new ArrayList<List>();
List l2 = new ArrayList<Log>();
l2.add(log);
l1.add(l2);	

System.out.println("finished creation");
return l1;		
}
}

