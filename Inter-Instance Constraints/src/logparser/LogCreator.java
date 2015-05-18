package logparser;

import java.io.IOException;
import java.util.Date;
import java.util.List;

import de.invation.code.toval.parser.ParserException;
import de.invation.code.toval.types.DataUsage;
import de.invation.code.toval.validate.CompatibilityException;
import de.invation.code.toval.validate.ParameterException;
import de.uni.freiburg.iig.telematik.jawl.format.LogFormatFactory;
import de.uni.freiburg.iig.telematik.jawl.log.DULogEntry;
import de.uni.freiburg.iig.telematik.jawl.log.DataAttribute;
import de.uni.freiburg.iig.telematik.jawl.log.EventType;
import de.uni.freiburg.iig.telematik.jawl.log.LockingException;
import de.uni.freiburg.iig.telematik.jawl.log.Log;
import de.uni.freiburg.iig.telematik.jawl.log.LogEntry;
import de.uni.freiburg.iig.telematik.jawl.log.LogTrace;
import de.uni.freiburg.iig.telematik.jawl.log.LogTraceUtils;
import de.uni.freiburg.iig.telematik.jawl.parser.ParsingMode;
import de.uni.freiburg.iig.telematik.jawl.parser.xes.XESLogParser;
import de.uni.freiburg.iig.telematik.jawl.writer.LogWriter;
import de.uni.freiburg.iig.telematik.jawl.writer.PerspectiveException;

public class LogCreator {

	public List<List<LogTrace<LogEntry>>> createLog() throws LockingException, CompatibilityException, ParameterException, PerspectiveException, IOException, ParserException {
		LogEntry entryA = new LogEntry("activity_1");
		entryA.setEventType(EventType.start);
		entryA.setOriginator("user_1");
		entryA.setGroup("role_1");
		entryA.setTimestamp(new Date(1445405281));
		
		System.out.println(entryA);
		
		LogEntry entryB = new LogEntry("activity_2");
		entryB.setEventType(EventType.complete);
		entryB.setOriginator("user_1");
		entryB.setGroup("role_1");
		entryB.setTimestamp(new Date(2145405300));
		entryB.addMetaAttribute(new DataAttribute("desc", "Marty McFly arrives at the year 1985"));
		
		System.out.println(entryB);
		
		DULogEntry entryC = new DULogEntry("activity_3");
		entryC.setEventType(EventType.start);
		entryC.setOriginator("sub_1");
		entryC.setGroup("role_1");
		entryC.addDataUsage(new DataAttribute("fluxsettings"), DataUsage.READ);
		
		LogTrace<LogEntry> traceA = new LogTrace<LogEntry>();
		traceA.addEntry(entryA);
		traceA.addEntry(entryB);
		System.out.println(traceA);
		
		LogTrace<LogEntry> traceB = LogTraceUtils.createTraceFromActivities(3, "activity_3","activity_4", "activity_5", "activity_6");
		System.out.println(traceB);
		
		Log<LogEntry> log = new Log<LogEntry>();
		log.addTrace(traceA);
		log.addTrace(traceB);
		
		System.out.println(log.getSummary().getActivities());
		System.out.println(log.getSummary().getOriginators());
		
		// Serialize Logs
		String fileName = "./LogFileOutput";
		LogWriter w = new LogWriter(LogFormatFactory.MXML(), fileName);
		w.writeTrace(traceA);
		w.writeTrace(traceB);
		w.closeFile();
		
		// Parse Logs

		XESLogParser lp = new XESLogParser();
		List<List<LogTrace<LogEntry>>> logs = lp.parse(fileName + ".mxml", ParsingMode.COMPLETE);
		
		return logs;
	}
}
