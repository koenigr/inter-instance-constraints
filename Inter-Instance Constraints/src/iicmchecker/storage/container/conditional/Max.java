package iicmchecker.storage.container.conditional;

import iicmchecker.storage.container.Conditional;

public class Max extends Conditional {
	
	private static final String predicate = "max";
	private static final int numberOfArguments = 3;

	public Max(String var, String result, boolean neg) {
		super(predicate, numberOfArguments, neg);
		setVar(var);
		setResult(result);
	}
	
}