package iicmchecker.storage.container.externspec;

import iicmchecker.storage.container.Fact;

public class Partner extends Fact{

	private static final int NUMBER_OF_ARGUMENTS = 2;
	private static final String NAME = "partner";
	private static boolean negation = false;
	
	/*
	 * partner(UT,UT)
	 */
	public Partner() {
		super(NAME, NUMBER_OF_ARGUMENTS, negation);
	}

	public Partner(String user1, String user2, boolean neg) {
		super(NAME, NUMBER_OF_ARGUMENTS, neg);
		setArgument(0, user1);
		setArgument(1, user2);
	}
}
