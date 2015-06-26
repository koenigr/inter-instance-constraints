package exceptions;

public class InvalidPredicateFormatException extends RuntimeException {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
    public InvalidPredicateFormatException() {
    	printStackTrace();
        System.exit(0);
    }
	
    public InvalidPredicateFormatException(String var) {
    	
        super("Predicate " + var + " has invalid format. It can contain"
        		+ " only lowercase letters and underscores.");
    	printStackTrace();
        System.exit(0);
    }
}
