package iicmchecker.constraintReader;

import java.util.Date;

import iicmchecker.utils.exceptions.UnexpectedNumberOfChildrenException;


public class ListenerHelper {
	
	private static int variable_for_vars = 0;
	private static int variable_for_ruleIDs = 0;

	public void checkChildCount(int expected, int actual) {
		if (expected != actual) {

			new UnexpectedNumberOfChildrenException(actual, expected);
		}
		
	}
	
	public static String generateStringForVar() {
		variable_for_vars++;
		return "GENERATED" + String.valueOf(variable_for_vars);
	}
	
	public static String generateRuleID() {
		variable_for_ruleIDs++;
		return "'RULEID" + String.valueOf(variable_for_ruleIDs) + "'";
	}

	public int parseAndAddValue(int returnvalue, String text) {
		String[] value = new String[2];
		value[0] = text.substring(0, text.length() - 1);
		value[1] = text.substring(text.length() - 1, text.length());
		System.out.println(value[0] + " " + value[1]);
	
		if (value[1].equals("Y")) {
			
		} else if (value[1].equals("M")) {
			
		} else if (value[1].equals("D")) {
			
		} else if (value[1].equals("h")) {
			
		} else if (value[1].equals("m")) {
			
		} else if (value[1].equals("s")) {
			
		}
		
		returnvalue = 5;
		return returnvalue;
	}

	public long parseDate(String text) {
		String[] date = text.split("-");
		Date d = new Date();
		d.setTime(0); // TODO Was muss man hier angeben?
		int length = date.length;
		if (length == 1) {
			d.setYear(Integer.parseInt(date[0]) - 1900);
			d.setMonth(0);
			d.setDate(1);
		} else if (length == 2) {
			d.setYear(Integer.parseInt(date[0]) - 1900);
			d.setMonth(Integer.parseInt(date[1])-1);
			d.setDate(1);
		} else if (length == 3) {
			d.setYear(Integer.parseInt(date[0]) - 1900);
			d.setMonth(Integer.parseInt(date[1])-1);
			d.setDate(Integer.parseInt(date[2]));
		} else {
			System.out.println("Error ind ParseDate");
		}
		System.out.println("Date in lh: " + d.toString());
		return d.getTime();
	}

	public long parseTime(String text) {
		String[] time = text.split(":");
		Date d = new Date();
		d.setYear(70);
		d.setMonth(0);
		d.setDate(1);
		d.setTime(0);
		
		
		int length = time.length;
		
		if (length == 1) {
			d.setHours(Integer.parseInt(time[0]));
		} else if (length == 2) {
			d.setHours(Integer.parseInt(time[0]));
			d.setMinutes(Integer.parseInt(time[1]));
		} else if (length == 3) {
			System.out.println(time[2].length());
			System.out.println(time[2]);
			System.out.println(time[2].split("\\.").length);
			String[] ms = time[2].split("\\.");
			d.setHours(Integer.parseInt(time[0]));
			d.setMinutes(Integer.parseInt(time[1]));
			d.setSeconds(Integer.parseInt(ms[0]));
			if (ms.length == 2) {
				d.setTime(d.getTime() + Integer.parseInt(ms[1]));
				
			}
		} else {
			System.out.println("Error in parseTime");
		}
		
		System.out.println("parse Time " + d.toString());
		
		return d.getTime();
	}

	public long parseDateTime(String text) {
		String[] datetime = text.split("T");
		Date d = new Date();
		d.setTime(0);
		
		long date = parseDate(datetime[0]);
		long time = parseTime(datetime[1]);
		
		d.setTime(date + time);
		
		System.out.println("parse DateTime " + d.toString());
		return d.getTime();
	}
}
