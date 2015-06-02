package storage.container;

import java.util.ArrayList;

import storage.container.Fact;
import storage.container.status.RuleBody;

public abstract class Rule {
	private RuleBody body;
	private Fact head;
	
	public void setHead(Fact head) {
		this.head = head;
	}

	public void setBody(RuleBody body) {
		this.body = body;
	}
	
	public String getAsString() {
		return head.getAsString() + " :- "
			 + body.getAsString() + ".\n";
	}

}
