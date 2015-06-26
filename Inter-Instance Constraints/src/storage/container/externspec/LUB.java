package storage.container.externspec;

import storage.container.Fact;

public class LUB extends Fact {

	private static final int NUMBER_OF_ARGUMENTS = 2;
	
	/*
	 * lub(RT,TT)
	 */
	public LUB(String r, String t) {
		super("lub", NUMBER_OF_ARGUMENTS);
	}
	
}
