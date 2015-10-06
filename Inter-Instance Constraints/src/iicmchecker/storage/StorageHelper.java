package iicmchecker.storage;

import java.util.logging.Logger;

import iicmchecker.storage.container.container.ExternAndSpecificationContainer;
import iicmchecker.storage.container.container.RuleContainer;
import iicmchecker.storage.container.container.StatusContainer;
import iicmchecker.utils.logging.LoggerFactory;

public class StorageHelper {
	
	static String LOCATION = "prologfiles";
	static String OUTPUTFILE_RULES  = "rules.pl";
	static String OUTPUTFILE_EXTERNSPEC  = "externspec.pl"; 
	static String OUTPUTFILE_STATUS = "status.pl";
	
	static StorageHelper STInstance;
	static RuleContainer rc;
	static ExternAndSpecificationContainer esc;
	static StatusContainer sc;
	
	private Logger logger = LoggerFactory.getLogger();
	
	public static StorageHelper getInstance() {

		if (STInstance == null) {
			STInstance = new StorageHelper();
		}
		
		return STInstance;
	}
	
	public static void setOutputLocation(String outputlocation) {

		LOCATION = outputlocation;
	}

	private StorageHelper() {
		
		
		rc = new RuleContainer();
		esc = new ExternAndSpecificationContainer();
		sc = new StatusContainer();
		
		rc.setOutputFile(LOCATION + "/" +  OUTPUTFILE_RULES);
		esc.setOutputFile(LOCATION + "/" +  OUTPUTFILE_EXTERNSPEC);
		sc.setOutputFile(LOCATION + "/" + OUTPUTFILE_STATUS);
	}
	
	
	
	public RuleContainer getRuleContainer() {
		return rc;
	}
	
	public ExternAndSpecificationContainer getExternSpecContainer() {
		return esc;
	}
	
	public StatusContainer getStatusContainer() {
		return sc;
	}
	
	public void printToFile() {
		logger.severe("Writing rules to file...");
		rc.printToFile();
		esc.printToFile();
		sc.printToFile();
		logger.severe("Writing completed...");
	}
}
