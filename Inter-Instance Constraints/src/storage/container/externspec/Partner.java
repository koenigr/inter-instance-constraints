package storage.container.externspec;

import storage.container.Facts;

public class Partner implements Facts{
	
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
