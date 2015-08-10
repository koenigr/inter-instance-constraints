package iicmchecker.storage.container.externspec;

import iicmchecker.storage.container.Fact;

public class LUB extends Fact {

	private static final int NUMBER_OF_ARGUMENTS = 2;
	
	/*
	 * lub(RT,TT)
	 */
	public LUB(String role, String task) {
		super("lub", NUMBER_OF_ARGUMENTS);
		setArgument(0, role);
		setArgument(1, task);
		
	}
	
}
