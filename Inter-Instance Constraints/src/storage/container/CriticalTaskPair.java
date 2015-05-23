package storage.container;

public class CriticalTaskPair implements Facts{
	
	private String task1;
	private String task2;
	
	public CriticalTaskPair(String task1, String task2) {
		this.task1 = task1;
		this.task2 = task2;
	}
	
	public String toString() {
		return "critical_task_pair(" +task1 + "," + task2 + ").\n";
	}
}
