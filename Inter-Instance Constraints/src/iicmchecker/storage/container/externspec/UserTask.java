package iicmchecker.storage.container.externspec;

import iicmchecker.storage.container.Fact;

public class UserTask extends Fact{

	private static final int NUMBER_OF_ARGUMENTS = 2;
	private static final String NAME = "user_task";
	
	/*
	 * user_task(UT,TT)
	 */
	public UserTask() {
		super(NAME,  NUMBER_OF_ARGUMENTS);
	}

	public UserTask(String user, String task) {
		super(NAME,  NUMBER_OF_ARGUMENTS);
		setArgument(0, user);
		setArgument(1, task);
	}
}
