package storage.container.rules;

import storage.container.Fact;

public class MustDoUser extends Fact{

	private static final int NUMBER_OF_ARGUMENTS = 2;
	
	/*
	 * user_must_execute(UT,TT)
	 */
	public MustDoUser(String u, String t) {
		super("user_must_execute", NUMBER_OF_ARGUMENTS);
	}

}
