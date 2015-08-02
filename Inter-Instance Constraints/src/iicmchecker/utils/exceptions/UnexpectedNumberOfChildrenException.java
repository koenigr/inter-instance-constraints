package iicmchecker.exceptions;

public class UnexpectedNumberOfChildrenException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
    public UnexpectedNumberOfChildrenException() {
    	printStackTrace();
        System.exit(0);
    }
	
    public UnexpectedNumberOfChildrenException(int actual, int expected) {
    	
        super("Expected " + expected + " but got " + actual + " children.");
    	printStackTrace();
        System.exit(0);
    }


}
