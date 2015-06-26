package storage.container.rules;

import storage.container.Fact;

public class MustDoRole extends Fact{
	
	private static final int NUMBER_OF_ARGUMENTS = 2;
	
	/*
	 * role_must_execute(RT,TT)
	 */
	public MustDoRole() {
		super("role_must_execute", NUMBER_OF_ARGUMENTS);
	}

}
