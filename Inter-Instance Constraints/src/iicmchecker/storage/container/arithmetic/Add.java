package iicmchecker.storage.container.arithmetic;

import iicmchecker.storage.container.Fact;

public class Add extends Fact{

	private static final int NUMBER_OF_ARGUMENTS = 2;
	private static final String NAME = "";
	
	public Add(String leftArg, String rightArg) {
		super(NAME, NUMBER_OF_ARGUMENTS, false);
		setArgument(0, leftArg);
		setArgument(1, rightArg);
	}

	@Override
	public String getAsString() {
		return getArgument(0) + " + " + getArgument(1);
	}
}
