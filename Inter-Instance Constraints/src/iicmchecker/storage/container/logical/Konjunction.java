package iicmchecker.storage.container.logical;

import java.util.ArrayList;

import iicmchecker.storage.container.Fact;

public class Konjunction extends Fact{

	public Konjunction(ArrayList<Fact> facts) {
		super("", 0);
		this.facts.addAll(facts);
	}

	ArrayList<Fact> facts = new ArrayList<Fact>();

	public void addFact(Fact fact) {
		facts.add(fact);
	}

	public void setBody(ArrayList<Fact> body) {
		facts = body;
	}
	
	public String getAsString() {
		
		if (facts.isEmpty()) {
			// TODO Exception
			System.out.println("Konjunction is empty");
			System.exit(0);
		}
		
		String result = "(";
		
		for (Fact f : facts) {
			result += f.getAsString() + ",";
		}
		
		result = result.substring(0, result.length() - 1);
		
		result += ")";
		
		return result;
	}
	
}
