package storage.container.externspec;

import storage.container.Facts;

public class UserTask implements Facts{
	
	String User;
	String Task;
	
	public UserTask(String u, String t) {
		User = u;
		Task = t;
	}

	@Override
	public String getAsString() {
		return "user_can_execute_task(" + User + "," + Task + ").\n";
	}
}
