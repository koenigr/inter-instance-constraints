package iicmchecker.constraintReader;



import iicmchecker.constraintReader.Inter_InstanceParser.DefinedClauseContext;
import iicmchecker.storage.StorageHelper;
import iicmchecker.storage.container.Fact;
import iicmchecker.storage.container.RuleBody;
import iicmchecker.storage.container.ConditionalBody;
import iicmchecker.storage.container.comparison.Equality;
import iicmchecker.storage.container.comparison.GEQ;
import iicmchecker.storage.container.comparison.Greater;
import iicmchecker.storage.container.comparison.Inequality;
import iicmchecker.storage.container.comparison.LEQ;
import iicmchecker.storage.container.comparison.Lower;
import iicmchecker.storage.container.conditional.Avg;
import iicmchecker.storage.container.conditional.Max;
import iicmchecker.storage.container.conditional.Min;
import iicmchecker.storage.container.conditional.NumSimple;
import iicmchecker.storage.container.conditional.NumVars;
import iicmchecker.storage.container.conditional.Sum;
import iicmchecker.storage.container.externspec.CriticalTaskPair;
import iicmchecker.storage.container.externspec.Dominates;
import iicmchecker.storage.container.container.ExternAndSpecificationContainer;
import iicmchecker.storage.container.externspec.Collaborator;
import iicmchecker.storage.container.externspec.GLB;
import iicmchecker.storage.container.externspec.LUB;
import iicmchecker.storage.container.externspec.Partner;
import iicmchecker.storage.container.externspec.Related;
import iicmchecker.storage.container.externspec.RoleTask;
import iicmchecker.storage.container.externspec.SameGroup;
import iicmchecker.storage.container.externspec.UserRole;
import iicmchecker.storage.container.externspec.UserTask;
import iicmchecker.storage.container.logical.Disjunction;
import iicmchecker.storage.container.logical.Konjunction;
import iicmchecker.storage.container.logical.Negation;
import iicmchecker.storage.container.rules.CannotDoRole;
import iicmchecker.storage.container.rules.CannotDoUser;
import iicmchecker.storage.container.rules.Defined;
import iicmchecker.storage.container.rules.DefinedRule;
import iicmchecker.storage.container.rules.MustDoRole;
import iicmchecker.storage.container.rules.MustDoUser;
import iicmchecker.storage.container.rules.IllegalExecution;
import iicmchecker.storage.container.rules.IllegalExecutionRule;
import iicmchecker.storage.container.rules.RoleCannotDoRule;
import iicmchecker.storage.container.rules.RoleMustDoRule;
import iicmchecker.storage.container.container.RuleContainer;
import iicmchecker.storage.container.rules.UserCannotDoRule;
import iicmchecker.storage.container.rules.UserMustDoRule;
import iicmchecker.storage.container.status.ExecutedGroupStatus;
import iicmchecker.storage.container.status.ExecutedUserStatus;
import iicmchecker.storage.container.status.TaskAttribute;
import iicmchecker.storage.container.status.TaskEvent;
import iicmchecker.storage.container.status.TaskName;
import iicmchecker.storage.container.status.TaskWorkflow;
import iicmchecker.storage.container.status.Timestamp;
import iicmchecker.storage.container.status.WorkflowName;
import iicmchecker.utils.EventHelper;
import iicmchecker.utils.EventHelper.EventTypes;
import iicmchecker.utils.exceptions.UnexpectedContextException;
import iicmchecker.utils.logging.LoggerFactory;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Set;
import java.util.logging.Logger;

import de.uni.freiburg.iig.telematik.sewol.log.EventType;


public class IIListener extends Inter_InstanceBaseListener {
	
	protected ExternAndSpecificationContainer esc;
	
	protected RuleContainer rc;
	
	protected Logger logger = LoggerFactory.getLogger();
	
	protected enum InputContext {UNDEF, SETTING, DEFINE, ASSIGNMENT_HEAD, ASSIGNMENT_BODY, CONDITIONAL_BODY}
	
	protected boolean negation = false;
	
	protected boolean disjunction = false;
	
	protected InputContext inputContext = InputContext.UNDEF;
	
	protected enum RuleContext {UNDEF, INTRAINSTANCE, INTERINSTANCE, INTERPROCESS}
	
	protected RuleContext ruleContext = RuleContext.UNDEF; // TODO prüfen, ob der Kontext eingehalten wurde
	
	protected RuleBody rule_body = new RuleBody();
	
	protected ConditionalBody conditional_body;
	
	protected ArrayList<Fact> negation_body = new ArrayList<Fact>(); 
	
	protected ArrayList<Fact> disjunction_body = new ArrayList<Fact>(); 
	
	protected HashMap<String, String> taskIDs = new HashMap<String, String>();
	
	protected String description;
	
	protected String taskName;
	
	protected String workflowID;
	 
	protected String workflowName;
	
	protected String taskID;
	
	private ListenerHelper lh= new ListenerHelper();
	
	public IIListener() {
		
		logger.severe("IIListener initialized");
		
		esc = StorageHelper.getInstance().getExternSpecContainer();
		
		rc = StorageHelper.getInstance().getRuleContainer();
	}

	public void enterFile(Inter_InstanceParser.FileContext ctx) {
		logger.severe("Entering File...");
	}
	
	public void exitFile(Inter_InstanceParser.FileContext ctx) {
		logger.severe("Exiting File...");
	}
	
	public void enterExplicitSetting(Inter_InstanceParser.ExplicitSettingContext ctx) {
		logger.info("Entering Explicit setting inputContext");
		inputContext = InputContext.SETTING;
	}
	
