package iicmchecker.constraintReader;



import iicmchecker.logging.LoggerFactory;
import iicmchecker.storage.StorageHelper;
import iicmchecker.storage.container.RuleBody;
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

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

public class IIListener extends Inter_InstanceBaseListener {
	
	private ExternAndSpecificationContainer esc;
	
	private RuleContainer rc;
	
	private Logger logger = LoggerFactory.getLogger();
	
	private enum InputContext {UNDEF, SETTING, DEFINE, ASSIGNMENT_HEAD, ASSIGNMENT_BODY, CONDITIONAL_BODY}
	
	private InputContext inputContext = InputContext.UNDEF;
	
	private enum RuleContext {UNDEF, INTRAINSTANCE, INTERINSTANCE, INTERPROCESS}
	
	private RuleContext ruleContext = RuleContext.UNDEF;
	
	private RuleBody body;
	
	private String description;
	
	private ListenerHelper lh= new ListenerHelper();
	
	public IIListener() {
		
		esc = StorageHelper.getInstance().getExternSpecContainer();
		
		rc = StorageHelper.getInstance().getRuleContainer();
		
		try {
			LoggerFactory.setup();
		} catch (IOException e) {
			logger.severe("Failed to initialize logger properly");
		}
	}

	public void enterFile(Inter_InstanceParser.FileContext ctx) {
		logger.info("Entering File");
	}
	
	public void exitFile(Inter_InstanceParser.FileContext ctx) {
		logger.info("Exiting File");
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
		System.out.println("Number of children " + ctx.getChildCount());
		 description = ctx.getChild(1).getText();
	}

	@Override
	public void enterAssignmentBody(Inter_InstanceParser.AssignmentBodyContext ctx) {
		inputContext = InputContext.ASSIGNMENT_BODY;
		body = new RuleBody();
		
	}

	@Override
	public void exitAssignmentBody(Inter_InstanceParser.AssignmentBodyContext ctx) {
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
		inputContext = InputContext.UNDEF;
		
	}

