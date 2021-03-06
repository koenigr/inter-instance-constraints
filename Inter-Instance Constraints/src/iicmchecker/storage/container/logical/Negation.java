package iicmchecker.storage.container.logical;

import iicmchecker.storage.container.Fact;
import iicmchecker.utils.logging.LoggerFactory;

import java.util.ArrayList;
import java.util.logging.Logger;

public class Negation extends Fact{
	
	Logger logger = LoggerFactory.getLogger();
	
	public Negation(ArrayList<Fact> facts) {
		super("", 0);
		this.facts.addAll(facts);
		System.out.println("Constructor of negation with elements: " + facts.size());
	}

	ArrayList<Fact> facts = new ArrayList<Fact>();

	public void addFact(Fact fact) {
		facts.add(fact);
	}
	
	public void setBody(ArrayList<Fact> body) {
		facts = body;
	}
	
	
	public String getAsString() {
		System.out.println("Getting negation as String: Number of Elements " + facts.size());
		
		if (facts.isEmpty()) {
			logger.severe("Negation is empty");
			System.exit(0);
		}
		
		String result = "not(";
		
		for (Fact f : facts) {
			result += f.getAsString() + ",";
		}
		
		result = result.substring(0, result.length() - 1);
		
		result += ")";
		
		return result;
	}
	
	public int getSize() {
		return facts.size();
	}
}
