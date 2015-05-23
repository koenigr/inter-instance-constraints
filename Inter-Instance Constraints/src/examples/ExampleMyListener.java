package examples;

import main.Inter_InstanceBaseListener;
import main.Inter_InstanceParser;



public class MyListener extends Inter_InstanceBaseListener {

	public void exitFile(Inter_InstanceParser.FileContext ctx) {
		System.out.println("Na endlich");
	}
}
