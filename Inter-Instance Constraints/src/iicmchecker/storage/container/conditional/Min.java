package iicmchecker.storage.container.conditional;

import iicmchecker.storage.container.Conditional;

public class Min extends Conditional{
	
	private static final String predicate = "mint";
	private static final int numberOfArguments = 3;

	public Min(String var, String result, boolean neg) {
		super(predicate, numberOfArguments, neg);
		setVar(var);
		setResult(result);
	}
}
