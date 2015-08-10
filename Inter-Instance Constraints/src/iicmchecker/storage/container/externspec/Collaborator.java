package iicmchecker.storage.container.externspec;

import iicmchecker.storage.container.Fact;

public class Collaborator extends Fact{

	private static final int NUMBER_OF_ARGUMENTS = 2;
	private static final String NAME = "collaborator";
	
	/*
	 * critical_task_pair(TT, TT)
	 */

	public Collaborator(String task1, String task2) {
		super(NAME, NUMBER_OF_ARGUMENTS);
		setArgument(0, task1);
		setArgument(1, task2);
	}
}
