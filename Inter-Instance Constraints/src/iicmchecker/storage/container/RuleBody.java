package iicmchecker.storage.container;

import java.util.ArrayList;
import java.util.logging.Logger;

import iicmchecker.storage.container.Fact;
import iicmchecker.utils.logging.LoggerFactory;

public class RuleBody {

	private Logger logger = LoggerFactory.getLogger();
	private ArrayList<Fact> body = new ArrayList<Fact>();
	
	public void addFact(Fact f) {
		logger.info("Adding fact to body");
		body.add(f);
	}
	
	public void addFacts(ArrayList<Fact> facts)  {
		body.addAll(facts);
	}
	
	public void setFirst(Fact f) {
		logger.info("Adding fact to body in first position.");
		ArrayList<Fact> tmp = new ArrayList<Fact>();
		tmp.add(f);
		tmp.addAll(body);
		body = tmp;
	}
	
	public String getAsString() { 
		String bodyStr = " ";
		for (Fact f : body) {
			String fact = f.getAsString();
			bodyStr = bodyStr.concat(fact + ",");
		}
		return bodyStr;
	}
	
	public int size() {
		return body.size();
	}
}
