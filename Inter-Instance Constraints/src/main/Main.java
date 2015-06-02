package main;

import java.io.IOException;
import java.util.List;
import java.util.logging.Logger;

import logging.LoggerFactory;
import logparser.LogCreator;
import logtransformer.LogTransformerToProlog;
import modelchecker.Modelchecker;

import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import constraintsParser.ConstraintsParser;
import de.invation.code.toval.parser.ParserException;
import de.invation.code.toval.validate.CompatibilityException;
import de.invation.code.toval.validate.ParameterException;
import de.uni.freiburg.iig.telematik.sewol.log.LockingException;
import de.uni.freiburg.iig.telematik.sewol.log.LogEntry;
import de.uni.freiburg.iig.telematik.sewol.log.LogTrace;
import de.uni.freiburg.iig.telematik.sewol.writer.PerspectiveException;
import examples.MyListener;
import examples.MyVisitor;

public class Main {
	
	Logger logger = LoggerFactory.getLogger();

	public static void main(String[] args) {
		
		try {
		
		ConstraintsParser cparser = new ConstraintsParser();
		ParseTree tree = cparser.parse();
		
		System.out.println(tree.toStringTree());
			
		MyVisitor visitor = new MyVisitor();
		visitor.visit(tree);
		
		ParseTreeWalker walker = new ParseTreeWalker();
		walker.walk(new MyListener(), tree);
		
		LogCreator lcreator = new LogCreator();
		List<List<LogTrace<LogEntry>>> logs = lcreator.createLog();
		
		LogTransformerToProlog ltransformer = new LogTransformerToProlog();
		ltransformer.transform(logs);
		
		Modelchecker mc = new Modelchecker(tree, logs);
		
		} catch (IOException e) {
			
		} catch (CompatibilityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ParameterException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (LockingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (PerspectiveException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ParserException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
