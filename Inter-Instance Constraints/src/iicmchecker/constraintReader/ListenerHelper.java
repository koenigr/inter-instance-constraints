package iicmchecker.constraintReader;

import iicmchecker.exceptions.UnexpectedNumberOfChildrenException;

public class ListenerHelper {

	public void checkChildCount(int expected, int actual) {
		if (expected != actual) {

			new UnexpectedNumberOfChildrenException(actual, expected);
		}
		
	}
}
