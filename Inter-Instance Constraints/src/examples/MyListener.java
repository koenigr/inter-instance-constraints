package examples;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import storage.container.externspec.CriticalTaskPair;
import storage.container.externspec.ExternAndSpecificationContainer;
import main.Inter_InstanceBaseListener;
import main.Inter_InstanceListener;
import main.Inter_InstanceParser;
import main.Inter_InstanceParser.FileContext;



public class MyListener extends Inter_InstanceBaseListener {
	
	ExternAndSpecificationContainer esc = new ExternAndSpecificationContainer("prologfiles/externSpec.pl");
	
	public void enterFile(FileContext ctx) {
		System.out.println("Was ist bloß los??");
	}
}
