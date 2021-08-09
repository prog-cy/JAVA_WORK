package regex.jpac;

import java.util.Scanner;
import java.util.regex.Pattern;

public class EmailChecker {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter a email address: ");
		
		String emailAddress = in.nextLine();
		
		in.close();
		
		emailAddress = emailAddress.trim();
		
		
		boolean valid = Pattern.matches("[a-zA-z0-9]+@gmail.com", emailAddress);
		
		boolean valid1 = Pattern.matches("[a-zA-Z_.]+@[a-zA-Z]+.edu.in", emailAddress);
		
		if(valid || valid1)
			System.out.println(emailAddress+" is valid email id");
		else
			System.out.println(emailAddress+" is not valid email id");
		

	}

}
