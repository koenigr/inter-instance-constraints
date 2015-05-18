package logtransformer;

import java.util.List;

import storage.container.ExecutedStatus;
import storage.container.StatusContainer;
import storage.ontology.Ontology;
import storage.ontology.Ontology.Group;
import storage.ontology.Ontology.Instance;
import storage.ontology.Ontology.Task;
import storage.ontology.Ontology.Timestamp;
import storage.ontology.Ontology.User;
import storage.ontology.Ontology.Workflow;
import de.uni.freiburg.iig.telematik.jawl.log.LogEntry;
import de.uni.freiburg.iig.telematik.jawl.log.LogTrace;

public class LogTransformer {
	Ontology on = new Ontology();

	public void transform(List<List<LogTrace<LogEntry>>> logs) {
		// Ontology
		Instance i1 = on.new Instance();
		on.lt.instanceList.add(i1);
		Workflow w = on.new Workflow("Dieses hier");
		i1.workflow = w;
		
		
		// Status Container
		StatusContainer sc = new StatusContainer();
		
		
		System.out.println("1 " + logs.size());
		System.out.println(logs.toString());
		
		
		for (List<LogTrace<LogEntry>> el : logs) {
			System.out.println("2 " + el.size());
			System.out.println(el.toString());
			for (LogTrace<LogEntry> trace : el) {
				System.out.println("3 " + trace.size());
				System.out.println(trace.toString());
				List<LogEntry> entryList = trace.getEntries();
				for (LogEntry entry : entryList) {
					String username = entry.getOriginator();
					String groupname = entry.getGroup();
					String taskname = entry.getActivity();
					
					// Feed ontology
					Group g = on.new Group(groupname); // prüfen, ob es die schon gibt
					User u = on.new User(username);
					Task t = on.new Task(on.new Timestamp(), taskname, u, g);
					
					// Feed status container
					sc.addExecutedStatus(new ExecutedStatus(username, taskname));
					
					System.out.println("4 " + trace.size());
					System.out.println(entry.toString());
					
				}	
			}
		}
	}
}
