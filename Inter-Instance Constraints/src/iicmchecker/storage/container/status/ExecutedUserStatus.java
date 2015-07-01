package iicmchecker.storage.container.status;

import iicmchecker.storage.container.Fact;

public class ExecutedUserStatus extends Fact {
	

	private static final int NUMBER_OF_ARGUMENTS = 2;
	
	/*
	 * executed_user(UT, TT)
	 */
	public ExecutedUserStatus() {
		super("executed_user", NUMBER_OF_ARGUMENTS);
	}

	public ExecutedUserStatus(String user, String taskID) {
		super("executed_user", NUMBER_OF_ARGUMENTS);
		setArgument(0, user);
		setArgument(1, taskID);
	}

}
