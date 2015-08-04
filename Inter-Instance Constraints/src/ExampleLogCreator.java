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

public class ExampleLogCreator {

private static String loglocation = "logfiles"; 
private static String logfile = "examplelogfile";

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

		
/*
 * Create Log Traces
 */
System.out.println("Creating trace A");
LogTrace<LogEntry> traceA = new LogTrace<LogEntry>();
traceA.addEntry(entryA1);
/*
* Create Logs
*/
		
Log<LogEntry> log = new Log<LogEntry>();
log.addTrace(traceA);
		
// Serialize Logs
String fileName = loglocation + "/" + logfile;
LogWriter w = new LogWriter(LogFormatFactory.MXML(), fileName);
w.writeTrace(traceA);
w.closeFile();
		
		
}
}

