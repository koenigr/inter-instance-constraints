package storage.container.externspec;

import storage.container.Fact;

public class RoleTask extends Fact{

	private static final int NUMBER_OF_ARGUMENTS = 2;
	
	/*
	 * role_task
	 */
	public RoleTask() {
		super("role_task", NUMBER_OF_ARGUMENTS);
	}
}
