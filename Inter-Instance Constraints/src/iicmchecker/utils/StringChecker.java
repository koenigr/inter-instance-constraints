package iicmchecker.utils;


public class StringChecker {

	
	public static boolean isValidVariable(String arg) {
		return arg.matches("[A-Z][A-Za-z0-9]*");
	}

	public static boolean isValidConstant(String arg) {
		// TODO Auto-generated method stub
		return false;
	}

	public static boolean isValidPredicate(String predicate) {
		return predicate.matches("[a-z_]*");
	}
	
	public static boolean isValidNumber( String input ) {
	    try {
	        Integer.parseInt( input );
	        return true;
	    }
	    catch( Exception e ) {
	        return false;
	    }
	}
}
