package iicmchecker.utils.exceptions;

public class UnexpectedNumberOfArgumentsException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
    public UnexpectedNumberOfArgumentsException() {
    	printStackTrace();
        System.exit(0);
    }
	
    public UnexpectedNumberOfArgumentsException(int actual) {
    	
        super("Got " + actual + " arguments.");
    	printStackTrace();
        System.exit(0);
    }


}
