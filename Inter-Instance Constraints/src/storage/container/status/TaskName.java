package storage.container.status;

import storage.container.Fact;

public class TaskName extends Fact{

	private static final int NUMBER_OF_ARGUMENTS = 2;
	private static final String NAME = "task_name";

	/*
	 * task_name(TID, TNAME)
	 */
	public TaskName() {
		super(NAME, NUMBER_OF_ARGUMENTS);
	}

	public TaskName(String taskID, String name) {
		super(NAME, NUMBER_OF_ARGUMENTS);
		setArgument(0, taskID);
		setArgument(1, name);
	}
}
