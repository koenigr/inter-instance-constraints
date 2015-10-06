package iicmchecker.utils.logging;

import java.util.logging.Formatter;
import java.util.logging.LogRecord;

public class CFormatter extends Formatter{

	@Override
	public String format(LogRecord rec) {
	    StringBuffer buf = new StringBuffer(1000);

	    
	    buf.append(rec.getLevel());
	    buf.append(": ");
	    buf.append(formatMessage(rec));
	    buf.append("\n");

	    
	    return buf.toString();
	}

}
