package storage.container.externspec;

import storage.container.Facts;

public class GLB implements Facts {
 
	String Role;
	String Task;
	
	public GLB(String r, String t) {
		Role = r;
		Task = t;
	}

	@Override
	public String getAsString() {
		return "glb(" + Role + "," + Task + ").\n"; 
	}
}
