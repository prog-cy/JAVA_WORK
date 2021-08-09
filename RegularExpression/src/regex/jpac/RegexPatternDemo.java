package regex.jpac;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class RegexPatternDemo {

	public static void main(String[] args) {
		/**
		 * Brackets are used to find a range of characters:
		 * 
		 *  [abc]  Find one character from the options between the brackets
		 *  [^abc]	Find one character NOT between the brackets
		 *	[0-9]	Find one character from the range 0 to 9
		 */
		
		Pattern p = Pattern.compile("[abc]");
		Matcher m = p.matcher("a");
		boolean b = m.matches();
		
		System.out.println("Pattern matches: "+b);
		
		System.out.println("Pattern matches: "+Pattern.matches("[^abc]", "d"));
		System.out.println("Pattern matches: "+Pattern.matches("[0-9]", "6"));
		
		/**
		 *  Metacharacters
		 *  
		 *   |	Find a match for any one of the patterns separated by | as in: cat|dog|fish
		 *   
		 *   .	Find just one instance of any character
		 *   ^	Finds a match as the beginning of a string as in: ^Hello
		 *   $	Finds a match at the end of the string as in: World$
		 *   \d	Find a digit
		 *   \s	Find a whitespace character
		 *   \b	Find a match at the beginning of a word like this: \bWORD, or at the end of a word like this: WORD\b
		 *   \\uxxxx	Find the Unicode character specified by the hexadecimal number xxxx
		 */
		
		System.out.println("Pattern matches: "+Pattern.matches("cat|dog|fish", "fish"));
		System.out.println("Patten matches: "+Pattern.matches(".le", "tle"));
		System.out.println("Pattern matches: "+Pattern.matches("^Hello[0-9][a-z][\s]World", "Hello1m World"));
		System.out.println("Pattern  found: "+Pattern.matches("[HELLO]World$", "HWorld"));
		
		
		/**
		 *  Quantifiers
		 *  
		 *   n+	Matches any string that contains at least one n
		 *   n*	Matches any string that contains zero or more occurrences of n
		 *   n?	Matches any string that contains zero or one occurrences of n
		 *   n{x}	Matches any string that contains a sequence of X n's
		 *   n{x,y}	Matches any string that contains a sequence of X to Y n's
		 *   n{x,}	Matches any string that contains a sequence of at least X n's
		 */
		
		System.out.println("Pattern matches: "+Pattern.matches("[a-z]+", "sgjadghfyfgyqegjhgdgfyag"));
		System.out.println("Pattern matches: "+Pattern.matches("[a-zA-Z\s]+", "My name is Rupesh"));
		System.out.println("Pattern matches: "+Pattern.matches("go*gle", "google"));
		System.out.println("Pattern matches: "+Pattern.matches("g?o*gle", "google"));
		
	}

}
