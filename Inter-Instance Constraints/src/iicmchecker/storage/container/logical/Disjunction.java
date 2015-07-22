package iicmchecker.storage.container.logical;

import java.util.ArrayList;

import iicmchecker.storage.container.Fact;

public class Disjunction extends Fact{

	public Disjunction(ArrayList<Fact> facts) {
		super("", 0, false);
		this.facts = facts;
	}

	ArrayList<Fact> facts = new ArrayList<Fact>();

	public String getAsString() {
		
		if (facts.isEmpty()) {
			// TODO Exception
			System.out.println("Disjunction leer");
			System.exit(0);
		}
		
		String result = "(";
		
		for (Fact f : facts) {
			result += f.getAsString() + ";";
		}
		
		result = result.substring(0, result.length() - 1);
		
		result += ")";
		
		return result;
	}
	
}
