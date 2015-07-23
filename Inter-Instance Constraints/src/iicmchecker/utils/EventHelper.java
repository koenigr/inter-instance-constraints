package iicmchecker.storage;

public class EventHelper {
	
	public static enum EventTypes {
	  	ASSIGN, ATE_ABORT, AUTOSKIP, COMPLETE, MANUAL_SKIP, PI_ABORT,
	  	REASSIGN, RESUME, SCHEDULE, START, SUSPEND, WITHDRAW  	
	}
	
   public static String getAsString(EventTypes e) {
	switch (e) {
		case ASSIGN		:    return "'assigned'"; 
		case ATE_ABORT	:    return "'aborted'"; 
	    case AUTOSKIP	:    return "'skipped'";
	    case COMPLETE	:    return "'complete'";
	    case MANUAL_SKIP:    return "'skipped'";
	    case PI_ABORT	:    return "'aborted'";
	    case REASSIGN	:    return "'reassigned'"; 
	    case RESUME		:    return "'resumed'"; 
	    case SCHEDULE	:    return "'scheduled'"; 
	    case START		:    return "'started'"; 
	    case SUSPEND	:    return "'suspended'"; 
	    case WITHDRAW	:	 return "'withdrawn'"; 
	    default: System.out.println("Found illegal eventtype"); System.exit(0); // TODO
	}
	return null;
	   
   }
}
