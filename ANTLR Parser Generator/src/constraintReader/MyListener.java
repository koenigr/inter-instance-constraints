package constraintReader;



import java.io.IOException;


import java.util.logging.Level;
import java.util.logging.Logger;

import logging.LoggerFactory;

import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import storage.StorageHelper;
import storage.container.externspec.CriticalTaskPair;
import storage.container.externspec.Dominates;
import storage.container.externspec.ExternAndSpecificationContainer;
import storage.container.externspec.GLB;
import storage.container.externspec.LUB;
import storage.container.externspec.Partner;
import storage.container.externspec.Related;
import storage.container.externspec.RoleTask;
import storage.container.externspec.SameGroup;
import storage.container.externspec.UserRole;
import storage.container.externspec.UserTask;
import storage.container.rules.CannotDoRole;
import storage.container.rules.MustDoRole;
import storage.container.rules.MustDoUser;
import storage.container.rules.Panic;
import storage.container.rules.PanicRule;
import storage.container.rules.RoleCannotDoRule;
import storage.container.rules.RoleMustDoRule;
import storage.container.RuleBody;
import storage.container.rules.RuleContainer;
import storage.container.rules.UserCannotDoRule;
import storage.container.rules.CannotDoUser;
import storage.container.rules.UserMustDoRule;

public class MyListener extends Inter_InstanceBaseListener {
	
	private ExternAndSpecificationContainer esc;
	
	private RuleContainer rc;
	
	private Logger logger = LoggerFactory.getLogger();
	
	private enum InputContext {UNDEF, SETTING, DEFINE, ASSIGNMENT_HEAD, ASSIGNMENT_BODY}
	
	private InputContext inputContext = InputContext.UNDEF;
	
	private enum RuleContext {UNDEF, INTRAINSTANCE, INTERINSTANCE, INTERPROCESS}
	
	private RuleContext ruleContext = RuleContext.UNDEF;
	
	private RuleBody body;
	
	private String description;
	
	public MyListener() {
		
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
		if (inputContext == InputContext.SETTING) {
			if (ctx.getChildCount() == 3) {
			String user1 = ctx.getChild(0).getText();
			String user2 = ctx.getChild(2).getText();
			esc.addPartner(new Partner(user1, user2));
		} else {
			logger.log(Level.SEVERE, "unexpected number of children " + ctx.getChildCount(), new RuntimeException());
		}
		}
		
	}
	
	@Override
	public void exitSamegroup(Inter_InstanceParser.SamegroupContext ctx) {
		logger.info("Exiting sameGroup inputContext");
		if (inputContext == InputContext.SETTING) {
			if (ctx.getChildCount() == 3) {
			String user1 = ctx.getChild(0).getText();
			String user2 = ctx.getChild(2).getText();
			esc.addSameGroup(new SameGroup(user1, user2));
			} else {
				logger.log(Level.SEVERE, "unexpected number of children " + ctx.getChildCount(), new RuntimeException());
			}
		}
	}

	@Override
	public void exitRelated(Inter_InstanceParser.RelatedContext ctx) {
		logger.info("Exiting Related inputContext");
		Related r = new Related("","");
		int numOfChildren = ctx.getChildCount();
		
		if (numOfChildren == 3) {
			String user1 = ctx.getChild(0).getText();
			String user2 = ctx.getChild(2).getText();
			r = new Related(user1, user2);
		} else {
			logger.log(Level.SEVERE, "unexpected number of children " + 
					Integer.toString(numOfChildren), new RuntimeException());
			System.exit(0);
		}
		

		if (inputContext == InputContext.SETTING) {
			esc.addRelated(r);
		}
	}
	
	/*
	 * SPECIFICATION
	 */
	
	@Override
	public void exitRoleTask(Inter_InstanceParser.RoleTaskContext ctx) {
		logger.info("Exiting Role Task inputContext");
		if (inputContext == InputContext.SETTING) {
			if (ctx.getChildCount() == 4) {
			String role = ctx.getChild(1).getText();
			String task = ctx.getChild(3).getText();
			esc.addRoleTask(new RoleTask(role, task));
		} else {
			logger.log(Level.SEVERE, "unexpected number of children", new RuntimeException());
		}
		}	
	}

	@Override
	public void exitUserTask(Inter_InstanceParser.UserTaskContext ctx) {
		logger.info("Exiting User Task inputContext");
		if (inputContext == InputContext.SETTING) {
			if (ctx.getChildCount() == 4) {
			String user = ctx.getChild(1).getText();
			String task = ctx.getChild(3).getText();
			esc.addUserTask(new UserTask(user, task));
		} else {
			logger.log(Level.SEVERE, "unexpected number of children", new RuntimeException());
		}
		}	
	}

	@Override
	public void exitUserRole(Inter_InstanceParser.UserRoleContext ctx) {
		logger.info("Exiting User Role inputContext");
		if (inputContext == InputContext.SETTING) {
			if (ctx.getChildCount() == 4) {
			String user = ctx.getChild(1).getText();
			String role = ctx.getChild(3).getText();
			esc.addUserRole(new UserRole(user, role));
		} else {
			logger.log(Level.SEVERE, "unexpected number of children", new RuntimeException());
		}
		}	
	}

