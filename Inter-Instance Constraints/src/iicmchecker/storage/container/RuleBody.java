package iicmchecker.storage.container;

import java.util.ArrayList;
import java.util.logging.Logger;

import iicmchecker.logging.LoggerFactory;
import iicmchecker.storage.container.Fact;

public class RuleBody {

	private Logger logger = LoggerFactory.getLogger();
	private ArrayList<Fact> body = new ArrayList<Fact>();
	
	public void addFact(Fact f) {
		logger.info("Adding Fact to Body");
		logger.info(String.valueOf(body.size()));
		body.add(f);
		logger.info(String.valueOf(body.size()));
	}
	
	public String getAsString() {
		String bodyStr = " ";
		for (Fact f : body) {
			String fact = f.getAsString();
			bodyStr = bodyStr.concat(fact + ",");
		}
		bodyStr = bodyStr.substring(0, bodyStr.length() - 1);
		return bodyStr;
	}
	
	public int size() {
		return body.size();
	}
}
