package iicmchecker.storage.container.externspec;

import iicmchecker.storage.container.Fact;

public class Related extends Fact{
	
	private static final int NUMBER_OF_ARGUMENTS = 2;
	private static final String NAME = "related";
	private static boolean negation = false;
	
	/*
	 * related(UT,UT)
	 */
	public Related() {
		super(NAME, NUMBER_OF_ARGUMENTS, negation);
	}

	public Related(String string, String string2, boolean neg) {
		super(NAME, NUMBER_OF_ARGUMENTS, neg);
		setArgument(0, string);
		setArgument(1, string2);
	}

}