	public void exitExplicitSetting(Inter_InstanceParser.ExplicitSettingContext ctx) {
		logger.info("Exiting Explicit setting inputContext");
		inputContext = InputContext.UNDEF;
		ruleContext = RuleContext.UNDEF;
	}
	
	public void enterDefine(Inter_InstanceParser.DefineContext ctx) {
		logger.info("Entering Define inputContext");
		inputContext = InputContext.DEFINE;
	}
	
	public void exitDefine(Inter_InstanceParser.DefineContext ctx) {
		logger.info("Exiting Define inputContext");
		inputContext = InputContext.UNDEF;
	}
	
	@Override
	public void enterIntra(Inter_InstanceParser.IntraContext ctx) {
		switch(ruleContext) {
		case UNDEF: ruleContext = RuleContext.INTRAINSTANCE; break;
		case INTRAINSTANCE: break;
		default: new UnexpectedContextException("IntraInstance", ruleContext.toString());
		}
	}
	
	@Override
	public void enterInter(Inter_InstanceParser.InterContext ctx) {

		switch(ruleContext) {
		case UNDEF: ruleContext = RuleContext.INTERINSTANCE; break;
		case INTERINSTANCE: break;
		default: new UnexpectedContextException("InterInstance", ruleContext.toString());
		}
	}
	
	@Override
	public void enterInterp(Inter_InstanceParser.InterpContext ctx) {

		switch(ruleContext) {
		case UNDEF: ruleContext = RuleContext.INTERPROCESS; break;
		case INTERPROCESS: break;
		default: new UnexpectedContextException("Interprocess", ruleContext.toString());
		}
	}

	@Override
	public void exitDescription(Inter_InstanceParser.DescriptionContext ctx) {
		description = ctx.getChild(1).getText();
	}

	@Override
	public void enterAssignmentBody(Inter_InstanceParser.AssignmentBodyContext ctx) {
		logger.info("Entering assignmentbody");
		inputContext = InputContext.ASSIGNMENT_BODY;

	}

	@Override
	public void exitAssignmentBody(Inter_InstanceParser.AssignmentBodyContext ctx) {
		logger.info("Exiting assignmentbody");
		inputContext = InputContext.UNDEF;

	}
	
	@Override
	public void exitAssignment(Inter_InstanceParser.AssignmentContext ctx) {
		description = "";
		ruleContext = RuleContext.UNDEF;
		taskIDs.clear();
		rule_body = new RuleBody();
	}

	@Override
	public void enterAssignmentHead(Inter_InstanceParser.AssignmentHeadContext ctx) {
		inputContext = InputContext.ASSIGNMENT_HEAD;
		
	}

	@Override
	public void exitAssignmentHead(Inter_InstanceParser.AssignmentHeadContext ctx) {
		logger.info("Exiting assignment head");
		inputContext = InputContext.UNDEF;
		
	}
	
	/*
	 * EXTERN
	 */

	@Override
	public void exitPartnerof(Inter_InstanceParser.PartnerofContext ctx) {
		logger.info("Exiting Partner inputContext");
		
		lh.checkChildCount(3, ctx.getChildCount());
		
		String user1 = ctx.getChild(0).getText();
		String user2 = ctx.getChild(2).getText();
		Partner r = new Partner(user1, user2);
		
		if (inputContext == InputContext.SETTING) {
			esc.addPartner(r);
		} else {
		    ArrayList<Fact> tmp = new ArrayList<Fact>();
		    tmp.add(r);
		    ListenerHelper.addTmpToBody(this, tmp);
		}
	}
	
	@Override
	public void exitSamegroup(Inter_InstanceParser.SamegroupContext ctx) {
		logger.info("Exiting sameGroup inputContext");
		
		lh.checkChildCount(3, ctx.getChildCount());
		String user1 = ctx.getChild(0).getText();
		String user2 = ctx.getChild(2).getText();
		SameGroup r = new SameGroup(user1, user2);
		
		if (inputContext == InputContext.SETTING) {
			esc.addSameGroup(r);
		} else {
		    ArrayList<Fact> tmp = new ArrayList<Fact>();
		    tmp.add(r);
		    ListenerHelper.addTmpToBody(this, tmp);
		}
		
	}

	@Override
	public void exitRelated(Inter_InstanceParser.RelatedContext ctx) {
		logger.info("Exiting Related inputContext");
		
		lh.checkChildCount(3, ctx.getChildCount());
		
		String user1 = ctx.getChild(0).getText();
		String user2 = ctx.getChild(2).getText();
		Related r = new Related(user1, user2);
		
		if (inputContext == InputContext.SETTING) {
			esc.addRelated(r);
		} else {
		    ArrayList<Fact> tmp = new ArrayList<Fact>();
		    tmp.add(r);
		    ListenerHelper.addTmpToBody(this, tmp);
		}
		
	}
	
	/*
	 * SPECIFICATION
	 */
	
	@Override
	public void exitRoleTask(Inter_InstanceParser.RoleTaskContext ctx) {
		logger.info("Exiting Role Task Context");

		lh.checkChildCount(4, ctx.getChildCount());
		String role = ctx.getChild(1).getText();
		String task = ctx.getChild(3).getText();
		RoleTask r = new RoleTask(role, task);
		
		if (inputContext == InputContext.SETTING) {
			esc.addRoleTask(r);
		} else {
		    ArrayList<Fact> tmp = new ArrayList<Fact>();
		    tmp.add(r);
		    ListenerHelper.addTmpToBody(this, tmp);
		}
		
	}

