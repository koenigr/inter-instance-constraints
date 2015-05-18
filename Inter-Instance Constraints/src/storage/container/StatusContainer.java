package storage.container;

import java.util.ArrayList;

public class StatusContainer {
	// Singleton?

	private static ArrayList<ExecutedStatus> exStatus = new ArrayList<ExecutedStatus>();
	
	public void addExecutedStatus(ExecutedStatus s) {
		exStatus.add(s);
	}
	
	public boolean containsExecStatus(ExecutedStatus s) {
		return exStatus.contains(s);
	}
}
