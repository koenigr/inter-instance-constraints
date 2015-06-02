

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;





public class MyListener extends Inter_InstanceBaseListener {
	

	public void enterFile(Inter_InstanceParser.FileContext ctx) {
		System.out.println("Was ist bloß los??");
	}
}
