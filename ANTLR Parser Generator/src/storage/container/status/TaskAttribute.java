package storage.container.status;

import storage.container.Facts;

public class TaskAttribute implements Facts{
	

	String taskID;
	String attrName;
	String attrValue;
	
	public TaskAttribute(String taskID, String attrName, Object attrValue) {
		this.taskID = taskID;
		this.attrName = attrName;
		if (attrValue instanceof String) {
		this.attrValue = (String) attrValue; 
		} else {
			this.attrValue = "2000";
		}
	}

	@Override
	public String getAsString() {
		return "task_var('" + taskID + "' , '" + attrName + "' ," + attrValue +").\n";
	}

}
