package iicmchecker.storage.container.rules;

import iicmchecker.storage.container.Rule;

public class DefinedRule extends Rule{

	
	public String getName() {
		return head.getName();
	}
	
	public String getAsString() {
		String res = "";
		
		if (body == null || body.size() == 0 ) {
			res = head.getAsString() + ".\n";
		} else {
			res = head.getAsString() + " :- "
					+ body.getAsString()
					+ "write(Stream, '\n')";
			for (String e : description) {
				res += ", write(Stream, '" + e + "\n')";
			}
			res += 	 ".\n";
		}
		System.out.println(res);
		return res;
	}
}
