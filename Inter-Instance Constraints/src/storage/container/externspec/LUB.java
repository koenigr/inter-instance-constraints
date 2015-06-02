package storage.container.externspec;

import storage.container.Facts;

public class LUB implements Facts {

	String Role;
	String Task;
	
	public LUB(String r, String t) {
		Role = r;
		Task = t;
	}

	@Override
	public String getAsString() {
		return "lub(" + Role + "," + Task + ").\n"; 
	}
	
}
