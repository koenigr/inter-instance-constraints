package storage.ontology;

import java.util.ArrayList;

public class Ontology {
	// Singleton??
	
	public LogTrace lt = new LogTrace();
	public ArrayList<User> userList= new ArrayList<User>();
	public ArrayList<Group> groupList= new ArrayList<Group>();
	public ArrayList<Task> taskList= new ArrayList<Task>();
	
	public class Task {
	  public Timestamp ts;
	  public String name;
	  public User user;
	  public Group group;
	  // TODO es sollte noch einen Eintrag für Workflow geben
	  
	  public Task(Timestamp ts, String name, User user, Group group) {
		  this.ts = ts;
		  this.name = name;
		  this.user = user;
		  this.group = group;
		  
	  }
  }
  
	public class User {
	 public String name;
	 public ArrayList<Task> taskList = new ArrayList<Task>();
	 public ArrayList<Group> groupList = new ArrayList<Group>();
	 
	 public User(String name) {
		 this.name = name;
	 }
	  
  }
  
  public class Group {
	public String name;
	  
	public Group(String name) {
		this.name = name;
	}
  }
  
  public class Workflow {
	  public String name;
	  public ArrayList<Task> taskList = new ArrayList<Task>();
	  public ArrayList<Instance> instanceList = new ArrayList<Instance>(); 
	
		 public Workflow(String name) {
			 this.name = name;
		 }
  }
  
  public class Instance {
	  public Workflow workflow;
	  public LogTrace logtrace;
  }
  
  public class Timestamp {} 
  
  public class LogTrace {
	  public ArrayList<Instance> instanceList = new ArrayList<Instance>(); 
  }
}
