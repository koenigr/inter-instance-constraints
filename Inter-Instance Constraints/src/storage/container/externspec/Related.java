package storage.container.externspec;

import storage.container.Fact;

public class Related extends Fact{
	
	private static final int NUMBER_OF_ARGUMENTS = 2;
	private static final String NAME = "related";
	
	/*
	 * related(UT,UT)
	 */
	public Related() {
		super(NAME, NUMBER_OF_ARGUMENTS);
	}

	public Related(String string, String string2) {
		super(NAME, NUMBER_OF_ARGUMENTS);
		setArgument(0, string);
		setArgument(1, string2);
	}

}
