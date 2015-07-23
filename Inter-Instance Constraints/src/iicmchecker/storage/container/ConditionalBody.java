package iicmchecker.storage.container;

import iicmchecker.logging.LoggerFactory;
import iicmchecker.storage.container.Fact;

import java.util.ArrayList;
import java.util.logging.Logger;

public class ConditionalBody {

	private Logger logger = LoggerFactory.getLogger();
	private ArrayList<Fact> body = new ArrayList<Fact>();
	
	public void addFact(Fact f) {
		logger.info("Adding fact to body");
		body.add(f);
	}
	
	public void setFirst(Fact f) {
		logger.info("Adding fact to body in first position.");
		ArrayList<Fact> tmp = new ArrayList<Fact>();
		tmp.add(f);
		tmp.addAll(body);
		body = tmp;
	}
	
	public String getAsString() { // TODO hier ein paar weitere Prolog interne Sachen einfügen
		String bodyStr = "(";
		for (Fact f : body) {
			String fact = f.getAsString();
			bodyStr = bodyStr.concat(fact + ",");
		}
		bodyStr = bodyStr.substring(0, bodyStr.length() - 1);
		bodyStr += ")";
		return bodyStr;
	}
	
	public int size() {
		return body.size();
	}
}