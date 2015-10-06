package iicmchecker.constraintReader;


import iicmchecker.utils.logging.LoggerFactory;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.logging.Logger;



/**
 * @author koenigr
 *
 */
public class ParserHelper {	
	
	Logger logger = LoggerFactory.getLogger();
	
	HashMap<String, Clause> definedClauses = new HashMap<String, Clause>();
	
	class Clause {
		String name;
		ArrayList<String> argTypes = new ArrayList<String>();
		
		public Clause(String name) {
			this.name = name;
		}
		
		public void addArgType(String Type) {
			argTypes.add(Type);
		}
		
		public int getNumberOfArgs() {
			return argTypes.size();
		}
	}
	
	public void addClause(String name) {
		
		logger.info("Defining new clause " + name);
		
		if (!definedClauses.containsKey(name)) {
			definedClauses.put(name, new Clause(name));
		} else {
			logger.severe("You are trying to overrwrite previously defined clause."
					+ "Are you sure?");
		}
	}
	
	public void existsClause(String name, int numOfArgs) {
		if (!definedClauses.containsKey(name)) {
			logger.warning("Unknown clause " + name);
			System.exit(0);
		}

		System.out.println(numOfArgs + " " + getNumberOfArgs(name));
		if (numOfArgs != getNumberOfArgs(name)) {
			System.out.println(numOfArgs + " " + getNumberOfArgs(name));
			logger.warning("Invalid number of arguments in defined clause " + name);
			System.exit(0);
		}
	}
	
	public void addArgTypeToClause(String name, String arg) {
		logger.info("Adding argument type " + arg + " to clause " + name);
		if (definedClauses.containsKey(name)) {
			definedClauses.get(name).addArgType(arg);
		} else {
			logger.warning("Shit happened in ParserHelper");
			System.exit(0);
		}
	}
	
	public int getNumberOfArgs(String name) {
		return definedClauses.get(name).getNumberOfArgs();
	}
	
	/**
	 * @param sdate
	 */
	public void checkDateTime(String sdate) { 
		
		logger.info("checking datetime " + sdate);
		
		
		String[] tmpArr = sdate.split("[T]"); 
		if (tmpArr[0] != null) { // date
			checkDate(tmpArr[0]);
		} 
		if (tmpArr[1] != null) { // time
			checkTime(tmpArr[1]);
		}

	}

	/**
	 * @param date
	 */
	public void checkDate(String date) {
		
		logger.info("checking date " + date);
		
		
		String[] tmpArr = date.split("-");
		int length = tmpArr.length;
		if (length > 0) { // year
			if (Integer.parseInt(tmpArr[0])< 1970) {
				System.out.println("Year must be higher than 1970");
				// TODO bessere Fehlermeldung mit Quelle angeben
				System.exit(0);
			}
		} 
		if (length > 1) { // month
			if (Integer.parseInt(tmpArr[1]) < 1 || Integer.parseInt(tmpArr[1])>12) {
				System.out.println("Month must be a value between 1 and 12");
				// TODO bessere Fehlermeldung mit Quelle angeben
				System.exit(0);
			}
		}
		if (length > 2) { // day
			// TODO nach Monaten unterscheiden?
			if (Integer.parseInt(tmpArr[2]) < 1 || Integer.parseInt(tmpArr[2])>31) {
				System.out.println("Day must be a value between 1 and 31");
				System.exit(0);
			}
		}
	}
	
	/**
	 * @param time
	 */
	public void checkTime(String time) {
		
		logger.info("checking time " + time);
		time = time.substring(1, time.length());
		String[] tmpArr = time.split(":");
		int length = tmpArr.length;
		
		if (length > 0) { // hour
			if (Integer.parseInt(tmpArr[0]) < 0 || Integer.parseInt(tmpArr[0])>23) {
				System.out.println("Hour must be a value between 3 and 23");
				System.exit(0);
			}
		}
		if (length > 1) { // minute
			if (Integer.parseInt(tmpArr[1]) < 0 || Integer.parseInt(tmpArr[1])> 59) {
				System.out.println("Minute must be a value between 0 and 59");
				System.exit(0);
			}
		}
		if (length > 2) { // second
			int sec = Integer.parseInt(tmpArr[2].split("\\.")[0]);
			if (sec < 0 || sec > 59) {
				System.out.println("Second must be a value between 0 and 59");
				System.exit(0);
			}
		}
	}
	
	/**
	 * @param interval
	 */
	public void checkTimeInterval(String interval) {
		
		logger.info("Checking timeinterval " + interval);
		
		/* TODO not neccessary to check since every value is allowed
		if (interval.length() <= 1) {
			System.out.println("Mad input for timeinterval");
			System.exit(0);
		}
		
		String tmp = interval.split("P")[0];
		
		if (tmp.contains("Y")) {
			String year = tmp.split("Y")[0];
			// TODO Check Years ??
			tmp = tmp.split("Y")[1];
		}
		
		if (tmp.contains("M")) {
			String month = tmp.split("M")[0];
			if (Integer.parseInt(month) < 1 || Integer.parseInt(month) > 12) {
				System.out.println("Month must be a value between 1 and 12");
			}
			tmp = tmp.split("M")[1];
		}
		
		if (tmp.contains("D")) {
			String day = tmp.split("D")[0];
			if (Integer.parseInt(day) < 1 || Integer.parseInt(day) > 31) {
				System.out.println("Day must be a value between 1 and 31");
			}
			tmp = tmp.split("D")[1];
		}
		
		if (tmp.contains("h")) {
			String year = tmp.split("h")[0];
			// TODO Check Hours ??
			tmp = tmp.split("h ")[1];
		}
		
		if (tmp.contains("m")) {
			String year = tmp.split("m")[0];
			// TODO Check Years ??
			tmp = tmp.split("m")[1];
		}
		
		if (tmp.contains("s")) {
			String year = tmp.split("s")[0];
			// TODO Check Years ??
			tmp = tmp.split("s")[1];
		}
		*/
		
	}
}
