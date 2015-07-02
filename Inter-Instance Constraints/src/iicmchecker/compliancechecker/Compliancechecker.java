package iicmchecker.compliancechecker;


import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;
import java.util.logging.Logger;

import org.projog.api.Projog;
import org.projog.api.QueryResult;
import org.projog.api.QueryStatement;
import org.projog.core.term.Atom;

import iicmchecker.logging.LoggerFactory;


public class Compliancechecker {
	
	private static Logger logger = LoggerFactory.getLogger();

public String executeCommand(String command) {

	    StringBuffer output = new StringBuffer();

	    Process p;
	    try {
	        p = Runtime.getRuntime().exec(command);
	        p.waitFor();
	        BufferedReader reader = 
	                        new BufferedReader(new InputStreamReader(p.getInputStream()));

	        String line = "";           
	        while ((line = reader.readLine())!= null) {
	            output.append(line + "\n");
	        }

	    } catch (Exception e) {
	        e.printStackTrace();
	    }

	    return output.toString();

}
	
public void run() {

	    System.out.println(executeCommand("ls"));
	    System.out.println(executeCommand("prolog prologfiles/start.pl"));
}
}
