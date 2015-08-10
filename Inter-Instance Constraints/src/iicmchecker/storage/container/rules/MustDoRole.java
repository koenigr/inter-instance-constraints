package iicmchecker.storage.container.rules;

import iicmchecker.storage.container.Fact;

public class MustDoRole extends Fact{
	
	private static final int NUMBER_OF_ARGUMENTS = 2;
	private static final String NAME = "role_must_execute";
	
	/*
	 * role_must_execute(RT,TT)
	 */

	public MustDoRole(String role, String task) {
		super(NAME, NUMBER_OF_ARGUMENTS);
		setArgument(0, role);
		setArgument(1, task);
	}

	@Override
	public String getAsString() {
		String result;
		result = predicate;
		result += "(Stream,";
		result +=  arguments[0];
		result += ",";
		result +=  arguments[1];
		result += ")";	
		return result;
	}
}
