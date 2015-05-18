package antlr4;

// Generated from Inter_Instance.g4 by ANTLR 4.4
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link Inter_InstanceParser}.
 */
public interface Inter_InstanceListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by the {@code wer}
	 * labeled alternative in {@link Inter_InstanceParser#r}.
	 * @param ctx the parse tree
	 */
	void enterWer(@NotNull Inter_InstanceParser.WerContext ctx);
	/**
	 * Exit a parse tree produced by the {@code wer}
	 * labeled alternative in {@link Inter_InstanceParser#r}.
	 * @param ctx the parse tree
	 */
	void exitWer(@NotNull Inter_InstanceParser.WerContext ctx);
	/**
	 * Enter a parse tree produced by the {@code depp}
	 * labeled alternative in {@link Inter_InstanceParser#r}.
	 * @param ctx the parse tree
	 */
	void enterDepp(@NotNull Inter_InstanceParser.DeppContext ctx);
	/**
	 * Exit a parse tree produced by the {@code depp}
	 * labeled alternative in {@link Inter_InstanceParser#r}.
	 * @param ctx the parse tree
	 */
	void exitDepp(@NotNull Inter_InstanceParser.DeppContext ctx);
}