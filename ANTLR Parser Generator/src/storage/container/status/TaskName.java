package storage.container.status;

import storage.container.Facts;

public class TaskName implements Facts{

	String ID;
	String name;
	
	public TaskName(String ID, String name) {
		this.ID = ID;
		this.name = name;
	}

	@Override
	public String getAsString() {
		return "task('" + ID + "','" + name + "').\n";
	}
}
