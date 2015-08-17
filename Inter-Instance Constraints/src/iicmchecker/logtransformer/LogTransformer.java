package iicmchecker.logtransformer;

import java.util.Date;
import java.util.List;
import java.util.logging.Logger;

import de.uni.freiburg.iig.telematik.sewol.log.DataAttribute;
import de.uni.freiburg.iig.telematik.sewol.log.Log;
import de.uni.freiburg.iig.telematik.sewol.log.LogEntry;
import de.uni.freiburg.iig.telematik.sewol.log.LogTrace;
import iicmchecker.storage.StorageHelper;
import iicmchecker.storage.container.status.ExecutedGroupStatus;
import iicmchecker.storage.container.status.ExecutedUserStatus;
import iicmchecker.storage.container.container.StatusContainer;
import iicmchecker.storage.container.status.TaskAttribute;
import iicmchecker.storage.container.status.TaskEvent;
import iicmchecker.storage.container.status.TaskName;
import iicmchecker.storage.container.status.TaskWorkflow;
import iicmchecker.storage.container.status.Timestamp;
import iicmchecker.storage.container.status.WorkflowName;
import iicmchecker.utils.StringChecker;
import iicmchecker.utils.logging.LoggerFactory;

public class LogTransformer {

	static Integer wname = 0;
	static Integer wID = 0;
	static Integer tID = 0;
	
	
	private static Logger logger = LoggerFactory.getLogger();
	
	public void transform(List<List<Log<LogEntry>>> logs) {
		
		logger.severe("Starting log transformer...");
		
		StatusContainer sc = StorageHelper.getInstance().getStatusContainer();
		
		
		for (List<Log<LogEntry>> el : logs) { // Workflows
			String workflowname = wname.toString();
			wname ++;
			
			
			for (Log<LogEntry> logtraces : el) { // workflow Instanzen

				List<LogTrace<LogEntry>> lt = logtraces.getTraces();
			for (LogTrace<LogEntry> trace : lt) {
				
				List<LogEntry> entryList = trace.getEntries();
				String workflowID = wID.toString();
				wID++;
				
				for (LogEntry entry : entryList) { // Hier sind alle Tasks
					
					String taskID = tID.toString();
					tID++;

					
					String name = StringChecker.convertToValidConstant(entry.getActivity());
					String group = StringChecker.convertToValidConstant(entry.getRole());
					String user = StringChecker.convertToValidConstant(entry.getOriginator());
					String eventType = StringChecker.convertToValidConstant(entry.getEventType().toString());
					Date timestamp = entry.getTimestamp();
					
					if (group != null && taskID != null) {
					  sc.addExecutedGroupStatus(
					    new ExecutedGroupStatus(group, taskID));
					}
					
					if (user != null && taskID != null) {
					  sc.addExecutedUserStatus(
					    new ExecutedUserStatus(user, taskID));
					}
					
					if (timestamp != null && taskID != null) {	
					  sc.addTimestamp(new Timestamp(taskID, timestamp));
					}
					
					if (name != null && taskID != null) {
					  sc.addTaskName(new TaskName(taskID, name));
					}

					if (eventType != null && taskID != null) {
					  sc.addTaskEvent(new TaskEvent(taskID, eventType));
					}
					
					if (workflowID != null && taskID != null) {
					  sc.addTaskWorkflow(new TaskWorkflow(taskID, workflowID));
					}
					
					if (workflowID != null && workflowname != null) {
					  sc.addWorkflowName(new WorkflowName(workflowID, workflowname));
					}
					
					for(DataAttribute a : entry.getMetaAttributes()) {
						String attrName = StringChecker.convertToValidConstant(a.name);
						Object attrVal = a.value;
						String val = attrVal.toString();
						boolean b = StringChecker.isValidNumber(val);

						sc.addTaskAttribute(new TaskAttribute(taskID, attrName, val));

					}
					
				}
			}
			}
			
		}
		
		logger.severe("Log transformation finished.");
	}
}
