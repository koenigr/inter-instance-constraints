package iicmchecker.constraintReader;

import iicmchecker.utils.exceptions.UnexpectedNumberOfChildrenException;


public class ListenerHelper {
	
	private static int variable_for_vars = 0;
	private static int variable_for_ruleIDs = 0;

	public void checkChildCount(int expected, int actual) {
		if (expected != actual) {

			new UnexpectedNumberOfChildrenException(actual, expected);
		}
		
	}
	
	public static String generateStringForVar() {
		variable_for_vars++;
		return "GENERATED" + String.valueOf(variable_for_vars);
	}
	
	public static String generateRuleID() {
		variable_for_ruleIDs++;
		return "'RULEID" + String.valueOf(variable_for_ruleIDs) + "'";
	}
}
