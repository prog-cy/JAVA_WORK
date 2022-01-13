package project3;

import java.util.Random;

//Generating random password which starts with capital letter and followed by digits, small-letter and non-alphanumberic character


public class RandomPasswordGenerator {
	
	public static char[] generator(int len) {
		
		String salphabet = "abcdefghijklmnopqrstuvwxyz";
		String calphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String digits = "0123456789";
		String nalphadigit = "!@#$*";
		
		String values = salphabet + digits + nalphadigit;
		
		int n = values.length();
		
		char[] pass = new char[len];
		
		Random rand = new Random();
		
		pass[0] = calphabet.charAt(rand.nextInt(calphabet.length()));
		
		for(int i = 1; i<len; i++) {
			
			pass[i] = (values.charAt(rand.nextInt(n)));
		}
		
		return pass;
		
	}
	
	public static void main(String[] args) {
		
		int len = 9;
		
		String password = new String(generator(len));
		
		System.out.println("Suggested password is: "+password);
	}

}
