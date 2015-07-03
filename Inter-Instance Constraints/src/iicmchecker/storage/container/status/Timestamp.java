package iicmchecker.storage.container.status;

import java.util.Date;

import iicmchecker.exceptions.IllegalArgumentsPositionException;
import iicmchecker.exceptions.InvalidVariableFormatException;
import iicmchecker.storage.container.Fact;
import iicmchecker.utils.StringChecker;

public class Timestamp extends Fact {
	
	private static final int NUMBER_OF_ARGUMENTS = 2;
	
	/*
	 * timestamp(TID, Timestamp)
	 */
	public Timestamp() {
		super("timestamp", NUMBER_OF_ARGUMENTS);
	}
	
	public Timestamp(String taskID, Date timestamp) {
		super("timestamp", NUMBER_OF_ARGUMENTS);
		
		long ms = timestamp.getTime();
			
		setArgument(0, taskID);
		setArgument(1, String.valueOf(ms));
	}

}
