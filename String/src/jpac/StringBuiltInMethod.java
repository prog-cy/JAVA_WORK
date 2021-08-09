package jpac;

import java.util.Arrays;

public class StringBuiltInMethod {
	
	public static void main(String[] args) {
		
		//first method using which we can get length of string is str.length();
		char[] charArray = {'A', 'B', 'C', 'D'};
		
		String stringArray = new String(charArray);
		
		System.out.println("Length of "+stringArray+" = "+stringArray.length());
		
		String stringLiteral = "Rupesh";
		
		String stringLiteral1 = "Dubey";
		
		// using + operator we can concatenate string objects
		System.out.println(stringLiteral+" + "+stringLiteral1+" = "+stringLiteral+stringLiteral1);
		
		//String concatenation with other Data Types
		int age = 21;
		
		String basicIntro = "My name is Rupesh Dubey I am "+age+" years old.";
		System.out.println(basicIntro);
		
		//String conversion
		double dl = 45.67;
		String stringOfDouble = String.valueOf(dl);
		System.out.println(dl+" + "+345+" = "+(dl+345));
		System.out.println(stringOfDouble+" + "+345+" = "+stringOfDouble+345);
		
		/*
		 * for extracting string
		 * we use method charAt(int index)
		 */
		
		System.out.println("In string "+stringLiteral+" char at index 1 is: "+stringLiteral.charAt(1));
		
		// To extract more than one character we use getChar(int sourceStart, int sourceEnd, char[] charA, int charAIndex);
		
		int start = 3;
		int end = 17;
		
		char[] buf = new char[end-start];
		
		basicIntro.getChars(start, end, buf, 0);
		System.out.println(buf);
		
		// To extract byte of characters we use getByte(int sourceStart, int sourceEnd, byte[] byteArray, int byteIndex)
		
		byte[] byteArray = new byte[end-start];
		
		//basicIntro.getBytes(start, end, byteArray, 0);
		
		System.out.println(new String(byteArray));
		
		//To convert a string into a character Array we use method strobj.toCharArray()
		
		char[] chArray = stringLiteral1.toCharArray();
		System.out.println(Arrays.toString(chArray));
		
		//To check equality of two string we use method str1.equals(str2) it return boolean value
		String str1 = "Hello";
		String str2 = "hello";
		String str3 = "hello";
		
		System.out.println("str1: "+str1);
		System.out.println("str2: "+str2);
		System.out.println("str3: "+str3);
		System.out.println("str2.equals(str3): "+str2.equals(str3));
		System.out.println("str1.equals(str2): "+str1.equals(str2));
		System.out.println("str1.equalsIgnoreCase(str2): "+str1.equalsIgnoreCase(str2));
	}
	

}
