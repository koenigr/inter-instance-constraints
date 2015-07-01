package iicmchecker.exceptions;

public class UnexpectedContextException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
    public UnexpectedContextException() {
    	printStackTrace();
        System.exit(0);
    }
	
    public UnexpectedContextException(String taskVar, String found, String expected) {
    	
        super("Found task variable " + taskVar + 
    			" for context " + found + " but expected " + expected);
    	printStackTrace();
        System.exit(0);
    }


}
