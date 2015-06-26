package storage.container.externspec;

import storage.container.Fact;

public class UserRole extends Fact{

	private static final int NUMBER_OF_ARGUMENTS = 2;
 
	/*
	 * user_role
	 */
	public UserRole() {
		super("user_role", NUMBER_OF_ARGUMENTS);
	}
}
