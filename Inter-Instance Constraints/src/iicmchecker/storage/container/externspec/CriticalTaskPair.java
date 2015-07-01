package iicmchecker.storage.container.externspec;

import iicmchecker.storage.container.Fact;

public class CriticalTaskPair extends Fact{

	private static final int NUMBER_OF_ARGUMENTS = 2;
	private static final String NAME = "critical_task_pair";
	
	/*
	 * critical_task_pair(TT, TT)
	 */
	public CriticalTaskPair() {
		super(NAME, NUMBER_OF_ARGUMENTS);
	}

	public CriticalTaskPair(String task1, String task2) {
		super(NAME, NUMBER_OF_ARGUMENTS);
		setArgument(0, task1);
		setArgument(1, task2);
	}
}
