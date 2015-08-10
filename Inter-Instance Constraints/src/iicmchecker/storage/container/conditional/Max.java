package iicmchecker.storage.container.conditional;

import iicmchecker.storage.container.Conditional;

public class Max extends Conditional {
	
	private static final String predicate = "max";
	private static final int numberOfArguments = 3;

	public Max(String var, String result) {
		super(predicate, numberOfArguments);
		setVar(var);
		setResult(result);
	}
	
}