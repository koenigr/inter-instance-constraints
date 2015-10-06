package iicmchecker.storage.container.status;

import java.util.Date;

import iicmchecker.storage.container.Fact;

public class Timestamp extends Fact {
	
	private static final int NUMBER_OF_ARGUMENTS = 2;
	
	/*
	 * timestamp(TID, Timestamp in ms)
	 */
	
	public Timestamp(String taskID, Date timestamp) {
		super("timestamp", NUMBER_OF_ARGUMENTS);
		
		long ms = timestamp.getTime();
			
		setArgument(0, taskID);
		setArgument(1, String.valueOf(ms));
	}

	public Timestamp(String taskID, String timestamp) {

		super("timestamp", NUMBER_OF_ARGUMENTS);
		
		setArgument(0, taskID);
		setArgument(1, timestamp);
	}

}
