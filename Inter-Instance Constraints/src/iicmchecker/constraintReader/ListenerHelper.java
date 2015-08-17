package iicmchecker.constraintReader;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

import iicmchecker.constraintReader.IIListener.InputContext;
import iicmchecker.constraintReader.IIListener.RuleContext;
import iicmchecker.storage.container.Fact;
import iicmchecker.storage.container.Rule;
import iicmchecker.storage.container.RuleBody;
import iicmchecker.storage.container.logical.Konjunction;
import iicmchecker.storage.container.rules.CannotDoRole;
import iicmchecker.storage.container.rules.CannotDoUser;
import iicmchecker.storage.container.rules.IllegalExecution;
import iicmchecker.storage.container.rules.IllegalExecutionRule;
import iicmchecker.storage.container.rules.MustDoRole;
import iicmchecker.storage.container.rules.MustDoUser;
import iicmchecker.storage.container.rules.RoleCannotDoRule;
import iicmchecker.storage.container.rules.RoleMustDoRule;
import iicmchecker.storage.container.rules.UserCannotDoRule;
import iicmchecker.storage.container.rules.UserMustDoRule;
import iicmchecker.storage.container.status.TaskName;
import iicmchecker.storage.container.status.TaskWorkflow;
import iicmchecker.storage.container.status.WorkflowName;
import iicmchecker.utils.exceptions.UnexpectedNumberOfChildrenException;


public class ListenerHelper {
	
	private static int variable_for_vars = 0;
	private static int variable_for_ruleIDs = 0;

	public void checkChildCount(int expected, int actual) {
		if (expected != actual) {

			new UnexpectedNumberOfChildrenException(actual, expected);
		}
		
	}
	
	public static String generateStringForVar() {
		variable_for_vars++;
		return "GENERATED" + String.valueOf(variable_for_vars);
	}
	
	public static String generateRuleID() {
		variable_for_ruleIDs++;
		return "'RULEID" + String.valueOf(variable_for_ruleIDs) + "'";
	}

	public long parseAndAddValue(String text) {
		String[] value = new String[2];
		value[0] = text.substring(0, text.length() - 1);
		value[1] = text.substring(text.length() - 1, text.length());
		System.out.println(value[0] + " " + value[1]);
	
		Date d = new Date(0);
		
		if (value[1].equals("Y")) {
			d.setYear(70 + Integer.parseInt(value[0]));
		} else if (value[1].equals("M")) {
			d.setMonth(Integer.parseInt(value[0]));
		} else if (value[1].equals("D")) {
			d.setDate(Integer.parseInt(value[0]));
		} else if (value[1].equals("h")) {
			d.setHours(Integer.parseInt(value[0]));
		} else if (value[1].equals("m")) {
			d.setMinutes(Integer.parseInt(value[0]));
		} else if (value[1].equals("s")) {
			String[] ms = value[0].split("\\.");
			d.setSeconds(Integer.parseInt(ms[0]));
			if (ms.length ==2) {
				d.setTime(d.getTime() + Integer.parseInt(ms[1]));
			}
			
		}
		
		
		System.out.println("Timespan " + d.getTime());
		
		return d.getTime();
	}

	public long parseDate(String text) {
		String[] date = text.split("-");
		Date d = new Date();
		d.setTime(0); // TODO Was muss man hier angeben?
		int length = date.length;
		if (length == 1) {
			d.setYear(Integer.parseInt(date[0]) - 1900);
			d.setMonth(0);
			d.setDate(1);
		} else if (length == 2) {
			d.setYear(Integer.parseInt(date[0]) - 1900);
			d.setMonth(Integer.parseInt(date[1])-1);
			d.setDate(1);
		} else if (length == 3) {
			d.setYear(Integer.parseInt(date[0]) - 1900);
			d.setMonth(Integer.parseInt(date[1])-1);
			d.setDate(Integer.parseInt(date[2]));
		} else {
			System.out.println("Error ind ParseDate");
		}
		System.out.println("Date in lh: " + d.toString());
		return d.getTime();
	}

	public long parseTime(String text) {
		String[] time = text.split(":");
		Date d = new Date();
		d.setYear(70);
		d.setMonth(0);
		d.setDate(1);
		d.setTime(0);
		
		
		int length = time.length;
		
		if (length == 1) {
			d.setHours(Integer.parseInt(time[0]));
		} else if (length == 2) {
			d.setHours(Integer.parseInt(time[0]));
			d.setMinutes(Integer.parseInt(time[1]));
		} else if (length == 3) {
			System.out.println(time[2].length());
			System.out.println(time[2]);
			System.out.println(time[2].split("\\.").length);
			String[] ms = time[2].split("\\.");
			d.setHours(Integer.parseInt(time[0]));
			d.setMinutes(Integer.parseInt(time[1]));
			d.setSeconds(Integer.parseInt(ms[0]));
			if (ms.length == 2) {
				d.setTime(d.getTime() + Integer.parseInt(ms[1]));
				
			}
		} else {
			System.out.println("Error in parseTime");
		}
		
		System.out.println("parse Time " + d.toString());
		
		return d.getTime();
	}

	public long parseDateTime(String text) {
		String[] datetime = text.split("T");
		Date d = new Date();
		d.setTime(0);
		
		long date = parseDate(datetime[0]);
		long time = parseTime(datetime[1]);
		
		d.setTime(date + time);
		
		System.out.println("parse DateTime " + d.toString());
		return d.getTime();
	}