	@Override
	public void exitUserTask(Inter_InstanceParser.UserTaskContext ctx) {
		logger.info("Exiting User Task Context");

		lh.checkChildCount(4, ctx.getChildCount());
		String user = ctx.getChild(1).getText();
		String task = ctx.getChild(3).getText();
		UserTask r = new UserTask(user, task);
		
		if (inputContext == InputContext.SETTING) {
			esc.addUserTask(r);
		} else {
		    ArrayList<Fact> tmp = new ArrayList<Fact>();
		    tmp.add(r);
		    ListenerHelper.addTmpToBody(this, tmp);
		}
	}

	@Override
	public void exitUserRole(Inter_InstanceParser.UserRoleContext ctx) {
		logger.info("Exiting User Role Context");

		lh.checkChildCount(4, ctx.getChildCount());
		String user = ctx.getChild(1).getText();
		String role = ctx.getChild(3).getText();
		UserRole r = new UserRole(user, role);
		
		if (inputContext == InputContext.SETTING) {
			esc.addUserRole(r);
		} else {
		    ArrayList<Fact> tmp = new ArrayList<Fact>();
		    tmp.add(r);
		    ListenerHelper.addTmpToBody(this, tmp);
		}
	}

	@Override
	public void exitGlb(Inter_InstanceParser.GlbContext ctx) {
		logger.info("Exiting Glb Context");

		lh.checkChildCount(3, ctx.getChildCount());
		String role = ctx.getChild(0).getText();
		String task = ctx.getChild(2).getText();
		GLB r = new GLB(role, task);
		
		if (inputContext == InputContext.SETTING) {
			esc.addGLB(r);
		} else {
		    ArrayList<Fact> tmp = new ArrayList<Fact>();
		    tmp.add(r);
		    ListenerHelper.addTmpToBody(this, tmp);
		}
	}

	@Override
	public void exitLub(Inter_InstanceParser.LubContext ctx) {
		logger.info("Exiting Lub Context");
		lh.checkChildCount(3, ctx.getChildCount());
		String role = ctx.getChild(0).getText();
		String task = ctx.getChild(2).getText();
		LUB r = new LUB(role, task);
		
		if (inputContext == InputContext.SETTING) {
			esc.addLUB(r);
		} else {
		    ArrayList<Fact> tmp = new ArrayList<Fact>();
		    tmp.add(r);
		    ListenerHelper.addTmpToBody(this, tmp);
		}
	}

	@Override
	public void exitDominate(Inter_InstanceParser.DominateContext ctx) {
		logger.info("Exiting Dominate Context");

		lh.checkChildCount(3, ctx.getChildCount());
		String role1 = ctx.getChild(0).getText();
		String role2 = ctx.getChild(2).getText();
		Dominates r = new Dominates(role1, role2);
		
		if (inputContext == InputContext.SETTING) {
			esc.addDominates(r);
		} else {
		    ArrayList<Fact> tmp = new ArrayList<Fact>();
		    tmp.add(r);
		    ListenerHelper.addTmpToBody(this, tmp);
		}
	}

	@Override
	public void exitCritTaskPair(Inter_InstanceParser.CritTaskPairContext ctx) {
		logger.info("Exiting Critical Task Pair Context");

		lh.checkChildCount(4, ctx.getChildCount());
		String task1 = ctx.getChild(0).getText();
		String task2 = ctx.getChild(2).getText();
		CriticalTaskPair r = new CriticalTaskPair(task1, task2);
		
		if (inputContext == InputContext.SETTING) {
			esc.addCriticalTaskPair(r);
		} else {
		    ArrayList<Fact> tmp = new ArrayList<Fact>();
		    tmp.add(r);
		    ListenerHelper.addTmpToBody(this, tmp);
		}
		
	}
	
	/*
	 * ENFORCEMENT
	 */

	@Override
	public void exitCannotUser(Inter_InstanceParser.CannotUserContext ctx) {
		
		logger.info("Exiting Cannot User Context");

		lh.checkChildCount(4, ctx.getChildCount());
		
		assert(inputContext == InputContext.ASSIGNMENT_HEAD); 

		UserCannotDoRule rule = new UserCannotDoRule();
		String user = ctx.getChild(1).getText();
		taskName = ctx.getChild(3).getText();
		workflowID = "";
		workflowName = "";

		ListenerHelper.parseTaskName(this);
		
		ListenerHelper.generateTaskID(this);
		
		System.out.println("Task Name: " + taskName);
		System.out.println(taskID);
		System.out.println(workflowID);
		System.out.println(workflowName);
		
		CannotDoUser head = new CannotDoUser(user, taskID);
		
		ListenerHelper.addContextSpecificPredicatesToRule(this);
		
		ListenerHelper.setUserCannotDoRule(this, rule, head);
		
	}

	@Override
	public void exitCannotRole(Inter_InstanceParser.CannotRoleContext ctx) {
		
		logger.info("Exiting Cannot Role Context");
		
		lh.checkChildCount(4, ctx.getChildCount());
		
		assert(inputContext == InputContext.ASSIGNMENT_HEAD); 

		RoleCannotDoRule rule = new RoleCannotDoRule();
		String user = ctx.getChild(1).getText();
		taskName = ctx.getChild(3).getText();
		workflowID = "";
		workflowName = "";

		ListenerHelper.parseTaskName(this);
		
		ListenerHelper.generateTaskID(this);
		
		System.out.println(taskName);
		System.out.println(taskID);
		System.out.println(workflowID);
		System.out.println(workflowName);
		
		CannotDoRole head = new CannotDoRole(user, taskID);
		
		ListenerHelper.addContextSpecificPredicatesToRule(this);
		
		ListenerHelper.setRoleCannotDoRule(this, rule, head);
	}

