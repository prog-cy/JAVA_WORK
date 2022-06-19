package advlambda;

//Functional interface
interface StringFunc{
	
	//abstract method
	String func(String s);
}

public class LambdasAsArguments {
	
	//Method in which lambda expression passed as argument
	static String opString(StringFunc lambda, String s) {
		
		return lambda.func(s);
	}
	
	//main method
	public static void main(String[] args) {
		
		String myString = "Hello How are you.";
		
		//String reversed
		String reverse = opString((str)->new StringBuffer(str).reverse().toString(),myString);
		System.out.println("Reversed String is: "+reverse);
		
		//String to UpperCase
		String upperCase = opString((str)->str.toUpperCase(), myString);
		System.out.println("The String in uppercase: "+upperCase);
		
		//Lambda expression for removing spaces from a string.
		StringFunc rmSpaces = (str)->{
			
			String modifiedString = "";
			
			for(int i = 0; i<str.length(); i++) {
				
				if(str.charAt(i) != ' ')
					modifiedString += str.charAt(i);
			}
			return modifiedString;
		};
		
		String spaceRemoved = opString(rmSpaces, myString);
		System.out.println("The string has no space: "+spaceRemoved);
		
	}
}
