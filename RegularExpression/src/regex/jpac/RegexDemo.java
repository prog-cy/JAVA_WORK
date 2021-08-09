package regex.jpac;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

/**
 * Regular expression in short (regex) is an API for defining string patterns
 * for searching, manipulating and editing a string in java
 * 
 * In java there is no built-in class for regex but we can import (java.util.regex.*) package to accomplish our task
 * 
 * there are two main classes 
 * 
 * 1 Pattern
 * 2 Matcher
 * @author rupes
 *
 */

public class RegexDemo {

	public static void main(String[] args) {
		
		/*
		 * In pattern class we have compile method in which we pass a pattern for matching
		 */
		
		// Method-1
		
		Pattern p = Pattern.compile(".at"); //(.) represents any char
		Matcher m = p.matcher("cat");
		boolean b = m.matches();
		
		System.out.println("pattern found: "+b);
		
		//Method-2
		
		boolean b1 = p.matcher("bat").matches();
		System.out.println("pattern found: "+b1);
		
		//Method-3
		boolean b2 = Pattern.matches("..ot", "soot");
		System.out.println("Pattern found: "+b2);
		
		System.out.println("Pattern not found: "+Pattern.matches("..g", "cat"));
		
		Matcher m1 = Pattern.compile("..t").matcher("catissittingonmat");
		
		while(m1.find()) {
			System.out.println(m1.group());
			System.out.println(m1.start()+" to "+(m1.end()-1));
			
		}
		
		
	}

}
