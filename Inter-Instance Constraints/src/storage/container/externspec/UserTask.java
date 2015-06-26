package storage.container.externspec;

import storage.container.Fact;

public class UserTask extends Fact{

	private static final int NUMBER_OF_ARGUMENTS = 2;
	
	/*
	 * user_task(UT,TT)
	 */
	public UserTask() {
		super("user_task", NUMBER_OF_ARGUMENTS);
	}
}
