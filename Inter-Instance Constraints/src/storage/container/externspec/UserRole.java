package storage.container.externspec;

import storage.container.Facts;

public class UserRole implements Facts{
 
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
