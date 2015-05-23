package examples;


import java.io.IOException;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import main.Inter_InstanceLexer;
import main.Inter_InstanceParser;

public class UseParser {

	public static void main(String[] args) throws IOException {
		// create a CharStream that reads from standard input
		ANTLRInputStream input = new ANTLRInputStream(System.in);
		
		// create a lexer that feeds off of input CharStream
		Inter_InstanceLexer lexer = new Inter_InstanceLexer(input);
		
		// create a buffer of tokens pulled from the lexer
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		
		// create a parser that feeds off the tokens buffer
		Inter_InstanceParser parser = new Inter_InstanceParser(tokens);

		ParseTree tree = parser.r(); // begin parsing at r rule
		System.out.println(tree.toStringTree());
	}

}
