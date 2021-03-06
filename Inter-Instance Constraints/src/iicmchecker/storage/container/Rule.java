package iicmchecker.storage.container;

import java.util.ArrayList;
import java.util.logging.Logger;

import iicmchecker.storage.container.Fact;
import iicmchecker.storage.container.RuleBody;
import iicmchecker.utils.logging.LoggerFactory;

public abstract class Rule {
	protected RuleBody body;
	protected Fact head;
	protected ArrayList<String> description = new ArrayList<String>();
	protected Logger logger = LoggerFactory.getLogger();
	
	public void setHead(Fact head) {
		logger.info("Rule:setHead() set head " + head.getAsString());
		this.head = head;
	}

	public void setBody(RuleBody body) {
		logger.info("Rule:setBody() set body " + body.getAsString());
		this.body = body;
	}
	
	public String getAsString() {
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
