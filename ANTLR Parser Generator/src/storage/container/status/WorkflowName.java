package storage.container.status;

import storage.container.Facts;

public class WorkflowName implements Facts{
	
	String workflowID;
	String workflow;
	
	public WorkflowName(String workflowID, String workflow) {
		this.workflowID = workflowID;
		this.workflow = workflow;
	}

	@Override
	public String getAsString() {
		return "workflow('" + workflowID + "','" + workflow + "').\n";
	}

}
