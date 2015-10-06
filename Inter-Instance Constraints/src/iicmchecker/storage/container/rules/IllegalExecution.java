package iicmchecker.storage.container.rules;

import iicmchecker.storage.container.Fact;

public class IllegalExecution extends Fact {

	private static final int NUMBER_OF_ARGUMENTS = 0;
	private static final String NAME = "illegal_execution";

	/*
	 * illegal_execution
	 */
	public IllegalExecution() {
		super(NAME, NUMBER_OF_ARGUMENTS);
	}

	@Override
	public String getAsString() {
		String result;
		result = predicate;
		result += "(Stream)";
		return result;
	}
}
