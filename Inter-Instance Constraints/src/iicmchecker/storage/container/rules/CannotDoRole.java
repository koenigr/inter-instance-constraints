package iicmchecker.storage.container.rules;

import iicmchecker.storage.container.Fact;

public class CannotDoRole extends Fact{

	private static final int NUMBER_OF_ARGUMENTS = 2;
	private static final String NAME = "role_cannot_execute";
	
	/*
	 * role_cannot_execute(RT,TT)
	 */

	public CannotDoRole(String user, String task) {
		super(NAME, NUMBER_OF_ARGUMENTS);
		setArgument(0,user);
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
