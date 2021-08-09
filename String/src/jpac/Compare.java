package jpac;

import java.util.Scanner;

public class Compare {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String[] str = new String[5];
		
		System.out.println("Enter 5 words: ");
		
		for(int i = 0; i<str.length; i++)
			str[i] = sc.next();
		
		System.out.println("\nWords in random order: ");
		for(int i = 0; i<str.length; i++)
			System.out.println(str[i]);
		
		//logic for arranging words 
		for(int i = 0; i<str.length; i++) {
			
			for(int j = i+1; j<str.length; j++) {
				
				if(str[i].compareToIgnoreCase(str[j]) > 0) {
					
					String temp = str[j];
					str[j] = str[i];
					str[i] = temp;
				}
					
				
			}
		}
		
		System.out.println("\nWords in dictionary format: ");
		
		for(int i = 0; i<str.length; i++)
			System.out.println(str[i].toUpperCase());
		
		sc.close();
	}

}
