package storage.container.rules;

import java.util.ArrayList;

import storage.container.Fact;


public class RuleContainer {

	private static ArrayList<Fact> body = new ArrayList<Fact>();
	private static Fact head = new Fact();
	

	public static void setHead(Fact head) {
		RuleContainer.head = head;
	}

	public void addFact(Fact f) {
		body.add(f);
	}
	
	public void printToFile() {
		for(Fact f : body) {
			System.out.println(f.getAsString());
		}
	}
	
}
