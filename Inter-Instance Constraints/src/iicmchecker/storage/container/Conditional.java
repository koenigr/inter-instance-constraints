package iicmchecker.storage.container;

import java.util.logging.Logger;

import iicmchecker.storage.container.ConditionalBody;
import iicmchecker.utils.StringChecker;
import iicmchecker.utils.exceptions.InvalidVariableFormatException;
import iicmchecker.utils.exceptions.UnexpectedNumberOfArgumentsException;
import iicmchecker.utils.logging.LoggerFactory;

public abstract class Conditional extends Fact{
	public Conditional(String predicate, int numberOfArguments) {
		super(predicate, numberOfArguments);
	}

	private ConditionalBody body;
	private String var;
	private String resultVar;
	
	private Logger logger = LoggerFactory.getLogger();


	public void setBody(ConditionalBody body) {
		logger.info("Conditional:setBody() set body " + body.getAsString());
		this.body = body;
	}
	
	public void setVar(String var) {
		if(StringChecker.isValidVariable(var)) {
			this.var = var;
		} else {
			new InvalidVariableFormatException(var);
		}
	}
	
	public void setResult(String result) {
		if (StringChecker.isValidVariable(result)) {
			this.resultVar = result;
		} else {
			new InvalidVariableFormatException(result);
		}
	}
	
	public String getAsString() {
		String result;
		result = predicate + "(";
		if (numberOfArguments == 3) {
			result += var + ",";
		} else if (numberOfArguments == 2) {	
		} else {
			new UnexpectedNumberOfArgumentsException(numberOfArguments);
		}
		result += body.getAsString() + "," + resultVar + ")";
		return result;
	}
}
