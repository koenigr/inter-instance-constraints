package storage.container.rules;

import storage.container.Fact;

public class CannotDoRole extends Fact{

	private static final int NUMBER_OF_ARGUMENTS = 2;
	
	/*
	 * role_cannot_execute(RT,TT)
	 */
	public CannotDoRole() {
		super("role_cannot_execute", NUMBER_OF_ARGUMENTS);
	}

}
