package storage.container.externspec;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.io.Writer;
import java.util.ArrayList;

public class ExternAndSpecificationContainer {
	
	private static String outputFile;

	private static ArrayList<CriticalTaskPair> criticalTaskPair = new ArrayList<CriticalTaskPair>();
	
	private static ArrayList<Dominates> dominates = new ArrayList<Dominates>();
	
	private static ArrayList<GLB> glb = new ArrayList<GLB>();
	
	private static ArrayList<LUB> lub = new ArrayList<LUB>();
	
	private static ArrayList<Partner> partner = new ArrayList<Partner>();
	
	private static ArrayList<Related> related = new ArrayList<Related>();
	
	private static ArrayList<RoleTask> roleTask = new ArrayList<RoleTask>();
	
	private static ArrayList<SameGroup> sameGroup = new ArrayList<SameGroup>();
	
	private static ArrayList<UserRole> userRole = new ArrayList<UserRole>();
	
	private static ArrayList<UserTask> userTask = new ArrayList<UserTask>();
	
	public ExternAndSpecificationContainer(String outputFile) { // TODO Singleton
		this.outputFile = outputFile;
	}
	
	public void addCriticalTaskPair(CriticalTaskPair s) {
		criticalTaskPair.add(s);
	}
	
	public void addDominates(Dominates s) {
		dominates.add(s);
	}
	
	public void addGLB(GLB s) {
		glb.add(s);
	}
	
	public void addLUB(LUB s) {
		lub.add(s);
	}
	
	public void addPartner(Partner s) {
		partner.add(s);
	}
	
	public void addRelated(Related s) {
		related.add(s);
	}
	
	public void addRoleTask(RoleTask s) {
		roleTask.add(s);
	}
	
	public void addSameGroup(SameGroup s) {
		sameGroup.add(s);
	}
	
	public void addUserRole(UserRole s) {
		userRole.add(s);
	}
	
	public void addUserTask(UserTask s) {
		userTask.add(s);
	}
	
	
	
	public void printToFile() {
		try {
			
			Writer writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(outputFile), "utf-8"));
			writer.write("% Critical Task Pair facts\n"); 

			for (CriticalTaskPair e : criticalTaskPair) {
				writer.write(e.getAsString());
			}
			
			writer.write("% dominates facts\n"); 

			for (Dominates e : dominates) {
				writer.write(e.getAsString());
			}
			
			writer.write("% glb facts\n"); 

			for (GLB e : glb) {
				writer.write(e.getAsString());
			}
			
			writer.write("% lub facts\n"); 

			for (LUB e : lub) {
				writer.write(e.getAsString());
			}
			
			writer.write("% partner facts\n"); 

			for (Partner e : partner) {
				writer.write(e.getAsString());
			}
			
			writer.write("% related facts\n"); 

			for (Related e : related) {
				writer.write(e.getAsString());
			}
			
			writer.write("% role task facts\n"); 

			for (RoleTask e : roleTask) {
				writer.write(e.getAsString());
			}
			
			writer.write("% same group facts\n"); 

			for (SameGroup e : sameGroup) {
				writer.write(e.getAsString());
			}
			
			writer.write("% user role facts\n"); 

			for (UserRole e : userRole) {
				writer.write(e.getAsString());
			}
			
			writer.write("% user task facts\n"); 

			for (UserTask e : userTask) {
				writer.write(e.getAsString());
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
