package iicmchecker.storage.container.externspec;

import iicmchecker.storage.container.Fact;

public class SameGroup extends Fact{

	private static final int NUMBER_OF_ARGUMENTS = 2;
	private static final String NAME = "same_group";
	private static boolean negation = false;
	
	/*
	 * same_group(UT,UT)
	 */
	public SameGroup() {
		super(NAME, NUMBER_OF_ARGUMENTS, negation);
	}

	public SameGroup(String user1, String user2, boolean neg) {
		super(NAME, NUMBER_OF_ARGUMENTS, neg);
		setArgument(0, user1);
		setArgument(1, user2);
	}
}
