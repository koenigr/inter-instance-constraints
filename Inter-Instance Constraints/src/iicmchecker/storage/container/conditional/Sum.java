package iicmchecker.storage.container.conditional;

import iicmchecker.storage.container.Conditional;

public class Sum extends Conditional{
	
	private static final String predicate = "sum";
	private static final int numberOfArguments = 3;

	public Sum(String var, String result) {
		super(predicate, numberOfArguments);
		setVar(var);
		setResult(result);
	}

}
