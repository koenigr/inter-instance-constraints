package iicmchecker.storage.container;

import java.util.logging.Logger;

import iicmchecker.utils.StringChecker;
import iicmchecker.utils.exceptions.IllegalArgumentsPositionException;
import iicmchecker.utils.exceptions.InvalidPredicateFormatException;
import iicmchecker.utils.logging.LoggerFactory;

public abstract class Fact{
	
	protected String[] arguments;
	protected String predicate;
	protected int numberOfArguments = 0;

	Logger logger = LoggerFactory.getLogger();
	
	public Fact(String predicate, int numberOfArguments) { 
		
		logger.info("Creating new predicate " + predicate);
		
		
		if(!StringChecker.isValidPredicate(predicate)) {
			new InvalidPredicateFormatException(predicate);
		}
		this.numberOfArguments = numberOfArguments;
		arguments = new String[numberOfArguments];
		this.predicate = predicate;
	}
	
	protected void setArgument(int pos, String arg) {
		
		if (pos >= numberOfArguments) {
			new IllegalArgumentsPositionException(pos, numberOfArguments - 1);
		}
		
		arguments[pos] = arg;
	}
	
	public String getArgument(int pos) {
		return arguments[pos];
	}
	

	public String getAsString() {
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

	public String getName() {
		return predicate;
	}
}