	@Override
	public void exitGlb(Inter_InstanceParser.GlbContext ctx) {
		logger.info("Exiting Glb inputContext");
		if (inputContext == InputContext.SETTING) {
			if (ctx.getChildCount() == 3) {
			String role = ctx.getChild(0).getText();
			String task = ctx.getChild(2).getText();
			esc.addGLB(new GLB(role, task));
		} else {
			logger.log(Level.SEVERE, "unexpected number of children", new RuntimeException());
		}
		}		
	}

	@Override
	public void exitLub(Inter_InstanceParser.LubContext ctx) {
		logger.info("Exiting Lub inputContext");
		if (inputContext == InputContext.SETTING) {
			if (ctx.getChildCount() == 3) {
			String role = ctx.getChild(0).getText();
			String task = ctx.getChild(2).getText();
			esc.addLUB(new LUB(role, task));
		} else {
			logger.log(Level.SEVERE, "unexpected number of children", new RuntimeException());
		}
		}		
	}

	@Override
	public void exitDominate(Inter_InstanceParser.DominateContext ctx) {
		logger.info("Exiting Dominate inputContext");
		if (inputContext == InputContext.SETTING) {
			if (ctx.getChildCount() == 3) {
				String role1 = ctx.getChild(0).getText();
				String role2 = ctx.getChild(2).getText();
				esc.addDominates(new Dominates(role1, role2));
			} else {
				logger.log(Level.SEVERE, "unexpected number of children", new RuntimeException());
			}
		}	
	}

	@Override
	public void exitCritTaskPair(Inter_InstanceParser.CritTaskPairContext ctx) {
		logger.info("Exiting Critical Task Pair inputContext");
		if (inputContext == InputContext.SETTING) {
			if (ctx.getChildCount() == 5) {
				String task1 = ctx.getChild(1).getText();
				String task2 = ctx.getChild(3).getText();
				esc.addCriticalTaskPair(new CriticalTaskPair(task1, task2));
			} else {
				logger.log(Level.SEVERE, "unexpected number of children", new RuntimeException());
			}
		}
		
	}
	
	/*
	 * ENFORCEMENT
	 */

	@Override
	public void exitCannotUser(Inter_InstanceParser.CannotUserContext ctx) {
		switch(inputContext) {
		case ASSIGNMENT_HEAD : 
			System.out.println("Head User Cannot do");
			UserCannotDoRule rule = new UserCannotDoRule();
			if (ctx.getChildCount() == 3) {
				String user = ctx.getChild(0).getText();
				String task = ctx.getChild(2).getText();
				rule.setHead(new CannotDoUser(user, task));
				rule.setBody(body);
			} else {
				logger.log(Level.SEVERE, "unexpected number of children", new RuntimeException());
			}
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
		switch(inputContext) {
		case ASSIGNMENT_HEAD : 
			System.out.println("Head");
			RoleCannotDoRule rule = new RoleCannotDoRule();
			if (ctx.getChildCount() == 3) {
				String user = ctx.getChild(0).getText();
				String task = ctx.getChild(2).getText();
				rule.setHead(new CannotDoRole(user, task));
			} else {
				logger.log(Level.SEVERE, "unexpected number of children", new RuntimeException());
			}
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
		switch(inputContext) {
		case ASSIGNMENT_HEAD : 
			System.out.println("Head");
			UserMustDoRule rule = new UserMustDoRule();
			if (ctx.getChildCount() == 3) {
				String user = ctx.getChild(0).getText();
				String task = ctx.getChild(2).getText();
				rule.setHead(new MustDoUser(user, task));
			} else {
				logger.log(Level.SEVERE, "unexpected number of children", new RuntimeException());
			}
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
		switch(inputContext) {
		case ASSIGNMENT_HEAD : 
			System.out.println("Head");
			RoleMustDoRule rule = new RoleMustDoRule();
			if (ctx.getChildCount() == 3) {
				String user = ctx.getChild(0).getText();
				String task = ctx.getChild(2).getText();
				rule.setHead(new MustDoRole(user, task));
			} else {
				logger.log(Level.SEVERE, "unexpected number of children", new RuntimeException());
			}
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
		switch(inputContext) {
		case ASSIGNMENT_HEAD : 
			System.out.println("Head");
			PanicRule rule = new PanicRule();
			if (ctx.getChildCount() == 0) {
				// TODO
			} else {
				logger.log(Level.SEVERE, "unexpected number of children", new RuntimeException());
			}
			if (description == null) {
				description = "12354"; // TODO Hier über alle Durchgänge eine fortlaufende Nummer
			}
			rule.setDescription(description);
			rule.setHead(new Panic());
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
	public void exitNumSimple(Inter_InstanceParser.NumSimpleContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitNumVars(Inter_InstanceParser.NumVarsContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitNumDiff(Inter_InstanceParser.NumDiffContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitSum(Inter_InstanceParser.SumContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitAvg(Inter_InstanceParser.AvgContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitMin(Inter_InstanceParser.MinContext ctx) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void exitMax(Inter_InstanceParser.MaxContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterConditionalBody(Inter_InstanceParser.ConditionalBodyContext ctx) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void exitUt(Inter_InstanceParser.UtContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitRt(Inter_InstanceParser.RtContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitTt(Inter_InstanceParser.TtContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitNt(Inter_InstanceParser.NtContext ctx) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void exitWt(Inter_InstanceParser.WtContext ctx) {
		// TODO Auto-generated method stub
		
	}
}
