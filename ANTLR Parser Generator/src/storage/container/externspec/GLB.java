package storage.container.externspec;

import storage.container.Fact;

public class GLB extends Fact{
 
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
