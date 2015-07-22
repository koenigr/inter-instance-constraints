import java.io.IOException;
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

public static void createLog() throws LockingException, 
	CompatibilityException, ParameterException, PerspectiveException, 
	IOException, ParserException {
		
LogEntry entryA1 = new LogEntry("Antrag empfangen");
entryA1.setEventType(EventType.start);
entryA1.setOriginator("Mark");
entryA1.setGroup("Kundenberater");
entryA1.setRole("Kundenberater");
entryA1.setTimestamp(new Date(499161600000l));
entryA1.addMetaAttribute(new DataAttribute("Kreditwunsch", 50000));

System.out.println(entryA1.getRole());
System.out.println(entryA1.getGroup());

LogEntry entryA2 = new LogEntry("Antrag empfangen");
entryA2.setEventType(EventType.complete);
entryA2.setOriginator("Mark");
entryA2.setGroup("Kundenberater");
entryA2.setRole("Kundenberater");
entryA2.setTimestamp(new Date(1445405280000l));
entryA2.addMetaAttribute(new DataAttribute("Kreditwunsch", 50000));

LogEntry entryB1 = new LogEntry("Antrag prüfen");
entryB1.setEventType(EventType.start);
entryB1.setOriginator("Susi");
entryB1.setGroup("Manager");
entryB1.setTimestamp(new Date(499136600000l));
		
LogEntry entryB2 = new LogEntry("Antrag prüfen");
entryB2.setEventType(EventType.complete);
entryB2.setOriginator("Susi");
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
traceB.addEntry(entryA1);
traceB.addEntry(entryA2);
traceB.addEntry(entryB1);
traceB.addEntry(entryB2);
traceB.addEntry(entryC1);
traceB.addEntry(entryC2);
		
/*
* Create Logs
*/
		
Log<LogEntry> log = new Log<LogEntry>();
log.addTrace(traceA);
log.addTrace(traceB);
		
// Serialize Logs
String fileName = loglocation + "/" + logfile;
LogWriter w = new LogWriter(LogFormatFactory.MXML(), fileName);
w.writeTrace(traceA);
w.writeTrace(traceB);
w.closeFile();
		
		
}
}

