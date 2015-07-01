package iicmchecker.storage.container.externspec;

import iicmchecker.storage.container.Fact;

public class GLB extends Fact{

	private static final int NUMBER_OF_ARGUMENTS = 2;
	private static final String NAME = "glb";
	
	/*
	 * glb(RT, TT)
	 */
	public GLB() {
		super(NAME, NUMBER_OF_ARGUMENTS);
	}

	public GLB(String role, String task) {
		super(NAME, NUMBER_OF_ARGUMENTS);
		setArgument(0, role);
		setArgument(1, task);
	}
}
