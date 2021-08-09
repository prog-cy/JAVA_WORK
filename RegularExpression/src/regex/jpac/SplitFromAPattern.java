package regex.jpac;

import java.util.Scanner;
import java.util.regex.Pattern;

public class SplitFromAPattern {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a string");
		
		String str = sc.nextLine();
		
		sc.close();
		
		Pattern p = Pattern.compile("[0-9\s'_]+");
		
		String[] stringArray = p.split(str);
		
		for(String s : stringArray)
			System.out.print(s+" ");
		

	}

}
