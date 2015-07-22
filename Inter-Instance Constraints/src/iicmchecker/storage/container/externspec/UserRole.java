package iicmchecker.storage.container.externspec;

import iicmchecker.storage.container.Fact;

public class UserRole extends Fact{

	private static final int NUMBER_OF_ARGUMENTS = 2;
	private static final String NAME = "user_role";
	private static boolean negation = false;
 
	/*
	 * user_role
	 */
	public UserRole() {
		super(NAME, NUMBER_OF_ARGUMENTS, negation);
	}

	public UserRole(String user, String role, boolean neg) {
		super(NAME, NUMBER_OF_ARGUMENTS, neg);
		setArgument(0, user);
		setArgument(1, role);
	}
}
