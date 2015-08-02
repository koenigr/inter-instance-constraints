package iicmchecker.storage.container.rules;

import iicmchecker.storage.container.Fact;

public class Panic extends Fact {

	private static final int NUMBER_OF_ARGUMENTS = 0;

	/*
	 * illegal_execution
	 */
	public Panic() {
		super("illegal_execution", NUMBER_OF_ARGUMENTS, false);
	}

	@Override
	public String getAsString() {
		String result;
		result = predicate;
		result += "(Stream)";
		return result;
	}
}
