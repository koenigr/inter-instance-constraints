package storage.container;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.io.Writer;
import java.util.ArrayList;

public class ExternAndSpecificationContainer {

	private static ArrayList<CriticalTaskPair> criticalTaskPair = new ArrayList<CriticalTaskPair>();
	

	
	public void addCriticalTaskPair(CriticalTaskPair s) {
		criticalTaskPair.add(s);
	}
	
	public boolean containsCriticalTaskPair(CriticalTaskPair s) {
		return criticalTaskPair.contains(s);
	}
	
	
	public void printToFile() {
		try {
			
			Writer writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("prologfiles/externSpec.pl"), "utf-8"));
			writer.write("% Critical Task Pair facts\n"); 

			for (CriticalTaskPair e : criticalTaskPair) {
				writer.write(e.toString());
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
