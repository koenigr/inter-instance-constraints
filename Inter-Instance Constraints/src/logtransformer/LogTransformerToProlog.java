package logtransformer;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.io.Writer;
import java.util.List;

import storage.container.ExecutedStatus;
import storage.container.StatusContainer;
import storage.ontology.Ontology;
import storage.ontology.Ontology.Group;
import storage.ontology.Ontology.Instance;
import storage.ontology.Ontology.Task;
import storage.ontology.Ontology.Timestamp;
import storage.ontology.Ontology.User;
import storage.ontology.Ontology.Workflow;
import de.uni.freiburg.iig.telematik.jawl.log.LogEntry;
import de.uni.freiburg.iig.telematik.jawl.log.LogTrace;

public class LogTransformerToProlog {
	
	public void transform(List<List<LogTrace<LogEntry>>> logs) {
		String users = "";
		String roles = "";
		
		try (Writer writer = new BufferedWriter(new OutputStreamWriter(
	        new FileOutputStream("prologfiles/status.pl"), "utf-8"))) {
			writer.write("% status facts\n"); 
			
			for (List<LogTrace<LogEntry>> el : logs) {
				for (LogTrace<LogEntry> trace : el) {
					List<LogEntry> entryList = trace.getEntries();
					for (LogEntry entry : entryList) {
						// TODO ErrorHandling if the User is null
						
						users = users.concat("executed_u( " + entry.getOriginator() + " , " + entry.getActivity() + ").\n");
						roles = roles.concat("executed_r( " + entry.getGroup() + " , " + entry.getActivity() + ").\n");
					}	
				}
			}
			
			writer.write(users);
			writer.write(roles);
			
			writer.close();
			
			
			
			
			
			
	} catch (UnsupportedEncodingException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
}