	@Override
	public void exitMustUser(Inter_InstanceParser.MustUserContext ctx) {
		
		logger.info("Exiting Cannot Role Context");
		
		lh.checkChildCount(4, ctx.getChildCount());
		
		assert(inputContext == InputContext.ASSIGNMENT_HEAD); 

		UserMustDoRule rule = new UserMustDoRule();
		String user = ctx.getChild(1).getText();
		taskName = ctx.getChild(3).getText();
		workflowID = "";
		workflowName = "";

		ListenerHelper.parseTaskName(this);
		
		ListenerHelper.generateTaskID(this);
		
		System.out.println(taskName);
		System.out.println(taskID);
		System.out.println(workflowID);
		System.out.println(workflowName);
		
		MustDoUser head = new MustDoUser(user, taskID);
		
		ListenerHelper.addContextSpecificPredicatesToRule(this);
		
		ListenerHelper.setUserMustDoRule(this, rule, head);
	}

	@Override
	public void exitMustRole(Inter_InstanceParser.MustRoleContext ctx) {
		
		logger.info("Exiting Cannot Role Context");
		
		lh.checkChildCount(4, ctx.getChildCount());
		
		assert(inputContext == InputContext.ASSIGNMENT_HEAD); 

		RoleMustDoRule rule = new RoleMustDoRule();
		String user = ctx.getChild(1).getText();
		taskName = ctx.getChild(3).getText();
		workflowID = "";
		workflowName = "";

		ListenerHelper.parseTaskName(this);
		
		ListenerHelper.generateTaskID(this);
		
		System.out.println(taskName);
		System.out.println(taskID);
		System.out.println(workflowID);
		System.out.println(workflowName);
		
		MustDoRole head = new MustDoRole(user, taskID);
		
		ListenerHelper.addContextSpecificPredicatesToRule(this);
		
		ListenerHelper.setRoleMustDoRule(this, rule, head);
	}


	@Override
	public void exitPanic(Inter_InstanceParser.PanicContext ctx) {
		
		logger.info("Exiting Illegal Execution Context");
		
		lh.checkChildCount(1, ctx.getChildCount());

		Collection<String> valueset = taskIDs.values();

		assert(inputContext == InputContext.ASSIGNMENT_HEAD); 

		IllegalExecutionRule rule = new IllegalExecutionRule();
		
		IllegalExecution head = new IllegalExecution();
		
		ListenerHelper.addContextSpecificPredicatesToRule(this);
		
		ListenerHelper.setIllegalExecutionRule(this, rule, head);
	}
	
	
	/*
	 * STATUS
	 */


	@Override
	public void exitExecutedUser(Inter_InstanceParser.ExecutedUserContext ctx) {
		logger.info("Exiting Executed User Context");

		lh.checkChildCount(4, ctx.getChildCount());

		String user = ctx.getChild(1).getText();
		taskName = ctx.getChild(3).getText();
		workflowID = "";
		workflowName = "";
		
		ListenerHelper.parseTaskName(this);

		ArrayList<Fact> tmp = new ArrayList<Fact>();
		
		if (!taskIDs.containsKey(taskName)) {
			String taskID = ListenerHelper.generateStringForVar();
			taskIDs.put(taskName, taskID);
			tmp.add(new TaskName(taskID, taskName));
		}

		String taskID = taskIDs.get(taskName);

		tmp.add(new ExecutedUserStatus(user, taskID));
		
		ListenerHelper.addContextSpecificPredicates(this, tmp, taskID);

		ListenerHelper.addTmpToBody(this, tmp);
		
	}
	
	@Override
	public void exitExecutedRole(Inter_InstanceParser.ExecutedRoleContext ctx) {
		logger.info("Exiting Executed Role Context");
		
		lh.checkChildCount(4, ctx.getChildCount());
		
		String role = ctx.getChild(1).getText();
		taskName = ctx.getChild(3).getText();
		workflowID = "";
		workflowName = "";

		ArrayList<Fact> tmp = new ArrayList<Fact>();
		
		ListenerHelper.parseTaskName(this);
		
		if (!taskIDs.containsKey(taskName)) {
			String taskID = ListenerHelper.generateStringForVar();
			taskIDs.put(taskName, taskID);
			tmp.add(new TaskName(taskID, taskName));
		}

		String taskID = taskIDs.get(taskName);

		tmp.add(new ExecutedGroupStatus(role, taskID));

		ListenerHelper.addContextSpecificPredicates(this, tmp, taskID);

		ListenerHelper.addTmpToBody(this, tmp);
	}
	
	@Override
	public void exitAssignedUser(Inter_InstanceParser.AssignedUserContext ctx) {
		logger.info("Assigned User Context");
		
		lh.checkChildCount(3, ctx.getChildCount());
		
		String user = ctx.getChild(0).getText();		
		taskName = ctx.getChild(2).getText();
		System.out.println("AAAAAAAAAAA: " + taskName);
		EventHelper.EventTypes event = EventHelper.EventTypes.ASSIGN;
		workflowID = "";
		workflowName = "";

		ArrayList<Fact> tmp = new ArrayList<Fact>();
		
		ListenerHelper.parseTaskName(this);

		if (!taskIDs.containsKey(taskName)) {
			String taskID = ListenerHelper.generateStringForVar();
			taskIDs.put(taskName, taskID);
			tmp.add(new TaskName(taskID, taskName));
		}
		
		String taskID = taskIDs.get(taskName);

		ListenerHelper.addContextSpecificPredicates(this, tmp, taskID);
		
		tmp.add(new ExecutedUserStatus(user, taskID));
		tmp.add(new TaskEvent(taskID, EventHelper.getAsString(event)));
		
		ListenerHelper.addTmpToBody(this, tmp);
	}

