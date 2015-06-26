package exceptions;

public class IllegalArgumentsPositionException extends RuntimeException{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
    public IllegalArgumentsPositionException() {
    	printStackTrace();
        System.exit(0);
    }
	
    public IllegalArgumentsPositionException(int actualPos, int maxPos) {
    	
        super("Illegal argument position " + actualPos + ". This fact has only "
        		+ "positions between 0 and " + maxPos);
    	printStackTrace();
        System.exit(0);
    }
}
