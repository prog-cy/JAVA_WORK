package rand.gen;

import java.util.Random;

public class RandomNumberCharacter {

	public static void main(String[] args) {
		
		Random rand = new Random();
		
		System.out.println(rand.nextInt(5)); // this line generates random Integer number between 0 to 4
		System.out.println(rand.nextInt(5)+1);// this line generates random Integer number between 1 to 5
		
		System.out.println(rand.nextBoolean()); // this line generates random boolean 
		
		System.out.println(rand.nextDouble()); // this line generates random floating number between 0.0 to 1.0
		
		System.out.println("\n\nRandom character between A-Z");
		for(int i = 0; i<26; i++) {
			char ch = (char)(rand.nextInt(26)+65); // this line generate random character between A-Z
			
			System.out.print(ch+" "); // In this line we are printing characters
		}
		
		System.out.println("\n\nRandom character between a-z");
		
		for(int i = 0; i<26; i++) {
			
			char ch = (char)(rand.nextInt(26)+97);
			System.out.print(ch+" ");
		}
		
		
		
	}

}
