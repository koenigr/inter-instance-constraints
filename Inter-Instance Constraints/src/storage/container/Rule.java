package storage.container;

import java.util.ArrayList;

import storage.container.Fact;
import storage.container.RuleBody;

public abstract class Rule {
	private RuleBody body;
	private Fact head;
	private ArrayList<String> description;
	
	public void setHead(Fact head) {
		this.head = head;
	}

	public void setBody(RuleBody body) {
		this.body = body;
	}
	
	public String getAsString() {

		return head.getAsString() + " :- " // TODO print description
			 + body.getAsString() + ".\n";
	}

	public void setDescription(String desc) {
		// TODO vielleicht die Wörter ganz lassen
		int partitionSize = 80;
		desc = desc.replaceAll("[\'\n]", "");
		ArrayList<String> description = new ArrayList<String>();
        int len = desc.length();
        for (int i=0; i<len; i+=partitionSize)
        {
            description.add(desc.substring(i, Math.min(len, i + partitionSize)));
        }
        
        for (String e : description) {
        	System.out.println(e);
        }
        
	}
}
