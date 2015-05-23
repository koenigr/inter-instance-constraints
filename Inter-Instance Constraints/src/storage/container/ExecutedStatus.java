package storage.container;

public class ExecutedStatus implements Facts {
	
	private String user;
	private String task;
	
	public ExecutedStatus(String user, String task) {
		this.user = user;
		this.task = task;
	}

}
