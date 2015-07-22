package iicmchecker.storage.container.status;

import iicmchecker.storage.container.Fact;

public class WorkflowName extends Fact{
	
	private static final int NUMBER_OF_ARGUMENTS = 2;
	private static final String NAME = "workflow_name";
	
	/*
	 * workflowName( WID, WName)
	 */

	public WorkflowName(String workflowID, String workflowname, boolean neg) {
		super(NAME, NUMBER_OF_ARGUMENTS, neg);
		setArgument(0, workflowID);
		setArgument(1, workflowname);
	}

}
