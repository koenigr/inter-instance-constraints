package storage.container.rules;

import storage.container.Fact;

public class CannotDoUser extends Fact{

	private static final int NUMBER_OF_ARGUMENTS = 2;
	
	/*
	 * user_cannot_execute(UT,TT)
	 */
	public CannotDoUser() {
		super("user_cannot_execute", NUMBER_OF_ARGUMENTS);
	}

}
