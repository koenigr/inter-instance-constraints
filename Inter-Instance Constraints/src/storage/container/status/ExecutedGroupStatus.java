package storage.container.status;

import storage.container.Facts;

public class ExecutedGroupStatus implements Facts {
	
	private String group;
	private String taskID;
	
	public ExecutedGroupStatus(String group, String taskID) {
		this.group = group;
		this.taskID = taskID;
	}

	@Override
	public String getAsString() {
		return "executed_g('" + group + "','" + taskID + "').\n";
	}

}
