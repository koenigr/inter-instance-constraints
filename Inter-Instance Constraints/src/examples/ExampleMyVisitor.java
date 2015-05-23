package examples;

import org.antlr.v4.runtime.misc.NotNull;

import main.Inter_InstanceBaseVisitor;
import main.Inter_InstanceParser;

public class MyVisitor extends Inter_InstanceBaseVisitor<Void>{

	@Override
	public Void visitFile(@NotNull Inter_InstanceParser.FileContext ctx) { 
		 // String id = ctx.getText();
		  //System.out.println("das gibt es nun aus im werCtx: " + id);
		return null;
		}
}
