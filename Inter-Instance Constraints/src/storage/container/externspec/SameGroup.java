package storage.container.externspec;

import storage.container.Fact;

public class SameGroup extends Fact{

	private static final int NUMBER_OF_ARGUMENTS = 2;
	
	/*
	 * same_group(UT,UT)
	 */
	public SameGroup() {
		super("same_group", NUMBER_OF_ARGUMENTS);
	}
}
