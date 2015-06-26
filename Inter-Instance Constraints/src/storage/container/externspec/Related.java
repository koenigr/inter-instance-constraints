package storage.container.externspec;

import storage.container.Fact;

public class Related extends Fact{
	
	private static final int NUMBER_OF_ARGUMENTS = 2;
	
	/*
	 * related(UT,UT)
	 */
	public Related() {
		super("related", NUMBER_OF_ARGUMENTS);
	}

}
