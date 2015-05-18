package constraintsParser;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import antlr4.Inter_InstanceLexer;
import antlr4.Inter_InstanceParser;

public class ConstraintsParser {
	
	public ParseTree parse() throws IOException {

		File f = new File("constraintfiles/test");
		InputStream in = System.in;

		try {
			in = new FileInputStream( f );
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
		// create a CharStream that reads from standard input
		ANTLRInputStream input;

		input = new ANTLRInputStream(in);
			
		// create a lexer that feeds off of input CharStream
		Inter_InstanceLexer lexer = new Inter_InstanceLexer(input);
			
		// create a buffer of tokens pulled from the lexer
		CommonTokenStream tokens = new CommonTokenStream(lexer);
			
		// create a parser that feeds off the tokens buffer
		Inter_InstanceParser parser = new Inter_InstanceParser(tokens);

		ParseTree tree = parser.r(); // begin parsing at r rule
			
		return tree;
	}

}
