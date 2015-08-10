package iicmchecker.storage.container.status;

import iicmchecker.storage.container.Fact;

public class TaskWorkflow extends Fact{

	private static final int NUMBER_OF_ARGUMENTS = 2;
	private static final String NAME = "task_workflow";

	/*
	 * task_workflow(TT,WID)
	 */

	public TaskWorkflow(String taskID, String workflowID) {
		super( NAME, NUMBER_OF_ARGUMENTS);
		setArgument(0, taskID);
		setArgument(1, workflowID);
	}

}
