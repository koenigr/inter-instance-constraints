package examples;

import java.io.IOException;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import main.Inter_InstanceLexer;
import main.Inter_InstanceParser;


public class UseListener {
	public static void main(String[] args) throws IOException {
		// create a CharStream that reads from standard input
		ANTLRInputStream input = new ANTLRInputStream(System.in);
		
		// create a lexer that feeds off of input CharStream
		Inter_InstanceLexer lexer = new Inter_InstanceLexer(input);
		
		// create a buffer of tokens pulled from the lexer
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		
		// create a parser that feeds off the tokens buffer
		Inter_InstanceParser parser = new Inter_InstanceParser(tokens);

		ParseTree tree = parser.file(); // begin parsing at r rule
		System.out.println(tree.toStringTree());
		
		
		// Create a generic parse tree walker that can trigger callbacks
		ParseTreeWalker walker = new ParseTreeWalker();
		
		// Walk the tree created during the parse, trigger callbacks
		walker.walk(new MyListener(), tree);
		System.out.println();
	}	
		
}
