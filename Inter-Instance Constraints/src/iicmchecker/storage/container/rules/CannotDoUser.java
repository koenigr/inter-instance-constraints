package iicmchecker.storage.container.rules;

import iicmchecker.storage.container.Fact;

public class CannotDoUser extends Fact{

	private static final int NUMBER_OF_ARGUMENTS = 2;
	private static final String NAME = "user_cannot_execute";
	
	/*
	 * user_cannot_execute(UT,TT)
	 */

	public CannotDoUser(String user, String task) {
		super(NAME , NUMBER_OF_ARGUMENTS);
		setArgument(0, user);
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
