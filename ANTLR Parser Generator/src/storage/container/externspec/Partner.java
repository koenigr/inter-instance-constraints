package storage.container.externspec;

import storage.container.Fact;

public class Partner extends Fact{
	
	String User1;
	String User2;
	
	public Partner(String u1, String u2) {
		User1 = u1;
		User2 = u2;
	}

	@Override
	public String getAsString() {
		return "partner_of(" + User1 + "," + User2 + ").\n";
	}
}
