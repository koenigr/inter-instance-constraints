package iicmchecker.storage.container.conditional;

import iicmchecker.storage.container.Conditional;

public class NumVars extends Conditional{
	
	private static final String predicate = "count";
	private static final int numberOfArguments = 3;

	public NumVars(String var, String result) {
		super(predicate, numberOfArguments);
		setVar(var);
		setResult(result);
	}
}
