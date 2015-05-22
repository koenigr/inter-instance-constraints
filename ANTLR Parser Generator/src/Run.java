import org.antlr.v4.runtime.*;

public class Run {
	
public static void main(String[] args) throws Exception {
// create a CharStream that reads from standard input
CharStream input = new ANTLRInputStream(System.in);
// create a lexer that feeds off of input CharStream
Inter_InstanceLexer lexer = new Inter_InstanceLexer(input);
// create a buffer of tokens pulled from the lexer
CommonTokenStream tokens = new CommonTokenStream(lexer);
// create a parser that feeds off the tokens buffer
Inter_InstanceParser parser = new Inter_InstanceParser(tokens);
// begin parsing at rule r
parser.file();
}

}
