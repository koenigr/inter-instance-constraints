import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import constraintReader.Inter_InstanceLexer;
import constraintReader.Inter_InstanceParser;
import constraintReader.MyListener;
import storage.StorageHelper;


public class Run {
	
public static void main(String[] args) throws Exception {

// TODO die Files als Arg übergeben	
String location = "examples";
String[] filenames = {
		"example1" , "example2", "example3" , "example_definition_file" ,
		"IntraInstance_hierarchical" , "InterInstance_hierarchical", 
		"InterProcess_hierarchical", "IntraInstance_nonhierarchical",
	    "InterInstance_nonhierarchical", "InterProcess_nonhierarchical",
		};

for (String file : filenames) {
	
File f = new File(location + "/" +  file);
InputStream fs = new FileInputStream(f);
// create a CharStream that reads from standard input
ANTLRInputStream input = new ANTLRInputStream(fs);
// create a lexer that feeds off of input CharStream
Inter_InstanceLexer lexer = new Inter_InstanceLexer(input);
// create a buffer of tokens pulled from the lexer
CommonTokenStream tokens = new CommonTokenStream(lexer);
// create a parser that feeds off the tokens buffer
Inter_InstanceParser parser = new Inter_InstanceParser(tokens);
// begin parsing at rule file

Inter_InstanceParser.FileContext tree = parser.file();

fs.close();

ParseTreeWalker walker = new ParseTreeWalker();
walker.walk(new MyListener(), tree);


// tree.inspect(parser);

}

StorageHelper.getInstance().printToFile();

}

}
