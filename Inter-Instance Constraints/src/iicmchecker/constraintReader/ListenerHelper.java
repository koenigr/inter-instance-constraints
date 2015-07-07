package iicmchecker.constraintReader;

import iicmchecker.exceptions.UnexpectedNumberOfChildrenException;

public class ListenerHelper {
	
	private static int variable = 0;

	public void checkChildCount(int expected, int actual) {
		if (expected != actual) {

			new UnexpectedNumberOfChildrenException(actual, expected);
		}
		
	}
	
	public static String getStringForVar() {
		variable++;
		return "GENERATED" + String.valueOf(variable);
	}
}
