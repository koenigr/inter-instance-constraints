package iicmchecker.storage.container.conditional;

import iicmchecker.storage.container.Conditional;

public class Min extends Conditional{
	
	private static final String predicate = "mint";
	private static final int numberOfArguments = 3;

	public Min(String var, String result) {
		super(predicate, numberOfArguments);
		setVar(var);
		setResult(result);
	}
}
