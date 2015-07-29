package iicmchecker.storage.container;

import java.util.ArrayList;
import java.util.logging.Logger;

import iicmchecker.logging.LoggerFactory;
import iicmchecker.storage.container.Fact;
import iicmchecker.storage.container.RuleBody;

public abstract class Rule {
	private RuleBody body;
	private Fact head;
	private ArrayList<String> description = new ArrayList<String>();
	private Logger logger = LoggerFactory.getLogger();
	
	public void setHead(Fact head) {
		logger.info("Rule:setHead() set head " + head.getAsString());
		this.head = head;
	}

	public void setBody(RuleBody body) {
		logger.info("Rule:setBody() set body " + body.getAsString());
		this.body = body;
	}
	
	public String getAsString() {
		System.out.println(description);
		String result;
		result = head.getAsString() + " :- "
				+ body.getAsString()
				+ "write(Stream, '\n')";
		for (String e : description) {
			result += ", write(Stream, '" + e + "\n')";
		}
		result += 	 ".\n";
		return result;
	}

	public void setDescription(String desc) {
		// TODO vielleicht die Wörter ganz lassen
		int partitionSize = 80;
		desc = desc.replaceAll("[\'\n]", "");

        int len = desc.length();
        for (int i=0; i<len; i+=partitionSize)
        {
            description.add(desc.substring(i, Math.min(len, i + partitionSize)));
        }
        
        
        
        logger.finer("Formatted Description: ");
        for (String e : description) {
        	logger.finer(e);
        }
	}
	
}
