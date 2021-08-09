package regex.jpac;

import java.util.regex.Pattern;

public class ContainsOnlyCharaterChecker {

	public static void main(String[] args) {

		StringBuffer str = new StringBuffer("This is string only contains character");
		
		if(Pattern.matches("[a-zA-Z\s]+", str)) {
			System.out.println("Contains only character");
		}
		
		else
				System.out.println("Not only contains character");
		
		String email = "rupeshdwivedi1999@gmail.com";
		
		if(Pattern.matches("[a-zA-Z\s]+", email))
			System.out.println("Contains only character");
		else
			System.out.println("Not only conatains character");
			
	}

}
