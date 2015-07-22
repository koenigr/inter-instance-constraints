package iicmchecker.storage.container.status;

import iicmchecker.storage.container.Fact;

public class ExecutedUserStatus extends Fact {
	

	private static final int NUMBER_OF_ARGUMENTS = 2;
	
	/*
	 * executed_user(UT, TT)
	 */

	public ExecutedUserStatus(String user, String taskID, boolean neg) {
		super("user_executed", NUMBER_OF_ARGUMENTS, neg);
		setArgument(0, user);
		setArgument(1, taskID);
	}

}
