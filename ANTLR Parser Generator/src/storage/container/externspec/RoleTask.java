package storage.container.externspec;

import storage.container.Fact;

public class RoleTask extends Fact{
	
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
