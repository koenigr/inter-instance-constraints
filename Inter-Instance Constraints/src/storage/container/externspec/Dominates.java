package storage.container.externspec;

import storage.container.Fact;

public class Dominates extends Fact {

	private static final int NUMBER_OF_ARGUMENTS = 2;
	
	/*
	 * dominates(TT, TT) 
	 */
	public Dominates() {
		super("dominates", NUMBER_OF_ARGUMENTS);
	}

}
