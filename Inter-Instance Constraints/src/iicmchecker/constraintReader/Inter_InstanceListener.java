// Generated from Inter_Instance.g4 by ANTLR 4.5

  package iicmchecker.constraintReader;
	
  import iicmchecker.constraintReader.ParserHelper;
  import java.util.logging.Logger;
  import java.util.logging.Level;
  import iicmchecker.utils.logging.LoggerFactory;
  import iicmchecker.utils.exceptions.UnexpectedContextException;

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link Inter_InstanceParser}.
 */
public interface Inter_InstanceListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link Inter_InstanceParser#file}.
	 * @param ctx the parse tree
	 */
	void enterFile(Inter_InstanceParser.FileContext ctx);
	/**
	 * Exit a parse tree produced by {@link Inter_InstanceParser#file}.
	 * @param ctx the parse tree
	 */
	void exitFile(Inter_InstanceParser.FileContext ctx);
	/**
	 * Enter a parse tree produced by {@link Inter_InstanceParser#define}.
	 * @param ctx the parse tree
	 */
	void enterDefine(Inter_InstanceParser.DefineContext ctx);
	/**
	 * Exit a parse tree produced by {@link Inter_InstanceParser#define}.
	 * @param ctx the parse tree
	 */
	void exitDefine(Inter_InstanceParser.DefineContext ctx);
	/**
	 * Enter a parse tree produced by {@link Inter_InstanceParser#explicitSetting}.
	 * @param ctx the parse tree
	 */
	void enterExplicitSetting(Inter_InstanceParser.ExplicitSettingContext ctx);
	/**
	 * Exit a parse tree produced by {@link Inter_InstanceParser#explicitSetting}.
	 * @param ctx the parse tree
	 */
	void exitExplicitSetting(Inter_InstanceParser.ExplicitSettingContext ctx);
	/**
	 * Enter a parse tree produced by {@link Inter_InstanceParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(Inter_InstanceParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link Inter_InstanceParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(Inter_InstanceParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link Inter_InstanceParser#description}.
	 * @param ctx the parse tree
	 */
	void enterDescription(Inter_InstanceParser.DescriptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Inter_InstanceParser#description}.
	 * @param ctx the parse tree
	 */
	void exitDescription(Inter_InstanceParser.DescriptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Inter_InstanceParser#assignmentBody}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentBody(Inter_InstanceParser.AssignmentBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link Inter_InstanceParser#assignmentBody}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentBody(Inter_InstanceParser.AssignmentBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link Inter_InstanceParser#clauses}.
	 * @param ctx the parse tree
	 */
	void enterClauses(Inter_InstanceParser.ClausesContext ctx);
	/**
	 * Exit a parse tree produced by {@link Inter_InstanceParser#clauses}.
	 * @param ctx the parse tree
	 */
	void exitClauses(Inter_InstanceParser.ClausesContext ctx);
	/**
	 * Enter a parse tree produced by {@link Inter_InstanceParser#disjunction}.
	 * @param ctx the parse tree
	 */
	void enterDisjunction(Inter_InstanceParser.DisjunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Inter_InstanceParser#disjunction}.
	 * @param ctx the parse tree
	 */
	void exitDisjunction(Inter_InstanceParser.DisjunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Inter_InstanceParser#negation}.
	 * @param ctx the parse tree
	 */
	void enterNegation(Inter_InstanceParser.NegationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Inter_InstanceParser#negation}.
	 * @param ctx the parse tree
	 */
	void exitNegation(Inter_InstanceParser.NegationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Inter_InstanceParser#atoms}.
	 * @param ctx the parse tree
	 */
	void enterAtoms(Inter_InstanceParser.AtomsContext ctx);
	/**
	 * Exit a parse tree produced by {@link Inter_InstanceParser#atoms}.
	 * @param ctx the parse tree
	 */
	void exitAtoms(Inter_InstanceParser.AtomsContext ctx);
	/**
	 * Enter a parse tree produced by {@link Inter_InstanceParser#definedClause}.
	 * @param ctx the parse tree
	 */
	void enterDefinedClause(Inter_InstanceParser.DefinedClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Inter_InstanceParser#definedClause}.
	 * @param ctx the parse tree
	 */
	void exitDefinedClause(Inter_InstanceParser.DefinedClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link Inter_InstanceParser#assignmentHead}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentHead(Inter_InstanceParser.AssignmentHeadContext ctx);
	/**
	 * Exit a parse tree produced by {@link Inter_InstanceParser#assignmentHead}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentHead(Inter_InstanceParser.AssignmentHeadContext ctx);
	/**
	 * Enter a parse tree produced by the {@code related}
	 * labeled alternative in {@link Inter_InstanceParser#extern}.
	 * @param ctx the parse tree
	 */
	void enterRelated(Inter_InstanceParser.RelatedContext ctx);
	/**
	 * Exit a parse tree produced by the {@code related}
	 * labeled alternative in {@link Inter_InstanceParser#extern}.
	 * @param ctx the parse tree
	 */
	void exitRelated(Inter_InstanceParser.RelatedContext ctx);
	/**
	 * Enter a parse tree produced by the {@code partnerof}
	 * labeled alternative in {@link Inter_InstanceParser#extern}.
	 * @param ctx the parse tree
	 */
	void enterPartnerof(Inter_InstanceParser.PartnerofContext ctx);
	/**
	 * Exit a parse tree produced by the {@code partnerof}
	 * labeled alternative in {@link Inter_InstanceParser#extern}.
	 * @param ctx the parse tree
	 */
	void exitPartnerof(Inter_InstanceParser.PartnerofContext ctx);
	/**
	 * Enter a parse tree produced by the {@code samegroup}
	 * labeled alternative in {@link Inter_InstanceParser#extern}.
	 * @param ctx the parse tree
	 */
	void enterSamegroup(Inter_InstanceParser.SamegroupContext ctx);
	/**
	 * Exit a parse tree produced by the {@code samegroup}
	 * labeled alternative in {@link Inter_InstanceParser#extern}.
	 * @param ctx the parse tree
	 */
	void exitSamegroup(Inter_InstanceParser.SamegroupContext ctx);
	/**
	 * Enter a parse tree produced by the {@code roleTask}
	 * labeled alternative in {@link Inter_InstanceParser#specification}.
	 * @param ctx the parse tree
	 */
	void enterRoleTask(Inter_InstanceParser.RoleTaskContext ctx);
	/**
	 * Exit a parse tree produced by the {@code roleTask}
	 * labeled alternative in {@link Inter_InstanceParser#specification}.
	 * @param ctx the parse tree
	 */
	void exitRoleTask(Inter_InstanceParser.RoleTaskContext ctx);
	/**
	 * Enter a parse tree produced by the {@code userTask}
	 * labeled alternative in {@link Inter_InstanceParser#specification}.
	 * @param ctx the parse tree
	 */
	void enterUserTask(Inter_InstanceParser.UserTaskContext ctx);
	/**
	 * Exit a parse tree produced by the {@code userTask}
	 * labeled alternative in {@link Inter_InstanceParser#specification}.
	 * @param ctx the parse tree
	 */
	void exitUserTask(Inter_InstanceParser.UserTaskContext ctx);
	/**
	 * Enter a parse tree produced by the {@code userRole}
	 * labeled alternative in {@link Inter_InstanceParser#specification}.
	 * @param ctx the parse tree
	 */
	void enterUserRole(Inter_InstanceParser.UserRoleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code userRole}
	 * labeled alternative in {@link Inter_InstanceParser#specification}.
	 * @param ctx the parse tree
	 */
	void exitUserRole(Inter_InstanceParser.UserRoleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code glb}
	 * labeled alternative in {@link Inter_InstanceParser#specification}.
	 * @param ctx the parse tree
	 */
	void enterGlb(Inter_InstanceParser.GlbContext ctx);
	/**
	 * Exit a parse tree produced by the {@code glb}
	 * labeled alternative in {@link Inter_InstanceParser#specification}.
	 * @param ctx the parse tree
	 */
	void exitGlb(Inter_InstanceParser.GlbContext ctx);
	/**
	 * Enter a parse tree produced by the {@code lub}
	 * labeled alternative in {@link Inter_InstanceParser#specification}.
	 * @param ctx the parse tree
	 */
	void enterLub(Inter_InstanceParser.LubContext ctx);
	/**
	 * Exit a parse tree produced by the {@code lub}
	 * labeled alternative in {@link Inter_InstanceParser#specification}.
	 * @param ctx the parse tree
	 */
	void exitLub(Inter_InstanceParser.LubContext ctx);
	/**
	 * Enter a parse tree produced by the {@code dominate}
	 * labeled alternative in {@link Inter_InstanceParser#specification}.
	 * @param ctx the parse tree
	 */
	void enterDominate(Inter_InstanceParser.DominateContext ctx);
	/**
	 * Exit a parse tree produced by the {@code dominate}
	 * labeled alternative in {@link Inter_InstanceParser#specification}.
	 * @param ctx the parse tree
	 */
	void exitDominate(Inter_InstanceParser.DominateContext ctx);
	/**
	 * Enter a parse tree produced by the {@code critTaskPair}
	 * labeled alternative in {@link Inter_InstanceParser#specification}.
	 * @param ctx the parse tree
	 */
	void enterCritTaskPair(Inter_InstanceParser.CritTaskPairContext ctx);
	/**
	 * Exit a parse tree produced by the {@code critTaskPair}
	 * labeled alternative in {@link Inter_InstanceParser#specification}.
	 * @param ctx the parse tree
	 */
	void exitCritTaskPair(Inter_InstanceParser.CritTaskPairContext ctx);
	/**
	 * Enter a parse tree produced by the {@code cannotUser}
	 * labeled alternative in {@link Inter_InstanceParser#enforcement}.
	 * @param ctx the parse tree
	 */
	void enterCannotUser(Inter_InstanceParser.CannotUserContext ctx);
	/**
	 * Exit a parse tree produced by the {@code cannotUser}
	 * labeled alternative in {@link Inter_InstanceParser#enforcement}.
	 * @param ctx the parse tree
	 */
	void exitCannotUser(Inter_InstanceParser.CannotUserContext ctx);
	/**
	 * Enter a parse tree produced by the {@code cannotRole}
	 * labeled alternative in {@link Inter_InstanceParser#enforcement}.
	 * @param ctx the parse tree
	 */
	void enterCannotRole(Inter_InstanceParser.CannotRoleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code cannotRole}
	 * labeled alternative in {@link Inter_InstanceParser#enforcement}.
	 * @param ctx the parse tree
	 */
	void exitCannotRole(Inter_InstanceParser.CannotRoleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code mustUser}
	 * labeled alternative in {@link Inter_InstanceParser#enforcement}.
	 * @param ctx the parse tree
	 */
	void enterMustUser(Inter_InstanceParser.MustUserContext ctx);
	/**
	 * Exit a parse tree produced by the {@code mustUser}
	 * labeled alternative in {@link Inter_InstanceParser#enforcement}.
	 * @param ctx the parse tree
	 */
	void exitMustUser(Inter_InstanceParser.MustUserContext ctx);
	/**
	 * Enter a parse tree produced by the {@code mustRole}
	 * labeled alternative in {@link Inter_InstanceParser#enforcement}.
	 * @param ctx the parse tree
	 */
	void enterMustRole(Inter_InstanceParser.MustRoleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code mustRole}
	 * labeled alternative in {@link Inter_InstanceParser#enforcement}.
	 * @param ctx the parse tree
	 */
	void exitMustRole(Inter_InstanceParser.MustRoleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code panic}
	 * labeled alternative in {@link Inter_InstanceParser#enforcement}.
	 * @param ctx the parse tree
	 */
	void enterPanic(Inter_InstanceParser.PanicContext ctx);
	/**
	 * Exit a parse tree produced by the {@code panic}
	 * labeled alternative in {@link Inter_InstanceParser#enforcement}.
	 * @param ctx the parse tree
	 */
	void exitPanic(Inter_InstanceParser.PanicContext ctx);
	/**
	 * Enter a parse tree produced by the {@code executedUser}
	 * labeled alternative in {@link Inter_InstanceParser#status}.
	 * @param ctx the parse tree
	 */
	void enterExecutedUser(Inter_InstanceParser.ExecutedUserContext ctx);
	/**
	 * Exit a parse tree produced by the {@code executedUser}
	 * labeled alternative in {@link Inter_InstanceParser#status}.
	 * @param ctx the parse tree
	 */
	void exitExecutedUser(Inter_InstanceParser.ExecutedUserContext ctx);
	/**
	 * Enter a parse tree produced by the {@code executedRole}
	 * labeled alternative in {@link Inter_InstanceParser#status}.
	 * @param ctx the parse tree
	 */
	void enterExecutedRole(Inter_InstanceParser.ExecutedRoleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code executedRole}
	 * labeled alternative in {@link Inter_InstanceParser#status}.
	 * @param ctx the parse tree
	 */
	void exitExecutedRole(Inter_InstanceParser.ExecutedRoleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code taskName}
	 * labeled alternative in {@link Inter_InstanceParser#status}.
	 * @param ctx the parse tree
	 */
	void enterTaskName(Inter_InstanceParser.TaskNameContext ctx);
	/**
	 * Exit a parse tree produced by the {@code taskName}
	 * labeled alternative in {@link Inter_InstanceParser#status}.
	 * @param ctx the parse tree
	 */
	void exitTaskName(Inter_InstanceParser.TaskNameContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assignedUser}
	 * labeled alternative in {@link Inter_InstanceParser#status}.
	 * @param ctx the parse tree
	 */
	void enterAssignedUser(Inter_InstanceParser.AssignedUserContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assignedUser}
	 * labeled alternative in {@link Inter_InstanceParser#status}.
	 * @param ctx the parse tree
	 */
	void exitAssignedUser(Inter_InstanceParser.AssignedUserContext ctx);
	/**
	 * Enter a parse tree produced by the {@code abortedTask}
	 * labeled alternative in {@link Inter_InstanceParser#status}.
	 * @param ctx the parse tree
	 */
	void enterAbortedTask(Inter_InstanceParser.AbortedTaskContext ctx);
	/**
	 * Exit a parse tree produced by the {@code abortedTask}
	 * labeled alternative in {@link Inter_InstanceParser#status}.
	 * @param ctx the parse tree
	 */
	void exitAbortedTask(Inter_InstanceParser.AbortedTaskContext ctx);
	/**
	 * Enter a parse tree produced by the {@code succeededTask}
	 * labeled alternative in {@link Inter_InstanceParser#status}.
	 * @param ctx the parse tree
	 */
	void enterSucceededTask(Inter_InstanceParser.SucceededTaskContext ctx);
	/**
	 * Exit a parse tree produced by the {@code succeededTask}
	 * labeled alternative in {@link Inter_InstanceParser#status}.
	 * @param ctx the parse tree
	 */
	void exitSucceededTask(Inter_InstanceParser.SucceededTaskContext ctx);
	/**
	 * Enter a parse tree produced by the {@code startedTask}
	 * labeled alternative in {@link Inter_InstanceParser#status}.
	 * @param ctx the parse tree
	 */
	void enterStartedTask(Inter_InstanceParser.StartedTaskContext ctx);
	/**
	 * Exit a parse tree produced by the {@code startedTask}
	 * labeled alternative in {@link Inter_InstanceParser#status}.
	 * @param ctx the parse tree
	 */
	void exitStartedTask(Inter_InstanceParser.StartedTaskContext ctx);
	/**
	 * Enter a parse tree produced by the {@code flexibleEvent}
	 * labeled alternative in {@link Inter_InstanceParser#status}.
	 * @param ctx the parse tree
	 */
	void enterFlexibleEvent(Inter_InstanceParser.FlexibleEventContext ctx);
	/**
	 * Exit a parse tree produced by the {@code flexibleEvent}
	 * labeled alternative in {@link Inter_InstanceParser#status}.
	 * @param ctx the parse tree
	 */
	void exitFlexibleEvent(Inter_InstanceParser.FlexibleEventContext ctx);
	/**
	 * Enter a parse tree produced by the {@code collaborator}
	 * labeled alternative in {@link Inter_InstanceParser#status}.
	 * @param ctx the parse tree
	 */
	void enterCollaborator(Inter_InstanceParser.CollaboratorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code collaborator}
	 * labeled alternative in {@link Inter_InstanceParser#status}.
	 * @param ctx the parse tree
	 */
	void exitCollaborator(Inter_InstanceParser.CollaboratorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code timestamp}
	 * labeled alternative in {@link Inter_InstanceParser#status}.
	 * @param ctx the parse tree
	 */
	void enterTimestamp(Inter_InstanceParser.TimestampContext ctx);
	/**
	 * Exit a parse tree produced by the {@code timestamp}
	 * labeled alternative in {@link Inter_InstanceParser#status}.
	 * @param ctx the parse tree
	 */
	void exitTimestamp(Inter_InstanceParser.TimestampContext ctx);
	/**
	 * Enter a parse tree produced by the {@code timeinterval}
	 * labeled alternative in {@link Inter_InstanceParser#status}.
	 * @param ctx the parse tree
	 */
	void enterTimeinterval(Inter_InstanceParser.TimeintervalContext ctx);
	/**
	 * Exit a parse tree produced by the {@code timeinterval}
	 * labeled alternative in {@link Inter_InstanceParser#status}.
	 * @param ctx the parse tree
	 */
	void exitTimeinterval(Inter_InstanceParser.TimeintervalContext ctx);
	/**
	 * Enter a parse tree produced by the {@code attribute}
	 * labeled alternative in {@link Inter_InstanceParser#status}.
	 * @param ctx the parse tree
	 */
	void enterAttribute(Inter_InstanceParser.AttributeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code attribute}
	 * labeled alternative in {@link Inter_InstanceParser#status}.
	 * @param ctx the parse tree
	 */
	void exitAttribute(Inter_InstanceParser.AttributeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code numSimple}
	 * labeled alternative in {@link Inter_InstanceParser#conditional}.
	 * @param ctx the parse tree
	 */
	void enterNumSimple(Inter_InstanceParser.NumSimpleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code numSimple}
	 * labeled alternative in {@link Inter_InstanceParser#conditional}.
	 * @param ctx the parse tree
	 */
	void exitNumSimple(Inter_InstanceParser.NumSimpleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code numVars}
	 * labeled alternative in {@link Inter_InstanceParser#conditional}.
	 * @param ctx the parse tree
	 */
	void enterNumVars(Inter_InstanceParser.NumVarsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code numVars}
	 * labeled alternative in {@link Inter_InstanceParser#conditional}.
	 * @param ctx the parse tree
	 */
	void exitNumVars(Inter_InstanceParser.NumVarsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code sum}
	 * labeled alternative in {@link Inter_InstanceParser#conditional}.
	 * @param ctx the parse tree
	 */
	void enterSum(Inter_InstanceParser.SumContext ctx);
	/**
	 * Exit a parse tree produced by the {@code sum}
	 * labeled alternative in {@link Inter_InstanceParser#conditional}.
	 * @param ctx the parse tree
	 */
	void exitSum(Inter_InstanceParser.SumContext ctx);
	/**
	 * Enter a parse tree produced by the {@code avg}
	 * labeled alternative in {@link Inter_InstanceParser#conditional}.
	 * @param ctx the parse tree
	 */
	void enterAvg(Inter_InstanceParser.AvgContext ctx);
	/**
	 * Exit a parse tree produced by the {@code avg}
	 * labeled alternative in {@link Inter_InstanceParser#conditional}.
	 * @param ctx the parse tree
	 */
	void exitAvg(Inter_InstanceParser.AvgContext ctx);
	/**
	 * Enter a parse tree produced by the {@code min}
	 * labeled alternative in {@link Inter_InstanceParser#conditional}.
	 * @param ctx the parse tree
	 */
	void enterMin(Inter_InstanceParser.MinContext ctx);
	/**
	 * Exit a parse tree produced by the {@code min}
	 * labeled alternative in {@link Inter_InstanceParser#conditional}.
	 * @param ctx the parse tree
	 */
	void exitMin(Inter_InstanceParser.MinContext ctx);
	/**
	 * Enter a parse tree produced by the {@code max}
	 * labeled alternative in {@link Inter_InstanceParser#conditional}.
	 * @param ctx the parse tree
	 */
	void enterMax(Inter_InstanceParser.MaxContext ctx);
	/**
	 * Exit a parse tree produced by the {@code max}
	 * labeled alternative in {@link Inter_InstanceParser#conditional}.
	 * @param ctx the parse tree
	 */
	void exitMax(Inter_InstanceParser.MaxContext ctx);
	/**
	 * Enter a parse tree produced by {@link Inter_InstanceParser#conditionalBody}.
	 * @param ctx the parse tree
	 */
	void enterConditionalBody(Inter_InstanceParser.ConditionalBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link Inter_InstanceParser#conditionalBody}.
	 * @param ctx the parse tree
	 */
	void exitConditionalBody(Inter_InstanceParser.ConditionalBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link Inter_InstanceParser#comparison}.
	 * @param ctx the parse tree
	 */
	void enterComparison(Inter_InstanceParser.ComparisonContext ctx);
	/**
	 * Exit a parse tree produced by {@link Inter_InstanceParser#comparison}.
	 * @param ctx the parse tree
	 */
	void exitComparison(Inter_InstanceParser.ComparisonContext ctx);
	/**
	 * Enter a parse tree produced by {@link Inter_InstanceParser#equalityExpr}.
	 * @param ctx the parse tree
	 */
	void enterEqualityExpr(Inter_InstanceParser.EqualityExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link Inter_InstanceParser#equalityExpr}.
	 * @param ctx the parse tree
	 */
	void exitEqualityExpr(Inter_InstanceParser.EqualityExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link Inter_InstanceParser#inequalityExpr}.
	 * @param ctx the parse tree
	 */
	void enterInequalityExpr(Inter_InstanceParser.InequalityExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link Inter_InstanceParser#inequalityExpr}.
	 * @param ctx the parse tree
	 */
	void exitInequalityExpr(Inter_InstanceParser.InequalityExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code comparisonVar}
	 * labeled alternative in {@link Inter_InstanceParser#comparisonArg}.
	 * @param ctx the parse tree
	 */
	void enterComparisonVar(Inter_InstanceParser.ComparisonVarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code comparisonVar}
	 * labeled alternative in {@link Inter_InstanceParser#comparisonArg}.
	 * @param ctx the parse tree
	 */
	void exitComparisonVar(Inter_InstanceParser.ComparisonVarContext ctx);
	/**
	 * Enter a parse tree produced by the {@code comparisonConst}
	 * labeled alternative in {@link Inter_InstanceParser#comparisonArg}.
	 * @param ctx the parse tree
	 */
	void enterComparisonConst(Inter_InstanceParser.ComparisonConstContext ctx);
	/**
	 * Exit a parse tree produced by the {@code comparisonConst}
	 * labeled alternative in {@link Inter_InstanceParser#comparisonArg}.
	 * @param ctx the parse tree
	 */
	void exitComparisonConst(Inter_InstanceParser.ComparisonConstContext ctx);
	/**
	 * Enter a parse tree produced by the {@code comparisonArithmArg}
	 * labeled alternative in {@link Inter_InstanceParser#comparisonArg}.
	 * @param ctx the parse tree
	 */
	void enterComparisonArithmArg(Inter_InstanceParser.ComparisonArithmArgContext ctx);
	/**
	 * Exit a parse tree produced by the {@code comparisonArithmArg}
	 * labeled alternative in {@link Inter_InstanceParser#comparisonArg}.
	 * @param ctx the parse tree
	 */
	void exitComparisonArithmArg(Inter_InstanceParser.ComparisonArithmArgContext ctx);
	/**
	 * Enter a parse tree produced by {@link Inter_InstanceParser#arithmeticExpr}.
	 * @param ctx the parse tree
	 */
	void enterArithmeticExpr(Inter_InstanceParser.ArithmeticExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link Inter_InstanceParser#arithmeticExpr}.
	 * @param ctx the parse tree
	 */
	void exitArithmeticExpr(Inter_InstanceParser.ArithmeticExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arithmeticNT}
	 * labeled alternative in {@link Inter_InstanceParser#arithmeticArg}.
	 * @param ctx the parse tree
	 */
	void enterArithmeticNT(Inter_InstanceParser.ArithmeticNTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arithmeticNT}
	 * labeled alternative in {@link Inter_InstanceParser#arithmeticArg}.
	 * @param ctx the parse tree
	 */
	void exitArithmeticNT(Inter_InstanceParser.ArithmeticNTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arithmeticTP}
	 * labeled alternative in {@link Inter_InstanceParser#arithmeticArg}.
	 * @param ctx the parse tree
	 */
	void enterArithmeticTP(Inter_InstanceParser.ArithmeticTPContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arithmeticTP}
	 * labeled alternative in {@link Inter_InstanceParser#arithmeticArg}.
	 * @param ctx the parse tree
	 */
	void exitArithmeticTP(Inter_InstanceParser.ArithmeticTPContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arithmeticTS}
	 * labeled alternative in {@link Inter_InstanceParser#arithmeticArg}.
	 * @param ctx the parse tree
	 */
	void enterArithmeticTS(Inter_InstanceParser.ArithmeticTSContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arithmeticTS}
	 * labeled alternative in {@link Inter_InstanceParser#arithmeticArg}.
	 * @param ctx the parse tree
	 */
	void exitArithmeticTS(Inter_InstanceParser.ArithmeticTSContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arithmeticEx}
	 * labeled alternative in {@link Inter_InstanceParser#arithmeticArg}.
	 * @param ctx the parse tree
	 */
	void enterArithmeticEx(Inter_InstanceParser.ArithmeticExContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arithmeticEx}
	 * labeled alternative in {@link Inter_InstanceParser#arithmeticArg}.
	 * @param ctx the parse tree
	 */
	void exitArithmeticEx(Inter_InstanceParser.ArithmeticExContext ctx);
	/**
	 * Enter a parse tree produced by {@link Inter_InstanceParser#et}.
	 * @param ctx the parse tree
	 */
	void enterEt(Inter_InstanceParser.EtContext ctx);
	/**
	 * Exit a parse tree produced by {@link Inter_InstanceParser#et}.
	 * @param ctx the parse tree
	 */
	void exitEt(Inter_InstanceParser.EtContext ctx);
	/**
	 * Enter a parse tree produced by {@link Inter_InstanceParser#unknownEvent}.
	 * @param ctx the parse tree
	 */
	void enterUnknownEvent(Inter_InstanceParser.UnknownEventContext ctx);
	/**
	 * Exit a parse tree produced by {@link Inter_InstanceParser#unknownEvent}.
	 * @param ctx the parse tree
	 */
	void exitUnknownEvent(Inter_InstanceParser.UnknownEventContext ctx);
	/**
	 * Enter a parse tree produced by {@link Inter_InstanceParser#ut}.
	 * @param ctx the parse tree
	 */
	void enterUt(Inter_InstanceParser.UtContext ctx);
	/**
	 * Exit a parse tree produced by {@link Inter_InstanceParser#ut}.
	 * @param ctx the parse tree
	 */
	void exitUt(Inter_InstanceParser.UtContext ctx);
	/**
	 * Enter a parse tree produced by {@link Inter_InstanceParser#rt}.
	 * @param ctx the parse tree
	 */
	void enterRt(Inter_InstanceParser.RtContext ctx);
	/**
	 * Exit a parse tree produced by {@link Inter_InstanceParser#rt}.
	 * @param ctx the parse tree
	 */
	void exitRt(Inter_InstanceParser.RtContext ctx);
	/**
	 * Enter a parse tree produced by {@link Inter_InstanceParser#tt}.
	 * @param ctx the parse tree
	 */
	void enterTt(Inter_InstanceParser.TtContext ctx);
	/**
	 * Exit a parse tree produced by {@link Inter_InstanceParser#tt}.
	 * @param ctx the parse tree
	 */
	void exitTt(Inter_InstanceParser.TtContext ctx);
	/**
	 * Enter a parse tree produced by {@link Inter_InstanceParser#intra}.
	 * @param ctx the parse tree
	 */
	void enterIntra(Inter_InstanceParser.IntraContext ctx);
	/**
	 * Exit a parse tree produced by {@link Inter_InstanceParser#intra}.
	 * @param ctx the parse tree
	 */
	void exitIntra(Inter_InstanceParser.IntraContext ctx);
	/**
	 * Enter a parse tree produced by {@link Inter_InstanceParser#inter}.
	 * @param ctx the parse tree
	 */
	void enterInter(Inter_InstanceParser.InterContext ctx);
	/**
	 * Exit a parse tree produced by {@link Inter_InstanceParser#inter}.
	 * @param ctx the parse tree
	 */
	void exitInter(Inter_InstanceParser.InterContext ctx);
	/**
	 * Enter a parse tree produced by {@link Inter_InstanceParser#interp}.
	 * @param ctx the parse tree
	 */
	void enterInterp(Inter_InstanceParser.InterpContext ctx);
	/**
	 * Exit a parse tree produced by {@link Inter_InstanceParser#interp}.
	 * @param ctx the parse tree
	 */
	void exitInterp(Inter_InstanceParser.InterpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code num}
	 * labeled alternative in {@link Inter_InstanceParser#nt}.
	 * @param ctx the parse tree
	 */
	void enterNum(Inter_InstanceParser.NumContext ctx);
	/**
	 * Exit a parse tree produced by the {@code num}
	 * labeled alternative in {@link Inter_InstanceParser#nt}.
	 * @param ctx the parse tree
	 */
	void exitNum(Inter_InstanceParser.NumContext ctx);
	/**
	 * Enter a parse tree produced by the {@code var}
	 * labeled alternative in {@link Inter_InstanceParser#nt}.
	 * @param ctx the parse tree
	 */
	void enterVar(Inter_InstanceParser.VarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code var}
	 * labeled alternative in {@link Inter_InstanceParser#nt}.
	 * @param ctx the parse tree
	 */
	void exitVar(Inter_InstanceParser.VarContext ctx);
	/**
	 * Enter a parse tree produced by the {@code dateTime}
	 * labeled alternative in {@link Inter_InstanceParser#tp}.
	 * @param ctx the parse tree
	 */
	void enterDateTime(Inter_InstanceParser.DateTimeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code dateTime}
	 * labeled alternative in {@link Inter_InstanceParser#tp}.
	 * @param ctx the parse tree
	 */
	void exitDateTime(Inter_InstanceParser.DateTimeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code date}
	 * labeled alternative in {@link Inter_InstanceParser#tp}.
	 * @param ctx the parse tree
	 */
	void enterDate(Inter_InstanceParser.DateContext ctx);
	/**
	 * Exit a parse tree produced by the {@code date}
	 * labeled alternative in {@link Inter_InstanceParser#tp}.
	 * @param ctx the parse tree
	 */
	void exitDate(Inter_InstanceParser.DateContext ctx);
	/**
	 * Enter a parse tree produced by the {@code time}
	 * labeled alternative in {@link Inter_InstanceParser#tp}.
	 * @param ctx the parse tree
	 */
	void enterTime(Inter_InstanceParser.TimeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code time}
	 * labeled alternative in {@link Inter_InstanceParser#tp}.
	 * @param ctx the parse tree
	 */
	void exitTime(Inter_InstanceParser.TimeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code varTP}
	 * labeled alternative in {@link Inter_InstanceParser#tp}.
	 * @param ctx the parse tree
	 */
	void enterVarTP(Inter_InstanceParser.VarTPContext ctx);
	/**
	 * Exit a parse tree produced by the {@code varTP}
	 * labeled alternative in {@link Inter_InstanceParser#tp}.
	 * @param ctx the parse tree
	 */
	void exitVarTP(Inter_InstanceParser.VarTPContext ctx);
	/**
	 * Enter a parse tree produced by {@link Inter_InstanceParser#dt}.
	 * @param ctx the parse tree
	 */
	void enterDt(Inter_InstanceParser.DtContext ctx);
	/**
	 * Exit a parse tree produced by {@link Inter_InstanceParser#dt}.
	 * @param ctx the parse tree
	 */
	void exitDt(Inter_InstanceParser.DtContext ctx);
	/**
	 * Enter a parse tree produced by {@link Inter_InstanceParser#d}.
	 * @param ctx the parse tree
	 */
	void enterD(Inter_InstanceParser.DContext ctx);
	/**
	 * Exit a parse tree produced by {@link Inter_InstanceParser#d}.
	 * @param ctx the parse tree
	 */
	void exitD(Inter_InstanceParser.DContext ctx);
	/**
	 * Enter a parse tree produced by {@link Inter_InstanceParser#t}.
	 * @param ctx the parse tree
	 */
	void enterT(Inter_InstanceParser.TContext ctx);
	/**
	 * Exit a parse tree produced by {@link Inter_InstanceParser#t}.
	 * @param ctx the parse tree
	 */
	void exitT(Inter_InstanceParser.TContext ctx);
	/**
	 * Enter a parse tree produced by the {@code absoluteInterval}
	 * labeled alternative in {@link Inter_InstanceParser#ts}.
	 * @param ctx the parse tree
	 */
	void enterAbsoluteInterval(Inter_InstanceParser.AbsoluteIntervalContext ctx);
	/**
	 * Exit a parse tree produced by the {@code absoluteInterval}
	 * labeled alternative in {@link Inter_InstanceParser#ts}.
	 * @param ctx the parse tree
	 */
	void exitAbsoluteInterval(Inter_InstanceParser.AbsoluteIntervalContext ctx);
	/**
	 * Enter a parse tree produced by the {@code varTS}
	 * labeled alternative in {@link Inter_InstanceParser#ts}.
	 * @param ctx the parse tree
	 */
	void enterVarTS(Inter_InstanceParser.VarTSContext ctx);
	/**
	 * Exit a parse tree produced by the {@code varTS}
	 * labeled alternative in {@link Inter_InstanceParser#ts}.
	 * @param ctx the parse tree
	 */
	void exitVarTS(Inter_InstanceParser.VarTSContext ctx);
	/**
	 * Enter a parse tree produced by {@link Inter_InstanceParser#equality}.
	 * @param ctx the parse tree
	 */
	void enterEquality(Inter_InstanceParser.EqualityContext ctx);
	/**
	 * Exit a parse tree produced by {@link Inter_InstanceParser#equality}.
	 * @param ctx the parse tree
	 */
	void exitEquality(Inter_InstanceParser.EqualityContext ctx);
	/**
	 * Enter a parse tree produced by {@link Inter_InstanceParser#inequality}.
	 * @param ctx the parse tree
	 */
	void enterInequality(Inter_InstanceParser.InequalityContext ctx);
	/**
	 * Exit a parse tree produced by {@link Inter_InstanceParser#inequality}.
	 * @param ctx the parse tree
	 */
	void exitInequality(Inter_InstanceParser.InequalityContext ctx);
	/**
	 * Enter a parse tree produced by {@link Inter_InstanceParser#arithmetic}.
	 * @param ctx the parse tree
	 */
	void enterArithmetic(Inter_InstanceParser.ArithmeticContext ctx);
	/**
	 * Exit a parse tree produced by {@link Inter_InstanceParser#arithmetic}.
	 * @param ctx the parse tree
	 */
	void exitArithmetic(Inter_InstanceParser.ArithmeticContext ctx);
}