package storage.container.externspec;

import storage.container.Fact;

public class UserRole extends Fact{

	private static final int NUMBER_OF_ARGUMENTS = 2;
	private static final String NAME = "user_role";
 
	/*
	 * user_role
	 */
	public UserRole() {
		super(NAME, NUMBER_OF_ARGUMENTS);
	}

	public UserRole(String user, String role) {
		super(NAME, NUMBER_OF_ARGUMENTS);
		setArgument(0, user);
		setArgument(1, role);
	}
}
