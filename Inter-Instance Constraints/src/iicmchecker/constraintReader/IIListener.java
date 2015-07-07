package iicmchecker.constraintReader;



import iicmchecker.logging.LoggerFactory;
import iicmchecker.storage.EventHelper;
import iicmchecker.storage.StorageHelper;
import iicmchecker.storage.container.Fact;
import iicmchecker.storage.container.RuleBody;
import iicmchecker.storage.container.ConditionalBody;
import iicmchecker.storage.container.conditional.Avg;
import iicmchecker.storage.container.conditional.Max;
import iicmchecker.storage.container.conditional.Min;
import iicmchecker.storage.container.conditional.NumSimple;
import iicmchecker.storage.container.conditional.NumVars;
import iicmchecker.storage.container.conditional.Sum;
import iicmchecker.storage.container.externspec.CriticalTaskPair;
import iicmchecker.storage.container.externspec.Dominates;
import iicmchecker.storage.container.externspec.ExternAndSpecificationContainer;
import iicmchecker.storage.container.externspec.GLB;
import iicmchecker.storage.container.externspec.LUB;
import iicmchecker.storage.container.externspec.Partner;
import iicmchecker.storage.container.externspec.Related;
import iicmchecker.storage.container.externspec.RoleTask;
import iicmchecker.storage.container.externspec.SameGroup;
import iicmchecker.storage.container.externspec.UserRole;
import iicmchecker.storage.container.externspec.UserTask;
import iicmchecker.storage.container.rules.CannotDoRole;
import iicmchecker.storage.container.rules.CannotDoUser;
import iicmchecker.storage.container.rules.MustDoRole;
import iicmchecker.storage.container.rules.MustDoUser;
import iicmchecker.storage.container.rules.Panic;
import iicmchecker.storage.container.rules.PanicRule;
import iicmchecker.storage.container.rules.RoleCannotDoRule;
import iicmchecker.storage.container.rules.RoleMustDoRule;
import iicmchecker.storage.container.rules.RuleContainer;
import iicmchecker.storage.container.rules.UserCannotDoRule;
import iicmchecker.storage.container.rules.UserMustDoRule;
import iicmchecker.storage.container.status.ExecutedGroupStatus;
import iicmchecker.storage.container.status.ExecutedUserStatus;
import iicmchecker.storage.container.status.TaskEvent;
import iicmchecker.storage.container.status.TaskName;

import java.util.ArrayList;
import java.util.logging.Logger;


public class IIListener extends Inter_InstanceBaseListener {
	
	private ExternAndSpecificationContainer esc;
	
	private RuleContainer rc;
	
	private Logger logger = LoggerFactory.getLogger();
	
	private enum InputContext {UNDEF, SETTING, DEFINE, ASSIGNMENT_HEAD, ASSIGNMENT_BODY, CONDITIONAL_BODY, NEGATION, DISJUNCTION}
	
	private InputContext inputContext = InputContext.UNDEF;
	
	private enum RuleContext {UNDEF, INTRAINSTANCE, INTERINSTANCE, INTERPROCESS}
	
	private RuleContext ruleContext = RuleContext.UNDEF; // TODO prüfen, ob der Kontext eingehalten wurde
	
	private RuleBody rule_body;
	
	private ConditionalBody conditional_body;
	
	private ArrayList<Fact> negation_body;
	
	private ArrayList<Fact> disjunction_body;
	
	private String description;
	
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
	public void exitDescription(Inter_InstanceParser.DescriptionContext ctx) {
		description = ctx.getChild(1).getText();
	}

	@Override
	public void enterAssignmentBody(Inter_InstanceParser.AssignmentBodyContext ctx) {
		logger.info("Entering assignmentbody");
		inputContext = InputContext.ASSIGNMENT_BODY;
		rule_body = new RuleBody();
		
	}

	@Override
	public void exitAssignmentBody(Inter_InstanceParser.AssignmentBodyContext ctx) {
		logger.info("Exiting assignmentbody");
		inputContext = InputContext.UNDEF;
		
	}
	
	@Override
	public void exitAssignment(Inter_InstanceParser.AssignmentContext ctx) {
		description = "";
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
		
		if (inputContext == InputContext.SETTING) {
			esc.addPartner(new Partner(user1, user2));
		} else if (inputContext == InputContext.ASSIGNMENT_BODY) {
			rule_body.addFact(new Partner(user1, user2));
		} else if(inputContext == InputContext.CONDITIONAL_BODY) {
			conditional_body.addFact(new Partner(user1, user2));
		} else {System.out.println("Fehler"); System.exit(0);}
		
	}
	
