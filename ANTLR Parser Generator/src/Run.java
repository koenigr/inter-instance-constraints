import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

import org.antlr.v4.runtime.*;

public class Run {
	
public static void main(String[] args) throws Exception {
	
File f = new File("examples/myIICollection");
InputStream fs = new FileInputStream(f);
// create a CharStream that reads from standard input
ANTLRInputStream input = new ANTLRInputStream(fs);
// create a lexer that feeds off of input CharStream
Inter_InstanceLexer lexer = new Inter_InstanceLexer(input);
// create a buffer of tokens pulled from the lexer
CommonTokenStream tokens = new CommonTokenStream(lexer);
// create a parser that feeds off the tokens buffer
Inter_InstanceParser parser = new Inter_InstanceParser(tokens);
// begin parsing at rule r
Inter_InstanceParser.FileContext tree = parser.file();

tree.inspect(parser);
}

}
