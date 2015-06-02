package storage.container.externspec;

import storage.container.Fact;

public class LUB extends Fact {

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
