package jpac;

public class CreateString {

	public static void main(String[] args) {
		/**
		 * String is array of characters.
		 * In java we implement string using String object.
		 * 
		 * For this we use constructor String();
		 */
		
		// To create a empty string we use String() constructor
		System.out.println("Empty String: ");
		String emptyString = new String();
		System.out.println(emptyString);
		
		//To create a string with array of characters we use constructor String(char[] charArray)
		char[] charArray = {'a', 'p', 'p', 'l', 'e'};
		String firstString = new String(charArray);
		System.out.println("String with Array of characters: "+firstString);
		
		//To create a string with few character of array we use constructor String(char[] charArray, int startIndex, int charNum) 
		String stringOfFewChar = new String(charArray, 1, 3);
		System.out.println("String with few array of characters: "+stringOfFewChar);
		
		//creating string using string literal
		/*
		 * String literal object occupies space in string pool which is inside heap
		 */
		String stringLiteral = "This is string literal";
		System.out.println(stringLiteral);
		
		String stringLiteral1 = "This is string literal";
		System.out.println(stringLiteral1);
		
		/*
		 *  stringLiteral and stringLiteral1 refers same string object
		 *  To verify that both refers same object we can compare both string object using == operator
		 */
		
		if(stringLiteral == stringLiteral1)
			System.out.println(true);
		
		//String created by String(String obj) constructor occupies space in heap
		String isNotStringLiteral = new String(stringLiteral);
		
		//stringLiteral and isNotStringLiteral does not refer same object both object refers two different object
		System.out.println(isNotStringLiteral);
		
		//To verify just above comment we use == operator
		if(!(stringLiteral == isNotStringLiteral))
			System.out.println(true);
		

	}

}
