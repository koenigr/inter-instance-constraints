package iicmchecker.storage.container;


import java.util.logging.Logger;

import iicmchecker.logging.LoggerFactory;
import iicmchecker.exceptions.IllegalArgumentsPositionException;
import iicmchecker.exceptions.InvalidPredicateFormatException;
import iicmchecker.utils.StringChecker;

public abstract class Fact{
	
	protected String[] arguments;
	protected String predicate;
	protected int numberOfArguments = 0;
	protected boolean negation = false;

	Logger logger = LoggerFactory.getLogger();
	
	public Fact(String predicate, int numberOfArguments, boolean neg) { 
		
		logger.info("Creating new predicate " + predicate);
		/*
		 *  TODO den String noch allerlei testen
		 *  ob nur kleinschreibung und _ 
		 */
		
		negation = neg;
		
		if(!StringChecker.isValidPredicate(predicate)) {
			new InvalidPredicateFormatException(predicate);
		}
		this.numberOfArguments = numberOfArguments;
		arguments = new String[numberOfArguments];
		this.predicate = predicate;
	}
	
	protected void setArgument(int pos, String arg) {
		/*
		 *  TODO den String noch allerlei testen
		 *  Darf entweder nur eine Variable sein oder ein String mit einfachen Strichen
		 *  Das macht der String Checker
		 *  Ebenfalls Error ausgeben, wenn der Wert schon gesetzt wurde
		 */
		
		if (pos >= numberOfArguments) {
			new IllegalArgumentsPositionException(pos, numberOfArguments - 1);
		}
		if (StringChecker.isValidVariable(arg) || StringChecker.isValidConstant(arg)) {
				// TODO Exception
		}
		
		arguments[pos] = arg;
	}
	
	public String getArgument(int pos) {
		return arguments[pos];
	}
	

	public String getAsString() {
		// TODO testen, ob alles gesetzt wurde
		boolean hasArgs = numberOfArguments > 0;
		String result;
		result = predicate;
		if (hasArgs) {
			result += "(";
		}
		for (String el : arguments) {
			result += el + ",";
		}
		
		if (hasArgs) {
			result = result.substring(0, result.length()-1);
			result += ")";
		}
		
		if(negation) {
			result = "not(" + result + ")";
		}
		
		return result;
	}
}
