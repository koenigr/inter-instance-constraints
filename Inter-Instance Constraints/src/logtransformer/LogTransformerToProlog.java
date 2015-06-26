package logtransformer;

import java.util.Date;
import java.util.List;

import de.uni.freiburg.iig.telematik.sewol.log.DataAttribute;
import de.uni.freiburg.iig.telematik.sewol.log.LogEntry;
import de.uni.freiburg.iig.telematik.sewol.log.LogTrace;
import storage.StorageHelper;
import storage.container.status.ExecutedGroupStatus;
import storage.container.status.ExecutedUserStatus;
import storage.container.status.StatusContainer;
import storage.container.status.TaskAttribute;
import storage.container.status.TaskName;
import storage.container.status.TaskWorkflow;
import storage.container.status.Timestamp;
import storage.container.status.WorkflowName;

public class LogTransformerToProlog {
	
	public void transform(List<List<LogTrace<LogEntry>>> logs) {
		StatusContainer sc = StorageHelper.getInstance().getStatusContainer();
		Integer wname = 0;
		Integer wID = 0;
		Integer tID = 0;
		
		
		for (List<LogTrace<LogEntry>> el : logs) { // Workflows
			String workflowname = wname.toString();
			wname ++;
			
			for (LogTrace<LogEntry> trace : el) { // workflow Instanzen
				
				List<LogEntry> entryList = trace.getEntries();
				String workflowID = wID.toString();
				wID++;
				
				for (LogEntry entry : entryList) { // Hier sind alle Tasks
					
					String taskID = tID.toString();
					tID++;

					
					String name = entry.getActivity();
					String group = entry.getGroup();
					String user = entry.getOriginator();
					
					Date timestamp = entry.getTimestamp();
					if (timestamp == null) {
						timestamp = new Date();
					}
					
					sc.addExecutedGroupStatus(
							new ExecutedGroupStatus(group, taskID));
					sc.addExecutedUserStatus(
							new ExecutedUserStatus(user, taskID));
					sc.addTimestamp(new Timestamp(taskID, timestamp));
					sc.addTaskName(new TaskName(taskID, name));
					sc.addTaskWorkflow(new TaskWorkflow(taskID, workflowID));
					sc.addWorkflowName(new WorkflowName(workflowID, workflowname));
					
					for(DataAttribute a : entry.getMetaAttributes()) {
						String attrName = a.name;
						Object attrVal = a.value;
						sc.addTaskAttribute(new TaskAttribute(taskID, attrName, attrVal ));
					}
					
				}
			}
			
		}
		
	}
}