	@Override
	public void exitAbortedTask(Inter_InstanceParser.AbortedTaskContext ctx) {
		logger.info("Aborted Task Context");
		
		lh.checkChildCount(2, ctx.getChildCount());
		
		taskName = ctx.getChild(0).getText();
		workflowID = "";
		workflowName = "";
		
		ListenerHelper.parseTaskName(this);

		ArrayList<Fact> tmp = new ArrayList<Fact>();
		
		if (!taskIDs.containsKey(taskName)) {
			String taskID = ListenerHelper.generateStringForVar();
			taskIDs.put(taskName, taskID);
			tmp.add(new TaskName(taskID, taskName));
		}

		String taskID = taskIDs.get(taskName);
		
		EventHelper.EventTypes event = EventHelper.EventTypes.ATE_ABORT;

		ListenerHelper.addContextSpecificPredicates(this, tmp, taskID);
		
		tmp.add(new TaskEvent(taskID, EventHelper.getAsString(event)));

		ListenerHelper.addTmpToBody(this, tmp);
	}

	@Override
	public void exitSucceededTask(Inter_InstanceParser.SucceededTaskContext ctx) {
		logger.info("Succeeded Task Context");
		
		lh.checkChildCount(2, ctx.getChildCount());

		ArrayList<Fact> tmp = new ArrayList<Fact>();
		
		taskName = ctx.getChild(0).getText();
		workflowID = "";
		workflowName = "";
		
		ListenerHelper.parseTaskName(this);
		
		EventHelper.EventTypes event = EventHelper.EventTypes.COMPLETE;

		if (!taskIDs.containsKey(taskName)) {
			String taskID = ListenerHelper.generateStringForVar();
			taskIDs.put(taskName, taskID);
			tmp.add(new TaskName(taskID, taskName));
		}

		String taskID = taskIDs.get(taskName);
		
		ListenerHelper.addContextSpecificPredicates(this, tmp, taskID);
		
		tmp.add(new TaskEvent(taskID, EventHelper.getAsString(event)));
		
		ListenerHelper.addTmpToBody(this, tmp);
		
	}

	@Override
	public void exitCollaborator(Inter_InstanceParser.CollaboratorContext ctx) {
		logger.info("Collaborator Context");
		
		lh.checkChildCount(3, ctx.getChildCount());
		
		ArrayList<Fact> tmp = new ArrayList<Fact>();
		
		String user1 = ctx.getChild(0).getText();
		String user2 = ctx.getChild(2).getText();
		
		tmp.add(new Collaborator(user1, user2));
		
		ListenerHelper.addTmpToBody(this, tmp);
	}

	@Override
	public void exitTimeinterval(Inter_InstanceParser.TimeintervalContext ctx) {
		logger.info("Exit timeinterval Context");
		
		lh.checkChildCount(6, ctx.getChildCount());
		
		taskName = ctx.getChild(1).getText();

		workflowID = "";
		workflowName = "";
		
		ListenerHelper.parseTaskName(this);
		

		ArrayList<Fact> tmp = new ArrayList<Fact>();
		
		if (!taskIDs.containsKey(taskName)) {
			String taskID = ListenerHelper.generateStringForVar();
			taskIDs.put(taskName, taskID);
			tmp.add(new TaskName(taskID, taskName));
		}		
		

		String taskID1 = taskIDs.get(taskName);
		ListenerHelper.addContextSpecificPredicates(this, tmp, taskID1);
		
		System.out.println("BBBBBB " + taskName);

		taskName = ctx.getChild(3).getText();
		
		ListenerHelper.parseTaskName(this);
		
		if (!taskIDs.containsKey(taskName)) {
			String taskID = ListenerHelper.generateStringForVar();
			taskIDs.put(taskName, taskID);
			tmp.add(new TaskName(taskID, taskName));
		}

		String taskID2 = taskIDs.get(taskName);

		ListenerHelper.addContextSpecificPredicates(this, tmp, taskID2);
		
		String timestamp1 = ListenerHelper.generateStringForVar();
		String timestamp2 = ListenerHelper.generateStringForVar();
		
		String timeinterval = ctx.ts().returnValue;
		
		String arithmeticExpr = "(" + timestamp2 + " - " + timestamp1 + ")";
		
		tmp.add(new Timestamp(taskID1, timestamp1));
		tmp.add(new Timestamp(taskID2, timestamp2));
		tmp.add(new Equality(arithmeticExpr, timeinterval));
		
		ListenerHelper.addTmpToBody(this, tmp);
		
	}
	
