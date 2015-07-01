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
		setArgument(0, taskID);
	}

	@Override
	public void setArgument(int pos, String arg) {
		if (pos == 0) {
			// TODO taskID
		}
		else if (pos == 1) {
			// TODO Datum
		}
		else if (pos >= NUMBER_OF_ARGUMENTS) {
			new IllegalArgumentsPositionException(pos, NUMBER_OF_ARGUMENTS - 1);
		}
	}
}
