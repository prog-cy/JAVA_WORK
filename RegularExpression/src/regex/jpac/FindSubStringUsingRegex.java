package regex.jpac;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class FindSubStringUsingRegex {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter space string: ");
		
		String str = sc.nextLine();
		
		sc.close();
		
		Pattern p = Pattern.compile("[\s]+");
		
		String[] stringArray = p.split(str);
		
		for(String temp : stringArray) {
			
			Pattern pattern = Pattern.compile("..t");
			Matcher m = pattern.matcher(temp);
			
			while(m.find()) {
				System.out.println(m.group());
				System.out.println(m.start()+" - "+(m.end()-1));
			}
		}
	}

}
