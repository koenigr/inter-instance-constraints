package iicmchecker.storage.container.rules;

import iicmchecker.storage.container.Fact;

public class MustDoRole extends Fact{
	
	private static final int NUMBER_OF_ARGUMENTS = 2;
	private static final String NAME = "role_must_execute";
	
	/*
	 * role_must_execute(RT,TT)
	 */
	public MustDoRole() {
		super(NAME, NUMBER_OF_ARGUMENTS);
	}

	public MustDoRole(String user, String task) {
		super(NAME, NUMBER_OF_ARGUMENTS);
		setArgument(0, user);
		setArgument(1, task);
	}

}
