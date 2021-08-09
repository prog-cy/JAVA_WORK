package jpac;

import java.util.Arrays;

public class JoinAndSplit {

	public static void main(String[] args) {
		
		String stringLiteral = "My name is Rupesh";
		
		String[] stringArray = stringLiteral.split(" "); // splitting string from whitespace
		
		System.out.println(Arrays.toString(stringArray));
		
		String stringLiteral1 = "my name, is rupesh";
		String[] stringArray1 = stringLiteral1.split(",");
		System.out.println(Arrays.toString(stringArray1));
		
		String stringLiteral2 = "Your name is: My name is Ankur.";
		String[] stringArray2 = stringLiteral2.split(":");
		System.out.println(Arrays.toString(stringArray2));
		
		String stringLiteral3 = "Your name is: My name, is Ankur.";
		String[] stringArray3 = stringLiteral3.split("[:,\s]"); //regular expression [:,\\s]
		System.out.println(Arrays.toString(stringArray3));
		
		String stringLiteral4 = "Your name is: My name, is Rupesh1234.";
		
		String[] stringArray4 = stringLiteral4.split("[0-9:,\s]");
		System.out.println(Arrays.toString(stringArray4));
		
		String stringLiteral5 = String.join("\s", "My", "name", "is", "rupesh");
		System.out.println(stringLiteral5);
		

	}

}
