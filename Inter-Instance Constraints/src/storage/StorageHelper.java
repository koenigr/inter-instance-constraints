package storage;

import storage.container.externspec.ExternAndSpecificationContainer;
import storage.container.rules.RuleContainer;
import storage.container.status.StatusContainer;

public class StorageHelper {
	
	static String LOCATION = "prologfiles";
	static String OUTPUTFILE_RULES  = "rules.pl";
	static String OUTPUTFILE_EXTERNSPEC  = "externspec.pl"; 
	static String OUTPUTFILE_STATUS = "status.pl";
	
	static StorageHelper STInstance;
	static RuleContainer rc;
	static ExternAndSpecificationContainer esc;
	static StatusContainer sc;
	
	public static StorageHelper getInstance() {

		if (STInstance == null) {
			STInstance = new StorageHelper();
		}
		
		return STInstance;
	}
	
	public void setOutputRuleFile(String file) {
		OUTPUTFILE_RULES = file;
	}
	
	public void setOutputExternSpecFile(String file) {
		OUTPUTFILE_EXTERNSPEC = file;
	}
	
	public void setOutputStatusFile(String file) {
		OUTPUTFILE_STATUS = file;
	}
	
	public void setOutputFolder(String file) {
		LOCATION = file;
	}

	private StorageHelper() {
		rc = new RuleContainer(LOCATION + OUTPUTFILE_RULES);
		esc = new ExternAndSpecificationContainer(LOCATION + OUTPUTFILE_EXTERNSPEC);
		sc = new StatusContainer(LOCATION + OUTPUTFILE_STATUS);
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
	
	// TODO testen was passiert, wenn es nicht geht
	public void printToFile() {
		rc.printToFile();
		esc.printToFile();
		sc.printToFile();
	}
}