	@Override
	public void enterClauses(Inter_InstanceParser.ClausesContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitClauses(Inter_InstanceParser.ClausesContext ctx) {
		// TODO Auto-generated method stub
		
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
			body.addFact(new Partner(user1, user2));
		}
		
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
			body.addFact(new SameGroup(user1, user2));
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
		} else if (inputContext == InputContext.ASSIGNMENT_BODY) {
			body.addFact(r);
	    }
	}
	
	/*
	 * SPECIFICATION
	 */
	
	@Override
	public void exitRoleTask(Inter_InstanceParser.RoleTaskContext ctx) {
		logger.info("Exiting Role Task inputContext");

		lh.checkChildCount(4, ctx.getChildCount());
		String role = ctx.getChild(1).getText();
		String task = ctx.getChild(3).getText();
		RoleTask r = new RoleTask(role, task);
		
		if (inputContext == InputContext.SETTING) {
			esc.addRoleTask(r);
		} else if (inputContext == InputContext.ASSIGNMENT_BODY) {
			body.addFact(r);
	    }	
	}

	@Override
	public void exitUserTask(Inter_InstanceParser.UserTaskContext ctx) {
		logger.info("Exiting User Task inputContext");

		lh.checkChildCount(4, ctx.getChildCount());
		String user = ctx.getChild(1).getText();
		String task = ctx.getChild(3).getText();
		UserTask r = new UserTask(user, task);
		
		if (inputContext == InputContext.SETTING) {
			esc.addUserTask(r);
		} else if (inputContext == InputContext.ASSIGNMENT_BODY) { // TODO Switch oder anderes..
			body.addFact(r);
	    }	
	}

	@Override
	public void exitUserRole(Inter_InstanceParser.UserRoleContext ctx) {
		logger.info("Exiting User Role inputContext");

		lh.checkChildCount(4, ctx.getChildCount());
		String user = ctx.getChild(1).getText();
		String role = ctx.getChild(3).getText();
		UserRole r = new UserRole(user, role);
		
		if (inputContext == InputContext.SETTING) {
			esc.addUserRole(r);
		} else if (inputContext == InputContext.ASSIGNMENT_BODY) {
			body.addFact(r);
	    }
	}

	@Override
	public void exitGlb(Inter_InstanceParser.GlbContext ctx) {
		logger.info("Exiting Glb inputContext");

		lh.checkChildCount(3, ctx.getChildCount());
		String role = ctx.getChild(0).getText();
		String task = ctx.getChild(2).getText();
		GLB r = new GLB(role, task);
		
		if (inputContext == InputContext.SETTING) {
			esc.addGLB(r);
		} else if (inputContext == InputContext.ASSIGNMENT_BODY) {
			body.addFact(r);
	    }	
	}

	@Override
	public void exitLub(Inter_InstanceParser.LubContext ctx) {
		logger.info("Exiting Lub inputContext");
		lh.checkChildCount(3, ctx.getChildCount());
		String role = ctx.getChild(0).getText();
		String task = ctx.getChild(2).getText();
		LUB r = new LUB(role, task);
		
		if (inputContext == InputContext.SETTING) {
			esc.addLUB(r);
		} else if (inputContext == InputContext.ASSIGNMENT_BODY) {
			body.addFact(r);
	    }	
	}

	@Override
	public void exitDominate(Inter_InstanceParser.DominateContext ctx) {
		logger.info("Exiting Dominate inputContext");

		lh.checkChildCount(3, ctx.getChildCount());
		String role1 = ctx.getChild(0).getText();
		String role2 = ctx.getChild(2).getText();
		Dominates r = new Dominates(role1, role2);
		
		if (inputContext == InputContext.SETTING) {
				esc.addDominates(r);
		} else if (inputContext == InputContext.ASSIGNMENT_BODY) {
			body.addFact(r);
	    }
	}

	@Override
	public void exitCritTaskPair(Inter_InstanceParser.CritTaskPairContext ctx) {
		logger.info("Exiting Critical Task Pair inputContext");

		lh.checkChildCount(5, ctx.getChildCount());
		String task1 = ctx.getChild(1).getText();
		String task2 = ctx.getChild(3).getText();
		CriticalTaskPair r = new CriticalTaskPair(task1, task2);
		
		if (inputContext == InputContext.SETTING) {
				esc.addCriticalTaskPair(r);
		} else if (inputContext == InputContext.ASSIGNMENT_BODY) {
			body.addFact(r);
	    }
		
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
			System.out.println("Head User Cannot do");
			UserCannotDoRule rule = new UserCannotDoRule();
				String user = ctx.getChild(0).getText();
				String task = ctx.getChild(2).getText();
				rule.setHead(new CannotDoUser(user, task));
				rule.setBody(body);
			if (description == null) {
				description = "12354"; // TODO Hier über alle Durchgänge eine fortlaufende Nummer
			}
			rule.setDescription(description);
			rc.addUserCannotDoRule(rule);
			break;
			
		case ASSIGNMENT_BODY :
		default: break;
		}
		
	}

	@Override
	public void exitCannotRole(Inter_InstanceParser.CannotRoleContext ctx) {
		
		logger.info("Exiting Cannot Role Context");
		
		lh.checkChildCount(4, ctx.getChildCount());
		
		switch(inputContext) {
		
		
		case ASSIGNMENT_HEAD : 
			System.out.println("Head");
			RoleCannotDoRule rule = new RoleCannotDoRule();
				String user = ctx.getChild(1).getText();
				String task = ctx.getChild(3).getText();
				rule.setHead(new CannotDoRole(user, task));
				rule.setBody(body);
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
			System.out.println("Head");
			UserMustDoRule rule = new UserMustDoRule();
				String user = ctx.getChild(0).getText();
				String task = ctx.getChild(2).getText();
				rule.setHead(new MustDoUser(user, task));
				rule.setBody(body);
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
			System.out.println("Head");
			RoleMustDoRule rule = new RoleMustDoRule();
				String user = ctx.getChild(0).getText();
				String task = ctx.getChild(2).getText();
				rule.setHead(new MustDoRole(user, task));
				rule.setBody(body);
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
			System.out.println("Head");
			PanicRule rule = new PanicRule();
			if (description == null) {
				description = "12354"; // TODO Hier über alle Durchgänge eine fortlaufende Nummer
			}
			rule.setDescription(description);
			rule.setHead(new Panic());
			rule.setBody(body);
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
	public void enterExecutedUser(Inter_InstanceParser.ExecutedUserContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitExecutedUser(Inter_InstanceParser.ExecutedUserContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterExecutedRole(Inter_InstanceParser.ExecutedRoleContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitExecutedRole(Inter_InstanceParser.ExecutedRoleContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterAssignedUser(Inter_InstanceParser.AssignedUserContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitAssignedUser(Inter_InstanceParser.AssignedUserContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterAbortedTask(Inter_InstanceParser.AbortedTaskContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitAbortedTask(Inter_InstanceParser.AbortedTaskContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitSucceededTask(Inter_InstanceParser.SucceededTaskContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitCollaborator(Inter_InstanceParser.CollaboratorContext ctx) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void enterConditionalBody(Inter_InstanceParser.ConditionalBodyContext ctx) {
		// TODO Auto-generated method stub
		
	}

}
