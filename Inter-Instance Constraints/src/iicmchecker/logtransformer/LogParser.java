package iicmchecker.logtransformer;

import java.util.List;

import de.invation.code.toval.parser.ParserException;
import de.invation.code.toval.validate.ParameterException;
import de.uni.freiburg.iig.telematik.sewol.log.LogEntry;
import de.uni.freiburg.iig.telematik.sewol.log.LogTrace;
import de.uni.freiburg.iig.telematik.sewol.parser.ParsingMode;
import de.uni.freiburg.iig.telematik.sewol.parser.xes.XESLogParser;

public class LogParser {
	
public List<List<LogTrace<LogEntry>>> parseLog(String loglocation, String logfile) {

	List<List<LogTrace<LogEntry>>> logs = null;
	
	// Parse Logs
	try {
		XESLogParser lp = new XESLogParser();
		logs = lp.parse(loglocation + "/" + logfile + ".mxml", ParsingMode.COMPLETE);
	
	} catch (ParameterException | ParserException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		System.exit(0);
	}
	return logs;
}
}
