package jpac;

import java.util.Arrays;

public class StringDemo {

	public static void main(String[] args) {
		
		//String is an array of characters
		
		char [] ch = {'A', 'P', 'P', 'L', 'E'}; //Creating an Array of characters
		
		System.out.println(ch); // printing array of characters as a String
		
		//In java programming language we have a String class we can use it to create a string of character array
		String str = new String(ch);
		
		System.out.println(str);
		
		//Defining a String literals
		String word = " Rupesh ";
		String s1 = "This is demo string";
		int start = 8;
		int end = 13;
		char buf[] = new char[end - start];
		System.out.println("Name:" +word);
		
		System.out.println("======== String Methods ================");
		System.out.println("word.length(): "+word.length());
		System.out.println("word.contains(\"Ru\"): "+word.contains("Ru"));
		System.out.println("word.isEmpty: "+word.isEmpty());
		System.out.println("word.toUpperCase(): "+word.toUpperCase());
		System.out.println("word.toLowerCase(): "+word.toLowerCase());
		System.out.println("word.startsWith(\"R\"): "+word.startsWith("R"));
		System.out.println("word.endsWith(\"h\"): "+word.endsWith("h"));
		System.out.println("word.replace(\"Rup\", \"Sarv\"): "+word.replace("Rup", "Sarv"));
		System.out.println("word.trim(): "+word.trim());
		System.out.println("word.strip(): "+word.strip());
		System.out.println("word.substring(0, 2): "+word.substring(0, 2));
		System.out.println("Arrays.toString(word.getBytes()): "+Arrays.toString(word.getBytes()));
		System.out.println("Arrays.toSring(word.toCharArray()): "+Arrays.toString(word.toCharArray()));
		System.out.println("word.charAt(2): "+word.charAt(2));
		System.out.println("Arrays.toString(word.split(\"p\")): "+Arrays.toString(word.split("p")));
		s1.getChars(start, end, buf, 0); // This method is used to get character from a given string
		System.out.println(buf);
		
		
		System.out.println();
		
		System.out.println("==========String comparison============");
		System.out.println();
		
		String s = " Rupesh "; //This is string literals , memory is consumed from string pool
		System.out.println("word == s: "+ (word == s)); //true word and s referring  same string 
		
		String s2 = new String(" Rupesh "); // This is string object, a new object created in heap 
		
		System.out.println("s == s2: "+(s == s2)); //false s and s2 is not referring same string
		
		System.out.println("s.equals(s2): "+s.equals(s2));
		System.out.println("s.equalswith(\"rupesh\"): "+s.equalsIgnoreCase(" rupesh "));
		

	}

}
