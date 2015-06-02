package storage.container.status;

import storage.container.Facts;

public class TaskWorkflow implements Facts{
	
	String taskID;
	String workflowID;

	public TaskWorkflow(String taskID, String workflowID) {
		this.taskID = taskID;
		this.workflowID = workflowID;
	}

	@Override
	public String getAsString() {
		return "task_workflow('" + taskID + "','" + workflowID + "').\n";
	}

}
