package iicmchecker.storage.container.rules;

import java.util.ArrayList;

import iicmchecker.storage.container.Fact;

public class Defined extends Fact {

	public Defined(String predicate, ArrayList<String> args) {
		super(predicate, args.size());
		int i = 0;
		for (String arg : args) {
			setArgument(i, arg);
			i++;
		}
	}

}
