package iicmchecker.storage.container.status;

import iicmchecker.storage.container.Fact;

public class TaskAttribute extends Fact{

	private static final int NUMBER_OF_ARGUMENTS = 4;
	private static final String NAME = "attribute";
	
	public enum AttrType {STRING, NUMBER};
	private AttrType attrType = AttrType.STRING;

	/*
	 * String_var(TT, AttrName, AttrType, AttrValue)
	 */
	public TaskAttribute(AttrType at) {
		super(NAME, NUMBER_OF_ARGUMENTS);
		switch(at) {
		case STRING: setArgument(2, "string"); break;
		case NUMBER: setArgument(2, "number"); break;
		default: //TODO
			System.exit(0);
		}
	}

	public TaskAttribute(String taskID, String attrName, String attrValue) {
		super(NAME, NUMBER_OF_ARGUMENTS);
		setArgument(0, taskID);
		setArgument(1, attrName);
		setArgument(2, "'string'");
		setArgument(3, "'" + attrValue + "'");
	}
	
	public TaskAttribute(String taskID, String attrName, Integer attrValue) {
		super(NAME, NUMBER_OF_ARGUMENTS);
		setArgument(0, taskID);
		setArgument(1, attrName);
		setArgument(2, "'number'");
		setArgument(3, String.valueOf(attrValue));
	}
	
	


}
