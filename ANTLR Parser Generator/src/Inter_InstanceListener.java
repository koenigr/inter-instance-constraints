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
	 * Enter a parse tree produced by {@link Inter_InstanceParser#explicit}.
	 * @param ctx the parse tree
	 */
	void enterExplicit(Inter_InstanceParser.ExplicitContext ctx);
	/**
	 * Exit a parse tree produced by {@link Inter_InstanceParser#explicit}.
	 * @param ctx the parse tree
	 */
	void exitExplicit(Inter_InstanceParser.ExplicitContext ctx);
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
	 * Enter a parse tree produced by {@link Inter_InstanceParser#staticdynamic}.
	 * @param ctx the parse tree
	 */
	void enterStaticdynamic(Inter_InstanceParser.StaticdynamicContext ctx);
	/**
	 * Exit a parse tree produced by {@link Inter_InstanceParser#staticdynamic}.
	 * @param ctx the parse tree
	 */
	void exitStaticdynamic(Inter_InstanceParser.StaticdynamicContext ctx);
	/**
	 * Enter a parse tree produced by {@link Inter_InstanceParser#staticdynamicBody}.
	 * @param ctx the parse tree
	 */
	void enterStaticdynamicBody(Inter_InstanceParser.StaticdynamicBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link Inter_InstanceParser#staticdynamicBody}.
	 * @param ctx the parse tree
	 */
	void exitStaticdynamicBody(Inter_InstanceParser.StaticdynamicBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link Inter_InstanceParser#staticdynamicHead}.
	 * @param ctx the parse tree
	 */
	void enterStaticdynamicHead(Inter_InstanceParser.StaticdynamicHeadContext ctx);
	/**
	 * Exit a parse tree produced by {@link Inter_InstanceParser#staticdynamicHead}.
	 * @param ctx the parse tree
	 */
	void exitStaticdynamicHead(Inter_InstanceParser.StaticdynamicHeadContext ctx);
	/**
	 * Enter a parse tree produced by {@link Inter_InstanceParser#derivation}.
	 * @param ctx the parse tree
	 */
	void enterDerivation(Inter_InstanceParser.DerivationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Inter_InstanceParser#derivation}.
	 * @param ctx the parse tree
	 */
	void exitDerivation(Inter_InstanceParser.DerivationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Inter_InstanceParser#derivationBody}.
	 * @param ctx the parse tree
	 */
	void enterDerivationBody(Inter_InstanceParser.DerivationBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link Inter_InstanceParser#derivationBody}.
	 * @param ctx the parse tree
	 */
	void exitDerivationBody(Inter_InstanceParser.DerivationBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link Inter_InstanceParser#derivationHead}.
	 * @param ctx the parse tree
	 */
	void enterDerivationHead(Inter_InstanceParser.DerivationHeadContext ctx);
	/**
	 * Exit a parse tree produced by {@link Inter_InstanceParser#derivationHead}.
	 * @param ctx the parse tree
	 */
	void exitDerivationHead(Inter_InstanceParser.DerivationHeadContext ctx);
	/**
	 * Enter a parse tree produced by {@link Inter_InstanceParser#extern}.
	 * @param ctx the parse tree
	 */
	void enterExtern(Inter_InstanceParser.ExternContext ctx);
	/**
	 * Exit a parse tree produced by {@link Inter_InstanceParser#extern}.
	 * @param ctx the parse tree
	 */
	void exitExtern(Inter_InstanceParser.ExternContext ctx);
	/**
	 * Enter a parse tree produced by {@link Inter_InstanceParser#specification}.
	 * @param ctx the parse tree
	 */
	void enterSpecification(Inter_InstanceParser.SpecificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Inter_InstanceParser#specification}.
	 * @param ctx the parse tree
	 */
	void exitSpecification(Inter_InstanceParser.SpecificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Inter_InstanceParser#enforcement}.
	 * @param ctx the parse tree
	 */
	void enterEnforcement(Inter_InstanceParser.EnforcementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Inter_InstanceParser#enforcement}.
	 * @param ctx the parse tree
	 */
	void exitEnforcement(Inter_InstanceParser.EnforcementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Inter_InstanceParser#status}.
	 * @param ctx the parse tree
	 */
	void enterStatus(Inter_InstanceParser.StatusContext ctx);
	/**
	 * Exit a parse tree produced by {@link Inter_InstanceParser#status}.
	 * @param ctx the parse tree
	 */
	void exitStatus(Inter_InstanceParser.StatusContext ctx);
	/**
	 * Enter a parse tree produced by {@link Inter_InstanceParser#conditional}.
	 * @param ctx the parse tree
	 */
	void enterConditional(Inter_InstanceParser.ConditionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link Inter_InstanceParser#conditional}.
	 * @param ctx the parse tree
	 */
	void exitConditional(Inter_InstanceParser.ConditionalContext ctx);
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
	 * Enter a parse tree produced by {@link Inter_InstanceParser#user}.
	 * @param ctx the parse tree
	 */
	void enterUser(Inter_InstanceParser.UserContext ctx);
	/**
	 * Exit a parse tree produced by {@link Inter_InstanceParser#user}.
	 * @param ctx the parse tree
	 */
	void exitUser(Inter_InstanceParser.UserContext ctx);
	/**
	 * Enter a parse tree produced by {@link Inter_InstanceParser#role}.
	 * @param ctx the parse tree
	 */
	void enterRole(Inter_InstanceParser.RoleContext ctx);
	/**
	 * Exit a parse tree produced by {@link Inter_InstanceParser#role}.
	 * @param ctx the parse tree
	 */
	void exitRole(Inter_InstanceParser.RoleContext ctx);
	/**
	 * Enter a parse tree produced by {@link Inter_InstanceParser#task}.
	 * @param ctx the parse tree
	 */
	void enterTask(Inter_InstanceParser.TaskContext ctx);
	/**
	 * Exit a parse tree produced by {@link Inter_InstanceParser#task}.
	 * @param ctx the parse tree
	 */
	void exitTask(Inter_InstanceParser.TaskContext ctx);
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
	 * Enter a parse tree produced by {@link Inter_InstanceParser#input}.
	 * @param ctx the parse tree
	 */
	void enterInput(Inter_InstanceParser.InputContext ctx);
	/**
	 * Exit a parse tree produced by {@link Inter_InstanceParser#input}.
	 * @param ctx the parse tree
	 */
	void exitInput(Inter_InstanceParser.InputContext ctx);
	/**
	 * Enter a parse tree produced by {@link Inter_InstanceParser#inputvar}.
	 * @param ctx the parse tree
	 */
	void enterInputvar(Inter_InstanceParser.InputvarContext ctx);
	/**
	 * Exit a parse tree produced by {@link Inter_InstanceParser#inputvar}.
	 * @param ctx the parse tree
	 */
	void exitInputvar(Inter_InstanceParser.InputvarContext ctx);
	/**
	 * Enter a parse tree produced by {@link Inter_InstanceParser#output}.
	 * @param ctx the parse tree
	 */
	void enterOutput(Inter_InstanceParser.OutputContext ctx);
	/**
	 * Exit a parse tree produced by {@link Inter_InstanceParser#output}.
	 * @param ctx the parse tree
	 */
	void exitOutput(Inter_InstanceParser.OutputContext ctx);
	/**
	 * Enter a parse tree produced by {@link Inter_InstanceParser#outputvar}.
	 * @param ctx the parse tree
	 */
	void enterOutputvar(Inter_InstanceParser.OutputvarContext ctx);
	/**
	 * Exit a parse tree produced by {@link Inter_InstanceParser#outputvar}.
	 * @param ctx the parse tree
	 */
	void exitOutputvar(Inter_InstanceParser.OutputvarContext ctx);
}