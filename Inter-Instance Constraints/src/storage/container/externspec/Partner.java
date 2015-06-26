package storage.container.externspec;

import storage.container.Fact;

public class Partner extends Fact{

	private static final int NUMBER_OF_ARGUMENTS = 2;
	
	/*
	 * partner(UT,UT)
	 */
	public Partner() {
		super("partner", NUMBER_OF_ARGUMENTS);
	}
}
