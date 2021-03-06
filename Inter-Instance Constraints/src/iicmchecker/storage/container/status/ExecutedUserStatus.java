package iicmchecker.storage.container.status;

import iicmchecker.storage.container.Fact;

public class ExecutedUserStatus extends Fact {
	

	private static final int NUMBER_OF_ARGUMENTS = 2;
	
	/*
	 * user_executed(UT, TT)
	 */

	public ExecutedUserStatus(String user, String taskID) {
		super("user_executed", NUMBER_OF_ARGUMENTS);
		setArgument(0, user);
		setArgument(1, taskID);
	}

}
