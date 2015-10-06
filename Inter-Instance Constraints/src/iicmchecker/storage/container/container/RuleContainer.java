package iicmchecker.storage.container.container;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.logging.Logger;

import iicmchecker.storage.container.Rule;
import iicmchecker.storage.container.rules.DefinedRule;
import iicmchecker.storage.container.rules.IllegalExecutionRule;
import iicmchecker.storage.container.rules.RoleCannotDoRule;
import iicmchecker.storage.container.rules.RoleMustDoRule;
import iicmchecker.storage.container.rules.UserCannotDoRule;
import iicmchecker.storage.container.rules.UserMustDoRule;
import iicmchecker.utils.logging.LoggerFactory;

public class RuleContainer {
	
	private static String outputFile;

	private ArrayList<IllegalExecutionRule> illegalexec = new ArrayList<IllegalExecutionRule>();
	private ArrayList<UserCannotDoRule> userCannotDo = new ArrayList<UserCannotDoRule>();
	private ArrayList<UserMustDoRule> userMustDo = new ArrayList<UserMustDoRule>();
	private ArrayList<RoleCannotDoRule> roleCannotDo = new ArrayList<RoleCannotDoRule>();
	private ArrayList<RoleMustDoRule> roleMustDo = new ArrayList<RoleMustDoRule>();
	private HashMap<String, ArrayList<Rule>> defined = new HashMap<String, ArrayList<Rule>>();
	
	Logger logger = LoggerFactory.getLogger();
	
	public void setOutputFile(String file) {
		outputFile = file;
	}

	public void addIllegalExecutionRule(IllegalExecutionRule r) {
		illegalexec.add(r);
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
	
	public void addDefined(DefinedRule r) {
		if (!defined.containsKey(r.getName())) {
			defined.put(r.getName(), new ArrayList<Rule>());
		}
		(defined.get(r.getName())).add(r);
	}
	
	public void printToFile() {
		
		Writer writer;
		try {
			writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(outputFile), "utf-8"));

			writer.write("% Rules\n"); 

			for(Rule r : illegalexec) {
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
			
			for (ArrayList<Rule> al: defined.values()) {
				for (Rule r : al) {
					writer.write(r.getAsString());
				}
			}
		
			writer.close();

			logger.severe("Rules are written to " + outputFile);
		
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}
