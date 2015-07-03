package iicmchecker.storage.container.status;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.io.Writer;
import java.util.ArrayList;

public class StatusContainer {
	

	private static String outputFile;

	private static ArrayList<ExecutedUserStatus> exUserStatus = new ArrayList<ExecutedUserStatus>();

	private static ArrayList<ExecutedGroupStatus> exGroupStatus = new ArrayList<ExecutedGroupStatus>();
	
	private static ArrayList<Timestamp> timestamp = new ArrayList<Timestamp>();
	
	private static ArrayList<TaskName> taskName = new ArrayList<TaskName>();

	private static ArrayList<TaskEvent> taskEvent = new ArrayList<TaskEvent>();
	
	private static ArrayList<TaskWorkflow> taskWorkflow = new ArrayList<TaskWorkflow>();
	
	private static ArrayList<WorkflowName> workflowName = new ArrayList<WorkflowName>();
	
	private static ArrayList<TaskAttribute> taskAttribute = new ArrayList<TaskAttribute>();
	
	public void setOutputFile(String file) {
		outputFile = file;
	}
	
	public void addExecutedUserStatus(ExecutedUserStatus s) {
		exUserStatus.add(s);
	}
	
	public void addExecutedGroupStatus(ExecutedGroupStatus s) {
		exGroupStatus.add(s);
	}

	public void addTimestamp(Timestamp s) {
		timestamp.add(s);
	}
	
	public void addTaskName(TaskName s) {
		taskName.add(s);
	}

	public void addTaskEvent(TaskEvent s) {
		taskEvent.add(s);
	}
	
	public void addTaskWorkflow(TaskWorkflow s) {
		taskWorkflow.add(s);
	}
	
	public void addWorkflowName(WorkflowName s) {
		workflowName.add(s);
	}

	public void addTaskAttribute(TaskAttribute s) {
		taskAttribute.add(s);
	}
	
	public void printToFile() {
		try {
			
			Writer writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(outputFile), "utf-8"));
			writer.write("% exetuted_u status facts\n"); 

			for (ExecutedUserStatus e : exUserStatus) {
				writer.write(e.getAsString());
				writer.write(".\n");
			}
			
			writer.write("% exetuted_g status facts\n"); 

			for (ExecutedGroupStatus e : exGroupStatus) {
				writer.write(e.getAsString());
				writer.write(".\n");
			}
			
			writer.write("% task names \n"); 

			for (TaskName e : taskName) {
				writer.write(e.getAsString());
				writer.write(".\n");
			}
			
			writer.write("% event types \n"); 

			for (TaskEvent e : taskEvent) {
				writer.write(e.getAsString());
				writer.write(".\n");
			}
			
			writer.write("% timestamps\n"); 

			for (Timestamp e : timestamp) {
				writer.write(e.getAsString());
				writer.write(".\n");
			}
			
			writer.write("% task workflow facts\n"); 

			for (TaskWorkflow e : taskWorkflow) {
				writer.write(e.getAsString());
				writer.write(".\n");
			}
			
			writer.write("% workflow names facts\n"); 

			for (WorkflowName e : workflowName) {
				writer.write(e.getAsString());
				writer.write(".\n");
			}
			
			writer.write("% task attributes\n");
			
			for (TaskAttribute e : taskAttribute) {
				writer.write(e.getAsString());
				writer.write(".\n");
			}
			
			
			
			
			
			writer.close();
			System.out.println("Written??");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (UnsupportedEncodingException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
}
