package main;

// Generated from Inter_Instance.g4 by ANTLR 4.5
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link Inter_InstanceParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface Inter_InstanceVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link Inter_InstanceParser#file}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFile(Inter_InstanceParser.FileContext ctx);
	/**
	 * Visit a parse tree produced by {@link Inter_InstanceParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(Inter_InstanceParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Inter_InstanceParser#explicit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExplicit(Inter_InstanceParser.ExplicitContext ctx);
	/**
	 * Visit a parse tree produced by {@link Inter_InstanceParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(Inter_InstanceParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link Inter_InstanceParser#assignmentBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentBody(Inter_InstanceParser.AssignmentBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link Inter_InstanceParser#assignmentHead}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentHead(Inter_InstanceParser.AssignmentHeadContext ctx);
	/**
	 * Visit a parse tree produced by {@link Inter_InstanceParser#staticdynamic}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStaticdynamic(Inter_InstanceParser.StaticdynamicContext ctx);
	/**
	 * Visit a parse tree produced by {@link Inter_InstanceParser#staticdynamicBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStaticdynamicBody(Inter_InstanceParser.StaticdynamicBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link Inter_InstanceParser#staticdynamicHead}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStaticdynamicHead(Inter_InstanceParser.StaticdynamicHeadContext ctx);
	/**
	 * Visit a parse tree produced by {@link Inter_InstanceParser#derivation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDerivation(Inter_InstanceParser.DerivationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Inter_InstanceParser#derivationBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDerivationBody(Inter_InstanceParser.DerivationBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link Inter_InstanceParser#derivationHead}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDerivationHead(Inter_InstanceParser.DerivationHeadContext ctx);
	/**
	 * Visit a parse tree produced by {@link Inter_InstanceParser#extern}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExtern(Inter_InstanceParser.ExternContext ctx);
	/**
	 * Visit a parse tree produced by {@link Inter_InstanceParser#specification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSpecification(Inter_InstanceParser.SpecificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Inter_InstanceParser#enforcement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnforcement(Inter_InstanceParser.EnforcementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Inter_InstanceParser#status}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatus(Inter_InstanceParser.StatusContext ctx);
	/**
	 * Visit a parse tree produced by {@link Inter_InstanceParser#conditional}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditional(Inter_InstanceParser.ConditionalContext ctx);
	/**
	 * Visit a parse tree produced by {@link Inter_InstanceParser#comparison}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparison(Inter_InstanceParser.ComparisonContext ctx);
	/**
	 * Visit a parse tree produced by {@link Inter_InstanceParser#arithmetic}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArithmetic(Inter_InstanceParser.ArithmeticContext ctx);
	/**
	 * Visit a parse tree produced by {@link Inter_InstanceParser#user}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUser(Inter_InstanceParser.UserContext ctx);
	/**
	 * Visit a parse tree produced by {@link Inter_InstanceParser#role}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRole(Inter_InstanceParser.RoleContext ctx);
	/**
	 * Visit a parse tree produced by {@link Inter_InstanceParser#task}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTask(Inter_InstanceParser.TaskContext ctx);
	/**
	 * Visit a parse tree produced by {@link Inter_InstanceParser#intra}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntra(Inter_InstanceParser.IntraContext ctx);
	/**
	 * Visit a parse tree produced by {@link Inter_InstanceParser#inter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInter(Inter_InstanceParser.InterContext ctx);
	/**
	 * Visit a parse tree produced by {@link Inter_InstanceParser#interp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterp(Inter_InstanceParser.InterpContext ctx);
	/**
	 * Visit a parse tree produced by {@link Inter_InstanceParser#nt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNt(Inter_InstanceParser.NtContext ctx);
	/**
	 * Visit a parse tree produced by {@link Inter_InstanceParser#ut}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUt(Inter_InstanceParser.UtContext ctx);
	/**
	 * Visit a parse tree produced by {@link Inter_InstanceParser#rt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRt(Inter_InstanceParser.RtContext ctx);
	/**
	 * Visit a parse tree produced by {@link Inter_InstanceParser#ct}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCt(Inter_InstanceParser.CtContext ctx);
	/**
	 * Visit a parse tree produced by {@link Inter_InstanceParser#tt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTt(Inter_InstanceParser.TtContext ctx);
	/**
	 * Visit a parse tree produced by {@link Inter_InstanceParser#ti}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTi(Inter_InstanceParser.TiContext ctx);
	/**
	 * Visit a parse tree produced by {@link Inter_InstanceParser#wt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWt(Inter_InstanceParser.WtContext ctx);
	/**
	 * Visit a parse tree produced by {@link Inter_InstanceParser#taut}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTaut(Inter_InstanceParser.TautContext ctx);
	/**
	 * Visit a parse tree produced by {@link Inter_InstanceParser#input}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInput(Inter_InstanceParser.InputContext ctx);
	/**
	 * Visit a parse tree produced by {@link Inter_InstanceParser#inputvar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInputvar(Inter_InstanceParser.InputvarContext ctx);
	/**
	 * Visit a parse tree produced by {@link Inter_InstanceParser#output}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOutput(Inter_InstanceParser.OutputContext ctx);
	/**
	 * Visit a parse tree produced by {@link Inter_InstanceParser#outputvar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOutputvar(Inter_InstanceParser.OutputvarContext ctx);
}