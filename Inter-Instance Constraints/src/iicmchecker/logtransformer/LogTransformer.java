package iicmchecker.logtransformer;

import java.util.Date;
import java.util.List;

import de.uni.freiburg.iig.telematik.sewol.log.DataAttribute;
import de.uni.freiburg.iig.telematik.sewol.log.LogEntry;
import de.uni.freiburg.iig.telematik.sewol.log.LogTrace;
import iicmchecker.storage.StorageHelper;
import iicmchecker.storage.container.status.ExecutedGroupStatus;
import iicmchecker.storage.container.status.ExecutedUserStatus;
import iicmchecker.storage.container.status.StatusContainer;
import iicmchecker.storage.container.status.TaskAttribute;
import iicmchecker.storage.container.status.TaskName;
import iicmchecker.storage.container.status.TaskWorkflow;
import iicmchecker.storage.container.status.Timestamp;
import iicmchecker.storage.container.status.WorkflowName;

public class LogTransformer {
	
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
					/*
					 *  TODO wie wird das behandelt?
					 *  Einfach null setzen oder das letzte Datum  + 1 nehmen?
					 */
					
						timestamp = new Date();
					}
					
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
					
					if (workflowID != null && taskID != null) {
					  sc.addTaskWorkflow(new TaskWorkflow(taskID, workflowID));
					}
					
					if (workflowID != null && workflowname != null) {
					  sc.addWorkflowName(new WorkflowName(workflowID, workflowname));
					}
					
					for(DataAttribute a : entry.getMetaAttributes()) {
						String attrName = a.name;
						Object attrVal = a.value;
						// TODO sc.addTaskAttribute(new TaskAttribute(taskID, attrName, attrVal ));
					}
					
				}
			}
			
		}
		
	}
}