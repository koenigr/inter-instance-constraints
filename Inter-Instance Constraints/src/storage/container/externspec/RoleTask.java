package storage.container.externspec;

import storage.container.Fact;

public class RoleTask extends Fact{

	private static final int NUMBER_OF_ARGUMENTS = 2;
	private static final String NAME = "role_task";
	
	/*
	 * role_task
	 */
	public RoleTask() {
		super(NAME, NUMBER_OF_ARGUMENTS);
	}

	public RoleTask(String role, String task) {
		super(NAME, NUMBER_OF_ARGUMENTS);
		setArgument(0, role);
		setArgument(1, task);
	}
}
