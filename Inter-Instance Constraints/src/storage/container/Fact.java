package storage.container;


import java.util.logging.Logger;

import logging.LoggerFactory;
import exceptions.InvalidPredicateFormatException;
import utils.StringChecker;

public abstract class Fact{
	
	String[] arguments;
	String predicate;
	int numberOfArguments = 0;

	Logger logger = LoggerFactory.getLogger();
	
	public Fact(String predicate, int numberOfArguments) { 
		
		logger.info("Creating new predicate " + predicate);
		/*
		 *  TODO den String noch allerlei testen
		 *  ob nur kleinschreibung und _ 
		 */
		if(!StringChecker.isValidPredicate(predicate)) {
			new InvalidPredicateFormatException(predicate);
		}
		this.numberOfArguments = numberOfArguments;
		arguments = new String[numberOfArguments];
		this.predicate = predicate;
	}
	
	public void setArgument(int pos, String arg) {
		/*
		 *  TODO den String noch allerlei testen
		 *  Darf entweder nur eine Variable sein oder ein String mit einfachen Strichen
		 *  Das macht der String Checker
		 *  Ebenfalls Error ausgeben, wenn der Wert schon gesetzt wurde
		 */
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
				
		return result;
	}
}
