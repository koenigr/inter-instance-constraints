

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

import logging.LoggerFactory;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

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

public class MyListener extends Inter_InstanceBaseListener {
	
	private ExternAndSpecificationContainer esc;
	
	private final String OUTPUT_FILE = "prologfiles/externspec.pl";
	
	private Logger logger = LoggerFactory.getLogger();
	
	private enum Context {UNDEF, SETTING, DEFINE, ASSIGNMENT}
	
	private Context context = Context.UNDEF;
	
	public MyListener() {
		
		esc = new ExternAndSpecificationContainer(OUTPUT_FILE);
		
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
		esc.printToFile();
	}
	
	public void enterExplicitSetting(Inter_InstanceParser.ExplicitSettingContext ctx) {
		logger.info("Entering Explicit setting context");
		context = Context.SETTING;
	}
	
	public void exitExplicitSetting(Inter_InstanceParser.ExplicitSettingContext ctx) {
		logger.info("Exiting Explicit setting context");
		context = Context.UNDEF;
	}
	
	public void enterDefine(Inter_InstanceParser.DefineContext ctx) {
		logger.info("Entering Define context");
		context = Context.DEFINE;
	}
	
	public void exitDefine(Inter_InstanceParser.DefineContext ctx) {
		logger.info("Exiting Define context");
		context = Context.UNDEF;
	}
	
	public void enterAssignment(Inter_InstanceParser.AssignmentContext ctx) {
		logger.info("Entering Assignment context");
		context = Context.ASSIGNMENT;
	}
	
	public void exitAssignment(Inter_InstanceParser.AssignmentContext ctx) {
		logger.info("Exiting Assignment context");
		context = Context.UNDEF;
	}
	
	@Override
	public void exitRelated(Inter_InstanceParser.RelatedContext ctx) {
		logger.info("Exiting Related context");
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
		

		if (context == Context.SETTING) {
			esc.addRelated(r);
		}
	}

