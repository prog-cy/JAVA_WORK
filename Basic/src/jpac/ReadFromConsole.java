package jpac;

import java.util.Scanner;

public class ReadFromConsole {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a word: ");
		String word = sc.nextLine();
		System.out.println("word is: "+word);
		
		System.out.println("Enter a Integer: ");
		int a = sc.nextInt();
		System.out.println("Integer value is: "+a);
		
		System.out.println("Enter second word: ");
		String word2 =sc.next() + sc.nextLine();
		System.out.println("word2: "+word2);
		
		System.out.println("Enter decial values: ");
		double dl = sc.nextDouble();
		System.out.println("dl: "+dl);
		
		System.out.println("Enter third word: ");
		String word3 = sc.next() + sc.nextLine();
		System.out.println("word3: "+word3);
		
		sc.close();

	}

}
