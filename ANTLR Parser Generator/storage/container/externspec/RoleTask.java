package storage.container.externspec;

import storage.container.Facts;

public class RoleTask implements Facts{
	
	String Role;
	String Task;
	
	public RoleTask(String r, String t) {
		Role = r;
		Task = t;
	}

	@Override
	public String getAsString() {
		return "role_can_execute_task(" + Role + "," + Task + ").\n";
	}
}
