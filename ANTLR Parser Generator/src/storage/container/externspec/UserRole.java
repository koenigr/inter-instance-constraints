package storage.container.externspec;

import storage.container.Fact;

public class UserRole extends Fact{
 
	String User;
	String Role;
	
	public UserRole(String u, String r) {
		User = u;
		Role = r;
	}

	@Override
	public String getAsString() {
		return "user_has_role(" + User + "," + Role + ").\n";
	}
	
}
