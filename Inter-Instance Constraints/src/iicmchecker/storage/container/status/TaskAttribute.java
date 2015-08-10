package iicmchecker.storage.container.status;

import iicmchecker.storage.container.Fact;
import iicmchecker.utils.StringChecker;

public class TaskAttribute extends Fact{

	private static final int NUMBER_OF_ARGUMENTS = 3;
	private static final String NAME = "attribute";
	
	public enum AttrType {STRING, NUMBER};
	private AttrType attrType = AttrType.STRING;

	/*
	 * String_var(TT, AttrName, AttrValue)
	 */

	public TaskAttribute(String taskID, String attrName, String attrValue) {
		super(NAME, NUMBER_OF_ARGUMENTS);
		setArgument(0, taskID);
		setArgument(1, attrName);

		if (StringChecker.isValidNumber(attrValue)) {
			setArgument(2, String.valueOf(attrValue));
		} else {
		    setArgument(2, "'" + attrValue + "'");
		}
	}
}