	@Override
	public void exitTimestamp(Inter_InstanceParser.TimestampContext ctx) {
		logger.info("Exit timestamp Context");
		
		lh.checkChildCount(4, ctx.getChildCount());
		
		taskName = ctx.getChild(1).getText();	
		String timestamp = ctx.tp().returnValue;

		workflowID = "";
		workflowName = "";
		
		ListenerHelper.parseTaskName(this);

		ArrayList<Fact> tmp = new ArrayList<Fact>();
		
		
		
		if (!taskIDs.containsKey(taskName)) {
			String taskID = ListenerHelper.generateStringForVar();
			taskIDs.put(taskName, taskID);
			tmp.add(new TaskName(taskID, taskName));
		}

		String taskID = taskIDs.get(taskName);
		
		ListenerHelper.addContextSpecificPredicates(this, tmp, taskID);
		
		tmp.add(new Timestamp(taskID, timestamp));
		
		ListenerHelper.addTmpToBody(this, tmp);
	}
	
	@Override
	public void exitFlexibleEvent(Inter_InstanceParser.FlexibleEventContext ctx) {
	logger.info("Exit Event Context");
		
		lh.checkChildCount(4, ctx.getChildCount());
		
		taskName = ctx.getChild(1).getText();
		String eventtype = ctx.getChild(3).getText();

		workflowID = "";
		workflowName = "";
		
		ListenerHelper.parseTaskName(this);

		ArrayList<Fact> tmp = new ArrayList<Fact>();
		
		
		
		if (!taskIDs.containsKey(taskName)) {
			String taskID = ListenerHelper.generateStringForVar();
			taskIDs.put(taskName, taskID);
			tmp.add(new TaskName(taskID, taskName));
		}

		String taskID = taskIDs.get(taskName);
		
		ListenerHelper.addContextSpecificPredicates(this, tmp, taskID);
		
		tmp.add(new TaskEvent(taskID, eventtype));
		
		ListenerHelper.addTmpToBody(this, tmp);
	}
	
	@Override
	public void exitAttribute(Inter_InstanceParser.AttributeContext ctx) {
	logger.info("Exit Attribute Context");
		
		lh.checkChildCount(6, ctx.getChildCount());

		String attribute = ctx.getChild(1).getText();
		taskName = ctx.getChild(3).getText();
		String value = ctx.getChild(5).getText();

		workflowID = "";
		workflowName = "";
		
		ListenerHelper.parseTaskName(this);
		
		ArrayList<Fact> tmp = new ArrayList<Fact>();
		
		if (!taskIDs.containsKey(taskName)) {
			String taskID = ListenerHelper.generateStringForVar();
			taskIDs.put(taskName, taskID);
			tmp.add(new TaskName(taskID, taskName));
		}
		
		String taskID = taskIDs.get(taskName);
		
		ListenerHelper.addContextSpecificPredicates(this, tmp, taskID);
		
		tmp.add(new TaskAttribute(taskID, attribute, value));
		
		ListenerHelper.addTmpToBody(this, tmp);
	}
	

	/*
	 * CONDITIONAL
	 */
	
	@Override
	public void enterConditionalBody(Inter_InstanceParser.ConditionalBodyContext ctx) {
		inputContext = InputContext.CONDITIONAL_BODY;
		conditional_body = new ConditionalBody();
	}
	
	@Override
	public void exitConditionalBody(Inter_InstanceParser.ConditionalBodyContext ctx) {
		inputContext = InputContext.ASSIGNMENT_BODY;
		
	}

	
	@Override
	public void exitNumSimple(Inter_InstanceParser.NumSimpleContext ctx) {
		logger.info("Num Simple Context");
		lh.checkChildCount(7, ctx.getChildCount());
		
		String result = ctx.getChild(6).getText();
		NumSimple ns = new NumSimple(result);
		ns.setBody(conditional_body);
		rule_body.addFact(ns);
	}
	
	@Override
	public void exitNumVars(Inter_InstanceParser.NumVarsContext ctx) {
		
		logger.info("Num Vars Context");
		lh.checkChildCount(8, ctx.getChildCount());
		
		String var = ctx.getChild(1).getText();
		String result = ctx.getChild(7).getText();
		NumVars ns = new NumVars(var, result);
		ns.setBody(conditional_body);
		rule_body.addFact(ns);
	}
	
	@Override
	public void exitSum(Inter_InstanceParser.SumContext ctx) {
		logger.info("Sum Context");
		lh.checkChildCount(8, ctx.getChildCount());
		
		String var = ctx.getChild(1).getText();
		String result = ctx.getChild(7).getText();
		Sum ns = new Sum(var, result);
		ns.setBody(conditional_body);
		rule_body.addFact(ns);
	}
	
	@Override
	public void exitAvg(Inter_InstanceParser.AvgContext ctx) {
		logger.info("Num Vars Context");
		lh.checkChildCount(8, ctx.getChildCount());
		
		String var = ctx.getChild(1).getText();
		String result = ctx.getChild(7).getText();
		Avg ns = new Avg(var, result);
		ns.setBody(conditional_body);
		rule_body.addFact(ns);
	}
	
	@Override
	public void exitMin(Inter_InstanceParser.MinContext ctx) {
		logger.info("Num Vars Context");
		lh.checkChildCount(8, ctx.getChildCount());
		
		String var = ctx.getChild(1).getText();
		String result = ctx.getChild(7).getText();
		Min ns = new Min(var, result);
		ns.setBody(conditional_body);
		rule_body.addFact(ns);
	}
	
	@Override
	public void exitMax(Inter_InstanceParser.MaxContext ctx) {
		logger.info("Num Vars Context");
		lh.checkChildCount(8, ctx.getChildCount());
		
		String var = ctx.getChild(1).getText();
		String result = ctx.getChild(7).getText();
		Max ns = new Max(var, result);
		ns.setBody(conditional_body);
		rule_body.addFact(ns);
	}
	
	/*
	 * DISJUNCTION
	 */
	
