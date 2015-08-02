package iicmchecker.storage.container.rules;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.logging.Logger;

import iicmchecker.logging.LoggerFactory;
import iicmchecker.storage.container.Rule;

public class RuleContainer {
	
	private static String outputFile;

	private ArrayList<PanicRule> panic = new ArrayList<PanicRule>();
	private ArrayList<UserCannotDoRule> userCannotDo = new ArrayList<UserCannotDoRule>();
	private ArrayList<UserMustDoRule> userMustDo = new ArrayList<UserMustDoRule>();
	private ArrayList<RoleCannotDoRule> roleCannotDo = new ArrayList<RoleCannotDoRule>();
	private ArrayList<RoleMustDoRule> roleMustDo = new ArrayList<RoleMustDoRule>();
	
	Logger logger = LoggerFactory.getLogger();
	
	public void setOutputFile(String file) {
		outputFile = file;
	}

	public void addPanicRule(PanicRule r) {
		panic.add(r);
	}
	
	public void addUserCannotDoRule(UserCannotDoRule r) {
		userCannotDo.add(r);
	}
	
	public void addUserMustDoRule(UserMustDoRule r) {
		userMustDo.add(r);
	}
	
	public void addRoleCannotDoRule(RoleCannotDoRule r) {
		roleCannotDo.add(r);
	}
	
	public void addRoleMustDoRule(RoleMustDoRule r) {
		roleMustDo.add(r);
	}
	
	public void printToFile() {
		
		Writer writer;
		try {
			writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(outputFile), "utf-8"));

			writer.write("% Rules\n"); 

			for(Rule r : panic) {
				writer.write(r.getAsString());
			}
			
			for(Rule r : userCannotDo) {
				writer.write(r.getAsString());
			}
			
			for(Rule r : userMustDo) {
				writer.write(r.getAsString());
			}
			
			for(Rule r : roleCannotDo) {
				writer.write(r.getAsString());
			}
			
			for(Rule r : roleMustDo) {
				writer.write(r.getAsString());
			}
		
			writer.close();

			logger.severe("Rules are written to " + outputFile);
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
