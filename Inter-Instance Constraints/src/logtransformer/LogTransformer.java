package logtransformer;

import java.util.List;

import storage.StorageHelper;
import storage.container.status.ExecutedUserStatus;
import storage.container.status.StatusContainer;
import de.uni.freiburg.iig.telematik.sewol.log.LogEntry;
import de.uni.freiburg.iig.telematik.sewol.log.LogTrace;

public class LogTransformer {
	public void transform(List<List<LogTrace<LogEntry>>> logs) {
		
		// Status Container
		StatusContainer sc = StorageHelper.getInstance().getStatusContainer();
		
		
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

					// Feed status container
					sc.addExecutedUserStatus(new ExecutedUserStatus(username, taskname));
					
					System.out.println("4 " + trace.size());
					System.out.println(entry.toString());
					
				}	
			}
		}
	}
}