	@Override
	public void enterDisjunction(Inter_InstanceParser.DisjunctionContext ctx) {
		logger.info("Enter Disjunction Context");
		disjunction = true;
	}
	
	@Override
	public void exitDisjunction(Inter_InstanceParser.DisjunctionContext ctx) {
		logger.info("Exit Disjunction Context");
		Disjunction dis = new Disjunction(disjunction_body);
		if (inputContext == InputContext.ASSIGNMENT_BODY) {
			rule_body.addFact(dis);
		} else if (inputContext == InputContext.CONDITIONAL_BODY) {
			conditional_body.addFact(dis);
		} else {
			System.out.println("Problem bei Exit Disjunction");
			System.exit(0);
		}
		
		disjunction_body.clear();
		disjunction = false;
	}
	
	/*
	 * NEGATION
	 */
	
	@Override
	public void enterNegation(Inter_InstanceParser.NegationContext ctx) {
		logger.info("Enter Negation Context");
		negation = true;
	}
	
	@Override
	public void exitNegation(Inter_InstanceParser.NegationContext ctx) {
		logger.info("Exit Negation Context");
		System.out.println("Size of negation body: " + negation_body.size());
		
		Negation neg = new Negation(negation_body);
		if(inputContext == InputContext.ASSIGNMENT_BODY) {
			rule_body.addFact(neg);
		} else if (inputContext == InputContext.CONDITIONAL_BODY) {
			conditional_body.addFact(neg);
		} else {
			System.out.println("Fehler bei exit Negation");
		}
		
		System.out.println(neg.getSize());
		negation_body.clear();
		System.out.println(neg.getSize());
		negation = false;
	}

	/*
	 * COMPARISON
	 */
	@Override
	public void exitEqualityExpr(Inter_InstanceParser.EqualityExprContext ctx) {
		logger.info("Exit Equality Expression");
		lh.checkChildCount(3, ctx.getChildCount());
		
		
		String left = ctx.comparisonArg(0).returnValue;
		String right = ctx.comparisonArg(1).returnValue;
		
		if (negation == true) {
			negation_body.add(new Equality(left, right));
		} else if (disjunction == true) {
			disjunction_body.add(new Equality(left, right));
		} else if (inputContext == InputContext.ASSIGNMENT_BODY) {
			if (ctx.getChild(1).getText().equals("=")) {
				rule_body.addFact(new Equality(left, right));
			} else if (ctx.getChild(1).getText().equals("!=")) {
				rule_body.addFact(new Inequality(left, right));
			} else {
				logger.severe("Problem in EuqualityExpression");
				System.exit(0);
			}
		} else if  (inputContext == InputContext.CONDITIONAL_BODY) {
			if (ctx.getChild(1).getText().equals("=")) {
				System.out.println("gleich");
				conditional_body.addFact(new Equality(left, right));
			} else if (ctx.getChild(1).getText().equals("!=")) {
				System.out.println("ungleich");
				conditional_body.addFact(new Inequality(left, right));
			} else {
				logger.severe("Problem in EqualityExpression");
				System.exit(0);
			}
		}else {
			System.out.println("Problem in EqualityExpression");
			System.exit(0);
		}
	}
	
	@Override
	public void exitInequalityExpr(Inter_InstanceParser.InequalityExprContext ctx) {
		logger.info("Exit Inequality Expression");
		lh.checkChildCount(3, ctx.getChildCount());
		String left = ctx.comparisonArg(0).returnValue;
		String right = ctx.comparisonArg(1).returnValue;
			
		if (negation == true) {
			negation_body.add(new Lower(left, right));
		} else if (disjunction == true) {
			disjunction_body.add(new Lower(left, right));
		} else if (inputContext == InputContext.ASSIGNMENT_BODY) {
			if (ctx.getChild(1).getText().equals("<")) {
				rule_body.addFact(new Lower(left, right));
			} else if (ctx.getChild(1).getText().equals("<=")) {
				rule_body.addFact(new LEQ(left, right));
			} else if (ctx.getChild(1).getText().equals(">")) {
				rule_body.addFact(new Greater(left, right));
			} else if (ctx.getChild(1).getText().equals(">=")) {
				rule_body.addFact(new GEQ(left, right));
			}else {
				logger.severe("Problem in InequalityExpression");
				System.exit(0);
			}
		} else if  (inputContext == InputContext.CONDITIONAL_BODY) {
			if (ctx.getChild(1).getText().equals("<")) {
				System.out.println("kleiner");
				conditional_body.addFact(new Lower(left, right));
			} else if (ctx.getChild(1).getText().equals("<=")) {
				System.out.println("kleinergleich");
				conditional_body.addFact(new LEQ(left, right));
			} else if (ctx.getChild(1).getText().equals(">")) {
				System.out.println("größer");
				conditional_body.addFact(new Greater(left, right));
			} else if (ctx.getChild(1).getText().equals(">=")) {
				System.out.println("größergleich");
				conditional_body.addFact(new GEQ(left, right));
			}else {
				logger.severe("Problem in InequalityExpression");
				System.exit(0);
			}
		}else {
			logger.severe("Problem in InequalityExpression Disjunction");
			System.exit(0);
		}
	}
	/*
	 * ARITHMETIC
	 */