	public static void parseTaskName(IIListener l) {
		if(l.ruleContext == RuleContext.INTERINSTANCE) {
			l.workflowID = l.taskName.split("\\.")[1];
			l.taskName = l.taskName.split("\\.")[0];
		} else if (l.ruleContext == RuleContext.INTERPROCESS) {
			l.workflowName = l.taskName.split("\\.")[2];
			l.workflowID = l.taskName.split("\\.")[1];
			l.taskName = l.taskName.split("\\.")[0];
		}
	}

	public static void addContextSpecificPredicates(IIListener l,
			ArrayList<Fact> tmp, String taskID) {
		
		if(l.ruleContext == RuleContext.INTERINSTANCE) {
			tmp.add(new TaskWorkflow(taskID, l.workflowID));
		} else if (l.ruleContext == RuleContext.INTERPROCESS) {
			tmp.add(new TaskWorkflow(taskID, l.workflowID));
			tmp.add(new WorkflowName(l.workflowID, l.workflowName));
		}
		
	}

	public static void addTmpToBody(IIListener l, ArrayList<Fact> tmp) {
		if (l.disjunction) {
			l.disjunction_body.add(new Konjunction(tmp));
		} else if (l.negation) {
			l.negation_body.addAll(tmp);
		}
		else if (l.inputContext == InputContext.ASSIGNMENT_BODY) {
			l.rule_body.addFacts(tmp);
		} else if(l.inputContext == InputContext.CONDITIONAL_BODY) {
			l.conditional_body.addFacts(tmp);
		} else {System.out.println("Fehler"); System.exit(0);}
		
	}

	public static void addContextSpecificPredicatesToRule(IIListener l) {
			String taskID = l.taskIDs.get(l.taskName);

			ArrayList<Fact> tmp = new ArrayList<Fact>();
			
			Collection<String> valueset = l.taskIDs.values();
			
			ListenerHelper.addContextSpecificPredicates(l, tmp, taskID);
			
			switch(l.ruleContext) {
			case INTRAINSTANCE: 
				l.workflowID = ListenerHelper.generateStringForVar();
				for (String id : valueset) {
					l.rule_body.addFact(new TaskWorkflow(id, l.workflowID));
				}
				break;
			case INTERINSTANCE:	
				String workflowName = ListenerHelper.generateStringForVar();
				for (String id : valueset) {
					l.workflowID = ListenerHelper.generateStringForVar();
					l.rule_body.addFact(new TaskWorkflow(id, l.workflowID));
					l.rule_body.addFact(new WorkflowName(l.workflowID, workflowName));
				}
				break;
			case INTERPROCESS: break; // TODO hier ist alles egal?
			default: System.exit(0); break; // TODO
			}

	}
	
	public static void setUserCannotDoRule(IIListener l, UserCannotDoRule rule, CannotDoUser head) {	
		rule.setHead(head);
		rule.setBody(l.rule_body);
		System.out.println("a " + l.description);
		if (l.description == null || l.description == "") {

			System.out.println("c " + l.description);
			l.description = ListenerHelper.generateRuleID();
		}
		System.out.println("b " + l.description);
		rule.setDescription(l.description);
		l.rc.addUserCannotDoRule(rule);
	}
	
	public static void setRoleCannotDoRule(IIListener l, RoleCannotDoRule rule, CannotDoRole head) {	
		rule.setHead(head);
		rule.setBody(l.rule_body);
		System.out.println("a " + l.description);
		if (l.description == null || l.description == "") {

			System.out.println("c " + l.description);
			l.description = ListenerHelper.generateRuleID();
		}
		System.out.println("b " + l.description);
		rule.setDescription(l.description);
		l.rc.addRoleCannotDoRule(rule);
	}
	
	public static void setUserMustDoRule(IIListener l, UserMustDoRule rule, MustDoUser head) {	
		rule.setHead(head);
		rule.setBody(l.rule_body);
		System.out.println("a " + l.description);
		if (l.description == null || l.description == "") {

			System.out.println("c " + l.description);
			l.description = ListenerHelper.generateRuleID();
		}
		System.out.println("b " + l.description);
		rule.setDescription(l.description);
		l.rc.addUserMustDoRule(rule);
	}
	
	public static void setRoleMustDoRule(IIListener l, RoleMustDoRule rule, MustDoRole head) {	
		rule.setHead(head);
		rule.setBody(l.rule_body);
		System.out.println("a " + l.description);
		if (l.description == null || l.description == "") {

			System.out.println("c " + l.description);
			l.description = ListenerHelper.generateRuleID();
		}
		System.out.println("b " + l.description);
		rule.setDescription(l.description);
		l.rc.addRoleMustDoRule(rule);
	}
	
	public static void setIllegalExecutionRule(IIListener l, IllegalExecutionRule rule, IllegalExecution head) {	
		rule.setHead(head);
		rule.setBody(l.rule_body);
		System.out.println("a " + l.description);
		if (l.description == null || l.description == "") {

			System.out.println("c " + l.description);
			l.description = ListenerHelper.generateRuleID();
		}
		System.out.println("b " + l.description);
		rule.setDescription(l.description);
		l.rc.addIllegalExecutionRule(rule);
	}
	
	public static void generateTaskID(IIListener l) {
		if (!l.taskIDs.containsKey(l.taskName)) {
			String taskID = ListenerHelper.generateStringForVar();
			l.taskIDs.put(l.taskName, taskID);
			l.rule_body.setFirst(new TaskName(taskID, l.taskName));
		}
		
		l.taskID = l.taskIDs.get(l.taskName);
	}
	
}
