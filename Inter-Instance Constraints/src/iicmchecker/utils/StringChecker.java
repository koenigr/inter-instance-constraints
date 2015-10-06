package iicmchecker.utils;


public class StringChecker {

	
	public static boolean isValidVariable(String arg) {
		return arg.matches("[A-Z][A-Za-z0-9]*");
	}

	public static boolean isValidConstant(String arg) {
		return arg.matches("'.*'"); 
	}
	
	public static String convertToValidConstant(String arg) {
		if (arg == null) {
			return null;
		}
		
		if (arg.matches("'.*'")) {
			return arg;
		} else if (arg.matches("\".*\"")) {
			return "'" + arg.substring(1, arg.length() - 1) + "'";
		} else {
			return "'" + arg + "'";
		} 
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
