package iicmchecker.storage.container.conditional;

import iicmchecker.storage.container.Conditional;

public class Sum extends Conditional{
	
	private static final String predicate = "sum";
	private static final int numberOfArguments = 3;

	public Sum(String var, String result, boolean neg) {
		super(predicate, numberOfArguments, neg);
		setVar(var);
		setResult(result);
	}

}
