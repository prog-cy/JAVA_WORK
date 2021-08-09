package jpac;

public class StringSearch {

	public static void main(String[] args) {
		
		//To find first index of a character we use method indexOf(char c)
		String stringLiteral = "This is string i am working on the string to get insight from the string.";
		System.out.println("Index of \"t\": "+stringLiteral.indexOf('t'));
		
		//To find first index of a character from a given point we use method indexOf(char c, int startIndex)
		System.out.println("Index of \"t\": "+stringLiteral.indexOf('t', 10));
		
		//To find last index of character in given string we use lastIndexOf(char c)
		System.out.println("Last Index of \"t\": "+stringLiteral.lastIndexOf('t'));
		
		//To find last index of character from a given point we use method lastIndexOf(char c, int startIndex)
		System.out.println("Las Index of \"t\": "+stringLiteral.lastIndexOf('t', 40));
		
		//To find first occurrence of a given string
		System.out.println("Index of \"the\": "+stringLiteral.indexOf("the"));
		
		//To find last index of a given string
		System.out.println("Last Index of \"the\": "+stringLiteral.lastIndexOf("the"));
		
		//To find substring from a given string
		System.out.println(stringLiteral.substring(0, 70));
	}

}
