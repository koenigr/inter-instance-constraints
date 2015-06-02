package modelchecker;

import java.util.List;

import org.antlr.v4.runtime.tree.ParseTree;

import de.uni.freiburg.iig.telematik.sewol.log.LogEntry;
import de.uni.freiburg.iig.telematik.sewol.log.LogTrace;

public class Modelchecker {
	
	ParseTree tree; // TODO ich brauch net den ParseTree sondern eine DataStructure mit den geparsten Constraints
	List<List<LogTrace<LogEntry>>> logs;

	public Modelchecker(ParseTree tree, List<List<LogTrace<LogEntry>>> logs) {
		this.tree = tree;
		this.logs = logs;
	}
}
