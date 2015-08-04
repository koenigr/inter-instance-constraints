package iicmchecker.utils;

public class EventHelper {
	
	public static enum EventTypes {
	  	ASSIGN, ATE_ABORT, AUTOSKIP, COMPLETE, MANUAL_SKIP, PI_ABORT,
	  	REASSIGN, RESUME, SCHEDULE, START, SUSPEND, WITHDRAW  	
	}
	
   public static String getAsString(EventTypes e) {
	switch (e) {
		case ASSIGN		:    return "'assign'"; 
		case ATE_ABORT	:    return "'abort'"; 
	    case AUTOSKIP	:    return "'skip'";
	    case COMPLETE	:    return "'complete'";
	    case MANUAL_SKIP:    return "'skip'";
	    case PI_ABORT	:    return "'pi abort'";
	    case REASSIGN	:    return "'reassign'"; 
	    case RESUME		:    return "'resume'"; 
	    case SCHEDULE	:    return "'schedule'"; 
	    case START		:    return "'start'"; 
	    case SUSPEND	:    return "'suspend'"; 
	    case WITHDRAW	:	 return "'withdraw'"; 
	    default: System.out.println("Found illegal eventtype"); System.exit(0); // TODO
	}
	return null;
	   
   }
}
