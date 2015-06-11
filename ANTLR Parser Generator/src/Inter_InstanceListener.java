// Generated from Inter_Instance.g4 by ANTLR 4.5
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
	 * Enter a parse tree produced by {@link Inter_InstanceParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(Inter_InstanceParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Inter_InstanceParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(Inter_InstanceParser.StatementContext ctx);
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
	 * Enter a parse tree produced by the {@code collaboratorExt}
	 * labeled alternative in {@link Inter_InstanceParser#status}.
	 * @param ctx the parse tree
	 */
	void enterCollaboratorExt(Inter_InstanceParser.CollaboratorExtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code collaboratorExt}
	 * labeled alternative in {@link Inter_InstanceParser#status}.
	 * @param ctx the parse tree
	 */
	void exitCollaboratorExt(Inter_InstanceParser.CollaboratorExtContext ctx);
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
	 * Enter a parse tree produced by the {@code numDiff}
	 * labeled alternative in {@link Inter_InstanceParser#conditional}.
	 * @param ctx the parse tree
	 */
	void enterNumDiff(Inter_InstanceParser.NumDiffContext ctx);
	/**
	 * Exit a parse tree produced by the {@code numDiff}
	 * labeled alternative in {@link Inter_InstanceParser#conditional}.
	 * @param ctx the parse tree
	 */
	void exitNumDiff(Inter_InstanceParser.NumDiffContext ctx);
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
	 * Enter a parse tree produced by the {@code equality}
	 * labeled alternative in {@link Inter_InstanceParser#comparison}.
	 * @param ctx the parse tree
	 */
	void enterEquality(Inter_InstanceParser.EqualityContext ctx);
	/**
	 * Exit a parse tree produced by the {@code equality}
	 * labeled alternative in {@link Inter_InstanceParser#comparison}.
	 * @param ctx the parse tree
	 */
	void exitEquality(Inter_InstanceParser.EqualityContext ctx);
	/**
	 * Enter a parse tree produced by the {@code unequality}
	 * labeled alternative in {@link Inter_InstanceParser#comparison}.
	 * @param ctx the parse tree
	 */
	void enterUnequality(Inter_InstanceParser.UnequalityContext ctx);
	/**
	 * Exit a parse tree produced by the {@code unequality}
	 * labeled alternative in {@link Inter_InstanceParser#comparison}.
	 * @param ctx the parse tree
	 */
	void exitUnequality(Inter_InstanceParser.UnequalityContext ctx);
	/**
	 * Enter a parse tree produced by {@link Inter_InstanceParser#equalityParams}.
	 * @param ctx the parse tree
	 */
	void enterEqualityParams(Inter_InstanceParser.EqualityParamsContext ctx);
	/**
	 * Exit a parse tree produced by {@link Inter_InstanceParser#equalityParams}.
	 * @param ctx the parse tree
	 */
	void exitEqualityParams(Inter_InstanceParser.EqualityParamsContext ctx);
	/**
	 * Enter a parse tree produced by {@link Inter_InstanceParser#inequalityParams}.
	 * @param ctx the parse tree
	 */
	void enterInequalityParams(Inter_InstanceParser.InequalityParamsContext ctx);
	/**
	 * Exit a parse tree produced by {@link Inter_InstanceParser#inequalityParams}.
	 * @param ctx the parse tree
	 */
	void exitInequalityParams(Inter_InstanceParser.InequalityParamsContext ctx);
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
	 * Enter a parse tree produced by {@link Inter_InstanceParser#nt}.
	 * @param ctx the parse tree
	 */
	void enterNt(Inter_InstanceParser.NtContext ctx);
	/**
	 * Exit a parse tree produced by {@link Inter_InstanceParser#nt}.
	 * @param ctx the parse tree
	 */
	void exitNt(Inter_InstanceParser.NtContext ctx);
	/**
	 * Enter a parse tree produced by {@link Inter_InstanceParser#ct}.
	 * @param ctx the parse tree
	 */
	void enterCt(Inter_InstanceParser.CtContext ctx);
	/**
	 * Exit a parse tree produced by {@link Inter_InstanceParser#ct}.
	 * @param ctx the parse tree
	 */
	void exitCt(Inter_InstanceParser.CtContext ctx);
	/**
	 * Enter a parse tree produced by {@link Inter_InstanceParser#ti}.
	 * @param ctx the parse tree
	 */
	void enterTi(Inter_InstanceParser.TiContext ctx);
	/**
	 * Exit a parse tree produced by {@link Inter_InstanceParser#ti}.
	 * @param ctx the parse tree
	 */
	void exitTi(Inter_InstanceParser.TiContext ctx);
	/**
	 * Enter a parse tree produced by {@link Inter_InstanceParser#wt}.
	 * @param ctx the parse tree
	 */
	void enterWt(Inter_InstanceParser.WtContext ctx);
	/**
	 * Exit a parse tree produced by {@link Inter_InstanceParser#wt}.
	 * @param ctx the parse tree
	 */
	void exitWt(Inter_InstanceParser.WtContext ctx);
	/**
	 * Enter a parse tree produced by {@link Inter_InstanceParser#taut}.
	 * @param ctx the parse tree
	 */
	void enterTaut(Inter_InstanceParser.TautContext ctx);
	/**
	 * Exit a parse tree produced by {@link Inter_InstanceParser#taut}.
	 * @param ctx the parse tree
	 */
	void exitTaut(Inter_InstanceParser.TautContext ctx);
	/**
	 * Enter a parse tree produced by {@link Inter_InstanceParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(Inter_InstanceParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link Inter_InstanceParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(Inter_InstanceParser.VariableContext ctx);
}