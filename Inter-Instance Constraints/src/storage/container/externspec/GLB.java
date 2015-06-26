package storage.container.externspec;

import storage.container.Fact;

public class GLB extends Fact{

	private static final int NUMBER_OF_ARGUMENTS = 2;
	
	/*
	 * glb(RT, TT)
	 */
	public GLB() {
		super("glb", NUMBER_OF_ARGUMENTS);
	}
}
