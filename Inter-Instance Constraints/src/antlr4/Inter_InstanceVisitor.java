package antlr4;

// Generated from Inter_Instance.g4 by ANTLR 4.4
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
	 * Visit a parse tree produced by the {@code wer}
	 * labeled alternative in {@link Inter_InstanceParser#r}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWer(@NotNull Inter_InstanceParser.WerContext ctx);
	/**
	 * Visit a parse tree produced by the {@code depp}
	 * labeled alternative in {@link Inter_InstanceParser#r}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDepp(@NotNull Inter_InstanceParser.DeppContext ctx);
}