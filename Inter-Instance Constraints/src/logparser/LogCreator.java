package logparser;

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

	public List<List<LogTrace<LogEntry>>> createLog() throws LockingException, CompatibilityException, ParameterException, PerspectiveException, IOException, ParserException {

		Date d = new Date();
		d.setYear(2015);
		d.setMonth(5);
		d.setDate(2);
		
		LogEntry entryA = new LogEntry("check");
		entryA.setEventType(EventType.start);
		entryA.setOriginator("Mark");
		entryA.setGroup("Clerk");
		entryA.setTimestamp(d);
		
		
		LogEntry entryB = new LogEntry("pay");
		entryB.setEventType(EventType.complete);
		entryB.setOriginator("Susi");
		entryB.setGroup("Manager");
		entryB.setTimestamp(new Date(2145405300));
		entryB.addMetaAttribute(new DataAttribute("loan_amount", "2000"));
		
		DULogEntry entryC = new DULogEntry("send_mail");
		entryC.setEventType(EventType.start);
		entryC.setOriginator("Bob");
		entryC.setGroup("Admin");
		entryC.setTimestamp(d);
		
		LogEntry entryD = new LogEntry("check");
		entryD.setEventType(EventType.start);
		entryD.setOriginator("Mark");
		entryD.setGroup("Clerk");
		entryD.setTimestamp(d);
		
		LogEntry entryE = new LogEntry("check");
		entryE.setEventType(EventType.start);
		entryE.setOriginator("Mark");
		entryE.setGroup("Clerk");
		entryE.setTimestamp(d);
		
		LogEntry entryF = new LogEntry("pay");
		entryF.setEventType(EventType.complete);
		entryF.setOriginator("Susi");
		entryF.setGroup("Manager");
		entryF.setTimestamp(new Date(2145405300));
		entryF.addMetaAttribute(new DataAttribute("loan_amount", "2000"));
		
		LogEntry entryG = new LogEntry("pay");
		entryG.setEventType(EventType.complete);
		entryG.setOriginator("Susi");
		entryG.setGroup("Manager");
		entryG.setTimestamp(new Date(2145405300));
		entryG.addMetaAttribute(new DataAttribute("loan_amount", "2000"));
		
		LogEntry entryH = new LogEntry("send_mail");
		entryH.setEventType(EventType.complete);
		entryH.setOriginator("Stefania");
		entryH.setGroup("Marketing");
		entryH.setTimestamp(new Date(2145405300));
		entryH.addMetaAttribute(new DataAttribute("recipient", "chef"));
		
		LogEntry entryI = new LogEntry("send_mail");
		entryI.setEventType(EventType.complete);
		entryI.setOriginator("Lorenzo");
		entryI.setGroup("Secretary");
		entryI.setTimestamp(new Date(2145405300));
		entryI.addMetaAttribute(new DataAttribute("recipient", "customer"));
		
		LogEntry entryJ = new LogEntry("call_customer");
		entryJ.setEventType(EventType.complete);
		entryJ.setOriginator("Lorenzo");
		entryJ.setGroup("Secretary");
		entryJ.setTimestamp(new Date(2145405300));
		entryJ.addMetaAttribute(new DataAttribute("recipient", "customer"));
		
		/*
		 * Create Log Traces
		 */
		LogTrace<LogEntry> traceA = new LogTrace<LogEntry>();
		traceA.addEntry(entryA);
		traceA.addEntry(entryB);
		traceA.addEntry(entryF);
		
		LogTrace<LogEntry> traceB = new LogTrace<LogEntry>();
		traceB.addEntry(entryC);
		traceB.addEntry(entryD);
		traceB.addEntry(entryH);
		
		LogTrace<LogEntry> traceC = new LogTrace<LogEntry>();
		traceC.addEntry(entryE);
		traceC.addEntry(entryG);
		traceC.addEntry(entryI);
		traceC.addEntry(entryJ);
		
		
		/*
		 * Create Logs
		 */
		
		Log<LogEntry> log = new Log<LogEntry>();
		log.addTrace(traceA);
		log.addTrace(traceB);
		log.addTrace(traceC);
		
		
		// Serialize Logs
		String fileName = "./LogFileOutput";
		LogWriter w = new LogWriter(LogFormatFactory.MXML(), fileName);
		w.writeTrace(traceA);
		w.writeTrace(traceB);
		w.writeTrace(traceC);
		w.closeFile();
		
		// Parse Logs

		XESLogParser lp = new XESLogParser();
		List<List<LogTrace<LogEntry>>> logs = lp.parse(fileName + ".mxml", ParsingMode.COMPLETE);
		
		return logs;
	}
}
