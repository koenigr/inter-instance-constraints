package examples;

import antlr4.Inter_InstanceBaseListener;
import antlr4.Inter_InstanceParser;



public class MyListener extends Inter_InstanceBaseListener {

	public void exitR(Inter_InstanceParser.RContext ctx) {
		System.out.println("Na endlich");
	}
}
