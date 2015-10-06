package iicmchecker.storage.container.status;

import iicmchecker.storage.container.Fact;

public class ExecutedGroupStatus extends Fact {
	

	private static final int NUMBER_OF_ARGUMENTS = 2;
	
	/*
	 * role_executed( GT, TT)
	 */
	public ExecutedGroupStatus() {
		super("role_executed", NUMBER_OF_ARGUMENTS);
	}

	public ExecutedGroupStatus(String group, String taskID) {

		super("role_executed", NUMBER_OF_ARGUMENTS);
		setArgument(0, group);
		setArgument(1, taskID);
		
	}

}
