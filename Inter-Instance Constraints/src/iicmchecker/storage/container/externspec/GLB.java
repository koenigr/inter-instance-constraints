package iicmchecker.storage.container.externspec;

import iicmchecker.storage.container.Fact;

public class GLB extends Fact{

	private static final int NUMBER_OF_ARGUMENTS = 2;
	private static final String NAME = "glb";
	
	/*
	 * glb(RT, TT)
	 */


	public GLB(String role, String task, boolean neg) {
		super(NAME, NUMBER_OF_ARGUMENTS, neg);
		setArgument(0, role);
		setArgument(1, task);
	}
}
