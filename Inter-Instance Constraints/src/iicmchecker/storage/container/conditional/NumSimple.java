package iicmchecker.storage.container.conditional;

import iicmchecker.storage.container.Conditional;

public class NumSimple extends Conditional{
	
	private static final String predicate = "count";
	private static final int numberOfArguments = 2;

	public NumSimple(String result, boolean neg) {
		super(predicate, numberOfArguments, neg);
		setResult(result);
	}

}