	@Override
	public void exitArithmeticExpr(Inter_InstanceParser.ArithmeticExprContext ctx) {
		logger.info("Exit Arithmetic Expression");
		lh.checkChildCount(5, ctx.getChildCount());
		
		System.out.println("ArithmeticArg0 "+ctx.arithmeticArg(0).returnValue);
		System.out.println("ArithmeticArg1 "+ctx.arithmeticArg(1).returnValue);
		
		String child1 = ctx.arithmeticArg(0).returnValue; 
		String child2 = ctx.arithmeticArg(1).returnValue;
		

		ctx.returnValue = ctx.getChild(0).getText() + child1
				+ ctx.getChild(2).getText() + child2
				+ ctx.getChild(4).getText();
		

		System.out.println(ctx.returnValue);
	}
	
	
	/*
	 * All return values of Constants and Variables 
	 */
	
	@Override
	public void exitArithmeticNT(Inter_InstanceParser.ArithmeticNTContext ctx) {
		logger.info("Exit ArithmeticNT Context");
		ctx.returnValue = ctx.getText();
	}
	
	@Override
	public void exitArithmeticEx(Inter_InstanceParser.ArithmeticExContext ctx) {
		logger.info("Exit ArithmeticEx Context");
		System.out.println("Num El in Arithmetic ex " + ctx.getChildCount());
		ctx.returnValue = ctx.arithmeticExpr().returnValue;
	}
	
	@Override
	public void exitArithmeticTP(Inter_InstanceParser.ArithmeticTPContext ctx) {
		logger.info("Exit ArithmeticTP Context");
		ctx.returnValue = ctx.tp().returnValue;
		System.out.println("Arithmetic tp: " + ctx.returnValue);
	}
	
	@Override
	public void exitArithmeticTS(Inter_InstanceParser.ArithmeticTSContext ctx) {
		logger.info("Exit ArithmeticTS Context");
		ctx.returnValue = ctx.ts().returnValue;
		System.out.println("Arithmetic ts: " + ctx.returnValue);
	}
	
	@Override
	public void exitAbsoluteInterval(Inter_InstanceParser.AbsoluteIntervalContext ctx) {
       int numElements = ctx.getChildCount();
       long returnvalue = 0;
       for (int i = 1; i < numElements - 1; i++) {
         returnvalue += lh.parseAndAddValue(ctx.getChild(i).getText());
       }
       System.out.println("Return Value Absolute Interval " + returnvalue);     
       System.out.println("Return value as String: " + new Date(returnvalue).toString());
       
       ctx.returnValue = (new Long(returnvalue)).toString(); 
	}
	
	@Override
	public void exitVarTS(Inter_InstanceParser.VarTSContext ctx) {
		logger.info("Exit VarTS Context");
		ctx.returnValue = ctx.getText();
	}
	
	@Override
	public void exitDateTime(Inter_InstanceParser.DateTimeContext ctx) {
		logger.info("Exit DateTime Context");
		
		lh.checkChildCount(3, ctx.getChildCount());
		
		long res = lh.parseDateTime(ctx.getChild(1).getText());
		ctx.returnValue = (new Long(res)).toString();
	}
	
	@Override
	public void exitDate(Inter_InstanceParser.DateContext ctx) {
		logger.info("Exit Date Context");
		
		lh.checkChildCount(3, ctx.getChildCount());
		
		long res = lh.parseDate(ctx.getChild(1).getText());
		ctx.returnValue = (new Long(res)).toString();
	}	
	
	@Override
	public void exitTime(Inter_InstanceParser.TimeContext ctx) {
		logger.info("Exit Time Context");
		lh.checkChildCount(3, ctx.getChildCount());
		
		long res = lh.parseTime(ctx.getChild(1).getText().substring(1, ctx.getChild(1).getText().length()));
		ctx.returnValue = (new Long(res)).toString();
	}	
	
	@Override
	public void exitVarTP(Inter_InstanceParser.VarTPContext ctx) {
		logger.info("Exit VarTP Context");
		ctx.returnValue = ctx.getText();
	}	
	
	@Override
	public void exitComparisonVar(Inter_InstanceParser.ComparisonVarContext ctx) {
		logger.info("Exit Comparison Var Context");
		ctx.returnValue = ctx.getText();
	}
	
	@Override
	public void exitComparisonConst(Inter_InstanceParser.ComparisonConstContext ctx) {
		logger.info("Exit Comparison Const Context");
		ctx.returnValue = ctx.getText();
	}
	
	@Override
	public void exitComparisonArithmArg(Inter_InstanceParser.ComparisonArithmArgContext ctx) {
		logger.info("Exit Comparison Arithm Arg Context");
		ctx.returnValue = ctx.arithmeticArg().returnValue;
	}
	
	/*
	 * DEFINED PREDICATES
	 */
	@Override
	public void exitDefinedClause(DefinedClauseContext ctx) {
		logger.info("Exiting Defined Context");
		
		Integer numOfChildren = ctx.getChildCount();
		ArrayList<String> args = new ArrayList<String>();
		
		for (int i = 2; i < numOfChildren; i += 2 ) {
			args.add(ctx.getChild(i).getText());
			// TODO Context beachten
		}
		
		Defined f = new Defined(ctx.getChild(0).getText(), args);
		
		ArrayList<Fact> tmp = new ArrayList<Fact>();
		tmp.add(f);
		
		if (inputContext == InputContext.SETTING) {
			DefinedRule r = new DefinedRule();
			r.setHead(f);
			rc.addDefined(r);
		} else if (inputContext != InputContext.ASSIGNMENT_HEAD) {
		    ListenerHelper.addTmpToBody(this, tmp);
		} else {
			DefinedRule r = new DefinedRule();
			r.setBody(rule_body);
			r.setHead(f);
			rc.addDefined(r);
		}
	}
}
