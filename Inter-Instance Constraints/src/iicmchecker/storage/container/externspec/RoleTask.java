package iicmchecker.storage.container.externspec;

import iicmchecker.storage.container.Fact;

public class RoleTask extends Fact{

	private static final int NUMBER_OF_ARGUMENTS = 2;
	private static final String NAME = "role_task";
	private static boolean negation = false;
	
	/*
	 * role_task
	 */
	public RoleTask() {
		super(NAME, NUMBER_OF_ARGUMENTS, negation);
	}

	public RoleTask(String role, String task, boolean neg) {
		super(NAME, NUMBER_OF_ARGUMENTS, neg);
		setArgument(0, role);
		setArgument(1, task);
	}
}
