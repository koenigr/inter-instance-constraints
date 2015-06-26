package storage.container.externspec;

import storage.container.Fact;

public class CriticalTaskPair extends Fact{

	private static final int NUMBER_OF_ARGUMENTS = 2;
	
	/*
	 * critical_task_pair(TT, TT)
	 */
	public CriticalTaskPair() {
		super("critical_task_pair", NUMBER_OF_ARGUMENTS);
	}
}
