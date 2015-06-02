package storage.container.externspec;

import storage.container.Facts;

public class Dominates implements Facts {
	
	String Role1;
	String Role2;
	
	public Dominates(String r1, String r2) {
		Role1 = r1;
		Role2 = r2;
	}

	@Override
	public String getAsString() {
		return "dominates(" + Role1 + "," + Role2 + ").\n";
	}

}
