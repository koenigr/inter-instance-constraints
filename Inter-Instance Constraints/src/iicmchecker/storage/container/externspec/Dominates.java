package iicmchecker.storage.container.externspec;

import iicmchecker.storage.container.Fact;

public class Dominates extends Fact {

	private static final int NUMBER_OF_ARGUMENTS = 2;
	private static final String NAME = "dominates";
	
	/*
	 * dominates(TT, TT) 
	 */

	public Dominates(String role1, String role2, boolean neg) {
		super(NAME, NUMBER_OF_ARGUMENTS, neg);
		setArgument(0, role1);
		setArgument(1, role2);
	}

}
