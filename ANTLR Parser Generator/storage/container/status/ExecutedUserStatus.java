package storage.container.status;

import storage.container.Facts;

public class ExecutedUserStatus implements Facts {
	
	private String user;
	private String taskID;
	
	public ExecutedUserStatus(String user, String taskID) {
		this.user = user;
		this.taskID = taskID;
	}

	@Override
	public String getAsString() {
		return "executed_u('" + user + "','" + taskID + "').\n";
	}

}
