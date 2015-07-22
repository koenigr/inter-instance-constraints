package iicmchecker.storage.container.externspec;

import iicmchecker.storage.container.Fact;

public class UserTask extends Fact{

	private static final int NUMBER_OF_ARGUMENTS = 2;
	private static final String NAME = "user_task";
	private static boolean negation = false;
	
	/*
	 * user_task(UT,TT)
	 */
	public UserTask() {
		super(NAME,  NUMBER_OF_ARGUMENTS, negation);
	}

	public UserTask(String user, String task, boolean neg) {
		super(NAME,  NUMBER_OF_ARGUMENTS, neg);
		setArgument(0, user);
		setArgument(1, task);
	}
}
