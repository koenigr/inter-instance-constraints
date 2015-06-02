package storage.container.rules;

import java.util.ArrayList;

import storage.container.Rule;

public class RuleContainer {

	private ArrayList<PanicRule> panic = new ArrayList<PanicRule>();
	private ArrayList<UserCannotDoRule> userCannotDo = new ArrayList<UserCannotDoRule>();
	private ArrayList<UserMustDoRule> userMustDo = new ArrayList<UserMustDoRule>();
	private ArrayList<RoleCannotDoRule> roleCannotDo = new ArrayList<RoleCannotDoRule>();
	private ArrayList<RoleMustDoRule> roleMustDo = new ArrayList<RoleMustDoRule>();
	
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
	
	public void addPRoleMustDoRule(RoleMustDoRule r) {
		roleMustDo.add(r);
	}
	
	public void printToFile() {
		for(Rule r : panic) {
			System.out.println(r.getAsString());
		}
	}
	
}
