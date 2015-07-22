package iicmchecker.storage.container.rules;

import iicmchecker.storage.container.Fact;

public class MustDoUser extends Fact{

	private static final int NUMBER_OF_ARGUMENTS = 2;
	
	/*
	 * user_must_execute(UT,TT)
	 */
	public MustDoUser(String user, String task) {
		super("user_must_execute", NUMBER_OF_ARGUMENTS, false);
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
