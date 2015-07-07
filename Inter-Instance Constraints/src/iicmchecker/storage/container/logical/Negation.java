package iicmchecker.storage.container.logical;

import java.util.ArrayList;

import iicmchecker.storage.container.Fact;

public class Negation extends Fact{
	
	private static final String predicate = "not";
	private static final int numberOfArguments = 1;
	
	private ArrayList<Fact> body;

	public Negation(ArrayList<Fact> body) {
		super(predicate, numberOfArguments);
		this.body = body;
	}

	@Override
	public String getAsString() {
		String res;
		
		res = predicate + "((";
		for (Fact e : body) {
			res += e.getAsString() + ",";
		}
		res = res.substring(0, res.length() - 1);
		res += "))";
		
		return res;
	}
}
