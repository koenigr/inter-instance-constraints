package iicmchecker.exceptions;

public class InvalidVariableFormatException extends RuntimeException {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
    public InvalidVariableFormatException() {
    	printStackTrace();
        System.exit(0);
    }
	
    public InvalidVariableFormatException(String var) {
    	
        super("Variable " + var + " has invalid format. It should start with a capital"
        		+ "letter and contain only letters [A-Za-z0-9].");
    	printStackTrace();
        System.exit(0);
    }
}
