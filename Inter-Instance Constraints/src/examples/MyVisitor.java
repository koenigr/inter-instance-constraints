package examples;

import org.antlr.v4.runtime.misc.NotNull;

import antlr4.Inter_InstanceBaseVisitor;
import antlr4.Inter_InstanceParser;

public class MyVisitor extends Inter_InstanceBaseVisitor<Void>{

	@Override
	public Void visitWer(@NotNull Inter_InstanceParser.WerContext ctx) { 
		  String id = ctx.getText();
		  System.out.println("das gibt es nun aus im werCtx: " + id);
		return null;
		}

	@Override 
	public Void visitDepp(@NotNull Inter_InstanceParser.DeppContext ctx) { 
		  String id = ctx.getText();
		  System.out.println("das gibt es nun aus im deppCtx: " + id);
		return null;
		}
}