	@Override
	public void exitSamegroup(Inter_InstanceParser.SamegroupContext ctx) {
		logger.info("Exiting sameGroup inputContext");
		
		lh.checkChildCount(3, ctx.getChildCount());
		String user1 = ctx.getChild(0).getText();
		String user2 = ctx.getChild(2).getText();
		
		if (inputContext == InputContext.SETTING) {
			esc.addSameGroup(new SameGroup(user1, user2));
		} else if (inputContext == InputContext.ASSIGNMENT_BODY) {
			rule_body.addFact(new SameGroup(user1, user2));
	    } else if(inputContext == InputContext.CONDITIONAL_BODY) {
			conditional_body.addFact(new SameGroup(user1, user2));
		} else {System.out.println("Fehler"); System.exit(0);}
		
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
		} else if (inputContext == InputContext.ASSIGNMENT_BODY) {
			rule_body.addFact(r);
	    } else if(inputContext == InputContext.CONDITIONAL_BODY) {
			conditional_body.addFact(r);
		} else {System.out.println("Fehler"); System.exit(0);}
		
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
		} else if (inputContext == InputContext.ASSIGNMENT_BODY) {
			rule_body.addFact(r);
	    } else if(inputContext == InputContext.CONDITIONAL_BODY) {
			conditional_body.addFact(r);
		} else {System.out.println("Fehler"); System.exit(0);}
		
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
		} else if (inputContext == InputContext.ASSIGNMENT_BODY) { // TODO Switch oder anderes..
			rule_body.addFact(r);
	    } else if(inputContext == InputContext.CONDITIONAL_BODY) {
			conditional_body.addFact(r);
		} else {System.out.println("Fehler"); System.exit(0);}	
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
		} else if (inputContext == InputContext.ASSIGNMENT_BODY) {
			rule_body.addFact(r);
	    } else if(inputContext == InputContext.CONDITIONAL_BODY) {
			conditional_body.addFact(r);
		} else {System.out.println("Fehler"); System.exit(0);}
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
		} else if (inputContext == InputContext.ASSIGNMENT_BODY) {
			rule_body.addFact(r);
	    } else if(inputContext == InputContext.CONDITIONAL_BODY) {
			conditional_body.addFact(r);
		} else {System.out.println("Fehler"); System.exit(0);}	
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
		} else if (inputContext == InputContext.ASSIGNMENT_BODY) {
			rule_body.addFact(r);
	    } else if(inputContext == InputContext.CONDITIONAL_BODY) {
			conditional_body.addFact(r);
		} else {System.out.println("Fehler"); System.exit(0);}	
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
		} else if (inputContext == InputContext.ASSIGNMENT_BODY) {
			rule_body.addFact(r);
	    } else if(inputContext == InputContext.CONDITIONAL_BODY) {
			conditional_body.addFact(r);
		} else {System.out.println("Fehler"); System.exit(0);}
	}

	@Override
	public void exitCritTaskPair(Inter_InstanceParser.CritTaskPairContext ctx) {
		logger.info("Exiting Critical Task Pair Context");

		lh.checkChildCount(5, ctx.getChildCount());
		String task1 = ctx.getChild(1).getText();
		String task2 = ctx.getChild(3).getText();
		CriticalTaskPair r = new CriticalTaskPair(task1, task2);
		
		if (inputContext == InputContext.SETTING) {
				esc.addCriticalTaskPair(r);
		} else if (inputContext == InputContext.ASSIGNMENT_BODY) {
			rule_body.addFact(r);
	    } else if(inputContext == InputContext.CONDITIONAL_BODY) {
			conditional_body.addFact(r);
		} else {System.out.println("Fehler"); System.exit(0);}
		
	}
	
	/*
	 * ENFORCEMENT
	 */

	@Override
	public void exitCannotUser(Inter_InstanceParser.CannotUserContext ctx) {
		
		logger.info("Exiting Cannot User Context");

		lh.checkChildCount(3, ctx.getChildCount());
		
		switch(inputContext) {
		
		case ASSIGNMENT_HEAD : 
			UserCannotDoRule rule = new UserCannotDoRule();
			String user = ctx.getChild(0).getText();
			String taskID = ListenerHelper.getStringForVar();
			String taskName = ctx.getChild(2).getText();
			rule.setHead(new CannotDoUser(user, taskID));
			rule_body.setFirst(new TaskName(taskID, taskName));
			rule.setBody(rule_body);
			if (description == null) {
				description = "12354"; // TODO Hier über alle Durchgänge eine fortlaufende Nummer
			}
			rule.setDescription(description);
			rc.addUserCannotDoRule(rule);
			break;
			
		case ASSIGNMENT_BODY :
		default:System.out.println("Fehler"); System.exit(0); break;
		}
		
	}

	@Override
	public void exitCannotRole(Inter_InstanceParser.CannotRoleContext ctx) {
		
		logger.info("Exiting Cannot Role Context");
		
		lh.checkChildCount(4, ctx.getChildCount());
		
		switch(inputContext) {
		
		
		case ASSIGNMENT_HEAD : 
			RoleCannotDoRule rule = new RoleCannotDoRule();
				String user = ctx.getChild(1).getText();
				String task = ctx.getChild(3).getText();
				rule.setHead(new CannotDoRole(user, task));
				rule.setBody(rule_body);
			if (description == null) {
				description = "12354"; // TODO Hier über alle Durchgänge eine fortlaufende Nummer
			}
			rule.setDescription(description);
			rc.addRoleCannotDoRule(rule);
			break;
			
		case ASSIGNMENT_BODY :
		default: break;
		}
		
	}

	@Override
	public void exitMustUser(Inter_InstanceParser.MustUserContext ctx) {
		
		logger.info("Exiting Cannot Role Context");
		
		lh.checkChildCount(3, ctx.getChildCount());
		
		switch(inputContext) {
		case ASSIGNMENT_HEAD : 
			UserMustDoRule rule = new UserMustDoRule();
				String user = ctx.getChild(0).getText();
				String task = ctx.getChild(2).getText();
				rule.setHead(new MustDoUser(user, task));
				rule.setBody(rule_body);
			if (description == null) {
				description = "12354"; // TODO Hier über alle Durchgänge eine fortlaufende Nummer
			}
			rule.setDescription(description);
			rc.addUserMustDoRule(rule);
			break;
			
		case ASSIGNMENT_BODY :
		default: break;
		}
		
	}

	@Override
	public void exitMustRole(Inter_InstanceParser.MustRoleContext ctx) {
		
		logger.info("Exiting Cannot Role Context");
		
		lh.checkChildCount(3, ctx.getChildCount());
		
		switch(inputContext) {
		case ASSIGNMENT_HEAD : 
			RoleMustDoRule rule = new RoleMustDoRule();
				String user = ctx.getChild(0).getText();
				String task = ctx.getChild(2).getText();
				rule.setHead(new MustDoRole(user, task));
				rule.setBody(rule_body);
			if (description == null) {
				description = "12354"; // TODO Hier über alle Durchgänge eine fortlaufende Nummer
			}
			rule.setDescription(description);
			rc.addRoleMustDoRule(rule);
			break;
			
		case ASSIGNMENT_BODY :
		default: break;
		}
	}


	@Override
	public void exitPanic(Inter_InstanceParser.PanicContext ctx) {
		
		logger.info("Exiting Cannot Role Context");
		
		lh.checkChildCount(1, ctx.getChildCount());
		
		switch(inputContext) {
		case ASSIGNMENT_HEAD : 
			PanicRule rule = new PanicRule();
			if (description == null) {
				description = "12354"; // TODO Hier über alle Durchgänge eine fortlaufende Nummer
			}
			rule.setDescription(description);
			rule.setHead(new Panic());
			rule.setBody(rule_body);
			rc.addPanicRule(rule);
			break;
			
		case ASSIGNMENT_BODY :
		default: break;
		}	
	}
	
	
	/*
	 * STATUS
	 */


	@Override
	public void exitExecutedUser(Inter_InstanceParser.ExecutedUserContext ctx) {
		logger.info("Exiting Executed User Context");
		String user = "";
		String taskID = ListenerHelper.getStringForVar();
		String taskName = "";
		
		if(ctx.getChildCount() == 3) {
		      user = ctx.getChild(0).getText();
		      taskName = ctx.getChild(2).getText();
		} else if (ctx.getChildCount() == 4) {
			  user = ctx.getChild(1).getText();
			  taskName = ctx.getChild(3).getText();
		} else {
			// TODO
			System.exit(0);
		}
		
		if (inputContext == InputContext.ASSIGNMENT_BODY) {
			rule_body.addFact(new ExecutedUserStatus(user, taskID));
			rule_body.addFact(new TaskName(taskID, taskName));
		} else if(inputContext == InputContext.CONDITIONAL_BODY) {
			conditional_body.addFact(new ExecutedUserStatus(user, taskID));
			conditional_body.addFact(new TaskName(taskID, taskName));
		} else {System.out.println("Fehler"); System.exit(0);}
		
	}
	
	@Override
	public void exitExecutedRole(Inter_InstanceParser.ExecutedRoleContext ctx) {
		logger.info("Exiting Executed Role Context");
		
		lh.checkChildCount(4, ctx.getChildCount());
		
		String role = ctx.getChild(1).getText();
		String taskID = ListenerHelper.getStringForVar();
		String taskName = ctx.getChild(3).getText();
		
		if (inputContext == InputContext.ASSIGNMENT_BODY) {
			rule_body.addFact(new ExecutedGroupStatus(role, taskID));
			rule_body.addFact(new TaskName(taskID, taskName));
		} else if(inputContext == InputContext.CONDITIONAL_BODY) {
			conditional_body.addFact(new ExecutedGroupStatus(role, taskID));
			conditional_body.addFact(new TaskName(taskID, taskName));
		} else {System.out.println("Fehler"); System.exit(0);}
	}
	
	@Override
	public void exitAssignedUser(Inter_InstanceParser.AssignedUserContext ctx) {
		logger.info("Assigned User Context");
		
		lh.checkChildCount(3, ctx.getChildCount());
		
		String user = ctx.getChild(0).getText();
		String taskID = ListenerHelper.getStringForVar();
		String taskName = ctx.getChild(2).getText();
		EventHelper.EventTypes event = EventHelper.EventTypes.ASSIGN;
		
		if (inputContext == InputContext.ASSIGNMENT_BODY) {
			rule_body.addFact(new TaskName(taskID, taskName));
			rule_body.addFact(new ExecutedUserStatus(taskID, user));
			rule_body.addFact(new TaskEvent(taskID, EventHelper.getAsString(event)));
		} else if(inputContext == InputContext.CONDITIONAL_BODY) {
			conditional_body.addFact(new ExecutedUserStatus(user, taskID));
			conditional_body.addFact(new TaskName(taskID, taskName));
			conditional_body.addFact(new TaskEvent(taskID, EventHelper.getAsString(event)));
		} else {System.out.println("Fehler"); System.exit(0);}
	}

	@Override
	public void exitAbortedTask(Inter_InstanceParser.AbortedTaskContext ctx) {
		logger.info("Aborted Task Context");
		
		lh.checkChildCount(2, ctx.getChildCount());
		
		String taskName = ctx.getChild(0).getText();
		String taskID = ListenerHelper.getStringForVar();
		EventHelper.EventTypes event = EventHelper.EventTypes.ATE_ABORT;
		
		if (inputContext == InputContext.ASSIGNMENT_BODY) {
			rule_body.addFact(new TaskName(taskID, taskName));
			rule_body.addFact(new TaskEvent(taskID, EventHelper.getAsString(event)));
		} else if(inputContext == InputContext.CONDITIONAL_BODY) {
			conditional_body.addFact(new TaskName(taskID, taskName));
			conditional_body.addFact(new TaskEvent(taskID, EventHelper.getAsString(event)));
		} else {System.out.println("Fehler"); System.exit(0);}
	}

	@Override
	public void exitSucceededTask(Inter_InstanceParser.SucceededTaskContext ctx) {
		logger.info("Succeeded Task Context");
		
		lh.checkChildCount(2, ctx.getChildCount());
		
		String taskName = ctx.getChild(0).getText();
		String taskID = ListenerHelper.getStringForVar();
		EventHelper.EventTypes event = EventHelper.EventTypes.COMPLETE;
		
		if (inputContext == InputContext.ASSIGNMENT_BODY) {
			rule_body.addFact(new TaskName(taskID, taskName));
			rule_body.addFact(new TaskEvent(taskID, EventHelper.getAsString(event)));
		} else if(inputContext == InputContext.CONDITIONAL_BODY) {
			conditional_body.addFact(new TaskName(taskID, taskName));
			conditional_body.addFact(new TaskEvent(taskID, EventHelper.getAsString(event)));
		} else {System.out.println("Fehler"); System.exit(0);}
		
	}

	@Override
	public void exitCollaborator(Inter_InstanceParser.CollaboratorContext ctx) {
		logger.info("Collaborator Context");
		
		lh.checkChildCount(3, ctx.getChildCount());
		
		String user1 = ctx.getChild(0).getText();
		String taskID1 = ListenerHelper.getStringForVar();
		String taskID2 = ListenerHelper.getStringForVar();
		String user2 = ctx.getChild(2).getText();
		EventHelper.EventTypes event = EventHelper.EventTypes.COMPLETE;
		
		if (inputContext == InputContext.ASSIGNMENT_BODY) {
			rule_body.addFact(new UserTask(user1, taskID1));
			rule_body.addFact(new UserTask(user2, taskID2));
			rule_body.addFact(new CriticalTaskPair(taskID1, taskID2));
			rule_body.addFact(new TaskEvent(taskID1, EventHelper.getAsString(event)));
			rule_body.addFact(new TaskEvent(taskID2, EventHelper.getAsString(event)));
		} else if (inputContext == InputContext.CONDITIONAL_BODY){
				rule_body.addFact(new UserTask(user1, taskID1));
				rule_body.addFact(new UserTask(user2, taskID2));
				rule_body.addFact(new CriticalTaskPair(taskID1, taskID2));
				rule_body.addFact(new TaskEvent(taskID1, EventHelper.getAsString(event)));
				rule_body.addFact(new TaskEvent(taskID2, EventHelper.getAsString(event)));
		}  else {System.out.println("Fehler"); System.exit(0);}
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
		lh.checkChildCount(5, ctx.getChildCount());
		
		String result = ctx.getChild(4).getText();
		NumSimple ns = new NumSimple(result);
		ns.setBody(conditional_body);
		rule_body.addFact(ns);
	}
	
	@Override
	public void exitNumVars(Inter_InstanceParser.NumVarsContext ctx) {
		// TODO prüfen, ob die Variable auch im Body vorkommt?? Oder ich lass es, wenn die Zeit knapp wird
		logger.info("Num Vars Context");
		lh.checkChildCount(6, ctx.getChildCount());
		
		String var = ctx.getChild(1).getText();
		String result = ctx.getChild(5).getText();
		NumVars ns = new NumVars(var, result);
		ns.setBody(conditional_body);
		rule_body.addFact(ns);
	}
	
	@Override
	public void exitSum(Inter_InstanceParser.SumContext ctx) {
		logger.info("Sum Context");
		lh.checkChildCount(6, ctx.getChildCount());
		
		String var = ctx.getChild(1).getText();
		String result = ctx.getChild(5).getText();
		Sum ns = new Sum(var, result);
		ns.setBody(conditional_body);
		rule_body.addFact(ns);
	}
	
	@Override
	public void exitAvg(Inter_InstanceParser.AvgContext ctx) {
		logger.info("Num Vars Context");
		lh.checkChildCount(6, ctx.getChildCount());
		
		String var = ctx.getChild(1).getText();
		String result = ctx.getChild(5).getText();
		Avg ns = new Avg(var, result);
		ns.setBody(conditional_body);
		rule_body.addFact(ns);
	}
	
	@Override
	public void exitMin(Inter_InstanceParser.MinContext ctx) {
		logger.info("Num Vars Context");
		lh.checkChildCount(6, ctx.getChildCount());
		
		String var = ctx.getChild(1).getText();
		String result = ctx.getChild(5).getText();
		Min ns = new Min(var, result);
		ns.setBody(conditional_body);
		rule_body.addFact(ns);
	}
	
	@Override
	public void exitMax(Inter_InstanceParser.MaxContext ctx) {
		logger.info("Num Vars Context");
		lh.checkChildCount(6, ctx.getChildCount());
		
		String var = ctx.getChild(1).getText();
		String result = ctx.getChild(5).getText();
		Max ns = new Max(var, result);
		ns.setBody(conditional_body);
		rule_body.addFact(ns);
	}
	
	/*
	 * DISJUNCTION
	 */
	@Override
	public void exitDisjunction(Inter_InstanceParser.DisjunctionContext ctx) {
		// TODO
	}
	
	/*
	 * NEGATION
	 */
	@Override
	public void exitNegation(Inter_InstanceParser.NegationContext ctx) {
		// TODO
	}

}
