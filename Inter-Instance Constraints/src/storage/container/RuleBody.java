package storage.container;

import java.util.ArrayList;

import storage.container.Fact;

public class RuleBody {

	private ArrayList<Fact> body = new ArrayList<Fact>();
	
	public void addFact(Fact f) {
		body.add(f);
	}
	
	public String getAsString() {
		String bodyStr = "    ";
		for (Fact f : body) {
			bodyStr.concat(f.getAsString() + ",");
		}
		
		return bodyStr.substring(0, bodyStr.length() - 1);
	}
}
