package iicmchecker.storage.container.comparison;

import iicmchecker.storage.container.Fact;

public class Inequality extends Fact{

	private static final int NUMBER_OF_ARGUMENTS = 2;
	private static final String NAME = "";
	
	public Inequality(String leftArg, String rightArg) {
		super(NAME, NUMBER_OF_ARGUMENTS);
		setArgument(0, leftArg);
		setArgument(1, rightArg);
	}

	@Override
	public String getAsString() {
		return getArgument(0) + " \\= " + getArgument(1);
	}
}
