package iicmchecker.storage.container.status;

import iicmchecker.storage.container.Fact;

public class TaskName extends Fact{

	private static final int NUMBER_OF_ARGUMENTS = 2;
	private static final String NAME = "task_name";

	/*
	 * task_name(TID, TNAME)
	 */

	public TaskName(String taskID, String name, boolean neg) {
		super(NAME, NUMBER_OF_ARGUMENTS, neg);
		setArgument(0, taskID);
		setArgument(1, name);
	}
}
