package iicmchecker.storage.container.status;

import iicmchecker.storage.container.Fact;
import iicmchecker.utils.StringChecker;

public class TaskEvent extends Fact{

	private static final int NUMBER_OF_ARGUMENTS = 2;
	private static final String NAME = "task_event";

	/*
	 * task_event(TID, eventtype)
	 */

	public TaskEvent(String taskID, String name, boolean neg) {
		super(NAME, NUMBER_OF_ARGUMENTS, neg);
		setArgument(0, taskID);
		setArgument(1, StringChecker.convertToValidConstant(name));
	}
}
