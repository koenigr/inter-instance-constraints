package storage.container.externspec;

import storage.container.Fact;

public class Related extends Fact{
	
	String User1;
	String User2;
	
	public Related(String u1, String u2) {
		User1 = u1;
		User2 = u2;
	}

	@Override
	public String getAsString() {
		return "related(" + User1 + "," + User2 + ").\n";
	}

}
