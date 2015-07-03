package iicmchecker.storage.container.status;

import iicmchecker.storage.container.Fact;

public class TaskEvent extends Fact{

	private static final int NUMBER_OF_ARGUMENTS = 2;
	private static final String NAME = "task_name";

	/*
	 * task_event(TID, eventtype)
	 */
	public TaskEvent() {
		super(NAME, NUMBER_OF_ARGUMENTS);
	}

	public TaskEvent(String taskID, String name) {
		super(NAME, NUMBER_OF_ARGUMENTS);
		setArgument(0, taskID);
		setArgument(1, name);
	}
}
