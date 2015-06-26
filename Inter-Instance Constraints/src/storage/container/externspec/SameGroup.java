package storage.container.externspec;

import storage.container.Fact;

public class SameGroup extends Fact{

	private static final int NUMBER_OF_ARGUMENTS = 2;
	private static final String NAME = "same_group";
	
	/*
	 * same_group(UT,UT)
	 */
	public SameGroup() {
		super(NAME, NUMBER_OF_ARGUMENTS);
	}

	public SameGroup(String user1, String user2) {
		super(NAME, NUMBER_OF_ARGUMENTS);
		setArgument(0, user1);
		setArgument(1, user2);
	}
}