	@Override
	public void visitErrorNode(ErrorNode arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visitTerminal(TerminalNode arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterStatement(Inter_InstanceParser.StatementContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitStatement(Inter_InstanceParser.StatementContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterAssignmentBody(Inter_InstanceParser.AssignmentBodyContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitAssignmentBody(Inter_InstanceParser.AssignmentBodyContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterClauses(Inter_InstanceParser.ClausesContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitClauses(Inter_InstanceParser.ClausesContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterAssignmentHead(Inter_InstanceParser.AssignmentHeadContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitAssignmentHead(Inter_InstanceParser.AssignmentHeadContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitPartnerof(Inter_InstanceParser.PartnerofContext ctx) {
		logger.info("Exiting Partner context");
		if (context == Context.SETTING) {
			if (ctx.getChildCount() == 3) {
			String user1 = ctx.getChild(0).getText();
			String user2 = ctx.getChild(2).getText();
			esc.addPartner(new Partner(user1, user2));
		} else {
			logger.log(Level.SEVERE, "unexpected number of children", new RuntimeException());
		}
		}
		
	}
	
	@Override
	public void exitSamegroup(Inter_InstanceParser.SamegroupContext ctx) {
		logger.info("Exiting sameGroup context");
		if (context == Context.SETTING) {
			if (ctx.getChildCount() == 3) {
			String user1 = ctx.getChild(0).getText();
			String user2 = ctx.getChild(2).getText();
			esc.addSameGroup(new SameGroup(user1, user2));
		} else {
			logger.log(Level.SEVERE, "unexpected number of children", new RuntimeException());
		}
		}
	}

	@Override
	public void exitRoleTask(Inter_InstanceParser.RoleTaskContext ctx) {
		logger.info("Exiting Role Task context");
		if (context == Context.SETTING) {
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
		logger.info("Exiting User Task context");
		if (context == Context.SETTING) {
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
		logger.info("Exiting User Role context");
		if (context == Context.SETTING) {
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
		logger.info("Exiting Glb context");
		if (context == Context.SETTING) {
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
		logger.info("Exiting Lub context");
		if (context == Context.SETTING) {
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
		logger.info("Exiting Dominate context");
		if (context == Context.SETTING) {
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
		logger.info("Exiting Critical Task Pair context");
		if (context == Context.SETTING) {
			if (ctx.getChildCount() == 5) {
				String task1 = ctx.getChild(1).getText();
				String task2 = ctx.getChild(3).getText();
				esc.addCriticalTaskPair(new CriticalTaskPair(task1, task2));
			} else {
				logger.log(Level.SEVERE, "unexpected number of children", new RuntimeException());
			}
		}
		
	}

	@Override
	public void exitCannotUser(Inter_InstanceParser.CannotUserContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterCannotRole(Inter_InstanceParser.CannotRoleContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitCannotRole(Inter_InstanceParser.CannotRoleContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterMustUser(Inter_InstanceParser.MustUserContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitMustUser(Inter_InstanceParser.MustUserContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterMustRole(Inter_InstanceParser.MustRoleContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitMustRole(Inter_InstanceParser.MustRoleContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterPanic(Inter_InstanceParser.PanicContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitPanic(Inter_InstanceParser.PanicContext ctx) {
		// TODO Auto-generated method stub
		
	}

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
	public void enterSucceededTask(Inter_InstanceParser.SucceededTaskContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitSucceededTask(Inter_InstanceParser.SucceededTaskContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterCollaborator(Inter_InstanceParser.CollaboratorContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitCollaborator(Inter_InstanceParser.CollaboratorContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterCollaboratorExt(Inter_InstanceParser.CollaboratorExtContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitCollaboratorExt(Inter_InstanceParser.CollaboratorExtContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterNumSimple(Inter_InstanceParser.NumSimpleContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitNumSimple(Inter_InstanceParser.NumSimpleContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterNumVars(Inter_InstanceParser.NumVarsContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitNumVars(Inter_InstanceParser.NumVarsContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterNumDiff(Inter_InstanceParser.NumDiffContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitNumDiff(Inter_InstanceParser.NumDiffContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterSum(Inter_InstanceParser.SumContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitSum(Inter_InstanceParser.SumContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterAvg(Inter_InstanceParser.AvgContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitAvg(Inter_InstanceParser.AvgContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterMin(Inter_InstanceParser.MinContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitMin(Inter_InstanceParser.MinContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterMax(Inter_InstanceParser.MaxContext ctx) {
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
	public void exitConditionalBody(Inter_InstanceParser.ConditionalBodyContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterEquality(Inter_InstanceParser.EqualityContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitEquality(Inter_InstanceParser.EqualityContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterUnequality(Inter_InstanceParser.UnequalityContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitUnequality(Inter_InstanceParser.UnequalityContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterEqualityParams(Inter_InstanceParser.EqualityParamsContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitEqualityParams(Inter_InstanceParser.EqualityParamsContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterUnequalityParams(Inter_InstanceParser.UnequalityParamsContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitUnequalityParams(Inter_InstanceParser.UnequalityParamsContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterArithmetic(Inter_InstanceParser.ArithmeticContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitArithmetic(Inter_InstanceParser.ArithmeticContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterUt(Inter_InstanceParser.UtContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitUt(Inter_InstanceParser.UtContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterRt(Inter_InstanceParser.RtContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitRt(Inter_InstanceParser.RtContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterTt(Inter_InstanceParser.TtContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitTt(Inter_InstanceParser.TtContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterIntra(Inter_InstanceParser.IntraContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitIntra(Inter_InstanceParser.IntraContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterInter(Inter_InstanceParser.InterContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitInter(Inter_InstanceParser.InterContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterInterp(Inter_InstanceParser.InterpContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitInterp(Inter_InstanceParser.InterpContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterNt(Inter_InstanceParser.NtContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitNt(Inter_InstanceParser.NtContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterCt(Inter_InstanceParser.CtContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitCt(Inter_InstanceParser.CtContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterTi(Inter_InstanceParser.TiContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitTi(Inter_InstanceParser.TiContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterWt(Inter_InstanceParser.WtContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitWt(Inter_InstanceParser.WtContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterTaut(Inter_InstanceParser.TautContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitTaut(Inter_InstanceParser.TautContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterInput(Inter_InstanceParser.InputContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitInput(Inter_InstanceParser.InputContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterInputvar(Inter_InstanceParser.InputvarContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitInputvar(Inter_InstanceParser.InputvarContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterOutput(Inter_InstanceParser.OutputContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitOutput(Inter_InstanceParser.OutputContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterOutputvar(Inter_InstanceParser.OutputvarContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitOutputvar(Inter_InstanceParser.OutputvarContext ctx) {
		// TODO Auto-generated method stub
		
	}
}
