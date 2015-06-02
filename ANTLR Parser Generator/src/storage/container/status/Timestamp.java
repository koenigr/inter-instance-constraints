package storage.container.status;

import java.util.Date;

import storage.container.Facts;

public class Timestamp implements Facts {

	String taskID;
	Date date;
	
	public Timestamp(String taskID, Date date) {
		this.taskID = taskID;
		this.date = date;
	}

	@Override
	public String getAsString() {
		// TODO timestamp muss so ausgegeben werden,
		// dass Prolog Vergleiche damit anstellen kann
		return "timestamp('" + taskID + "','" + date.toString() + "').\n";
	}
}
