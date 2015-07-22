package iicmchecker.storage.container.status;

import iicmchecker.storage.container.Fact;

public class ExecutedGroupStatus extends Fact {
	

	private static final int NUMBER_OF_ARGUMENTS = 2;
	
	private static boolean negation = false;
	
	/*
	 * executedGroup( GT, TT)
	 */
	public ExecutedGroupStatus() {
		super("executed_group", NUMBER_OF_ARGUMENTS, negation);
	}

	public ExecutedGroupStatus(String group, String taskID, boolean neg) {

		super("group_executed", NUMBER_OF_ARGUMENTS, neg);
		setArgument(0, group);
		setArgument(1, taskID);
		
	}

}
