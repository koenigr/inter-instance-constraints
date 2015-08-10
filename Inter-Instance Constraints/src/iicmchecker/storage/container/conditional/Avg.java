package iicmchecker.storage.container.conditional;

import iicmchecker.storage.container.Conditional;

public class Avg extends Conditional{
	
	private static final String predicate = "avg";
	private static final int numberOfArguments = 3;

	public Avg(String var, String result) {
		super(predicate, numberOfArguments);
		setVar(var);
		setResult(result);
	}

}
