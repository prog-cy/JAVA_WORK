package biginteger;

import java.math.BigInteger;
import java.util.Scanner;

public class BigIntegerDemo2 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter first number: ");
		
		String num1 = scan.nextLine();
		
		System.out.println("Enter second number: ");
		
		String num2 = scan.nextLine();
		
		BigInteger A, B;
		
		A = new BigInteger(num1);
		
		B = new BigInteger(num2);
		
		//Mathematical operations
		
		//Addition
		
		BigInteger sum = A.add(B);
		System.out.println("Sum of "+A+" and "+B+" is: "+sum);
		
		//Subtraction
		
		BigInteger subtract = B.subtract(A);
		System.out.println("Subtraction of "+A+" from "+B+" is: "+subtract);
		
		//Multiplication
		
		BigInteger product = A.multiply(B);
		System.out.println("Multiplication of "+A+" and "+B+" is: "+product);
		
		//Division
		
		BigInteger division = B.divide(A);
		
		System.out.println(B+" divided by "+A+" is: "+division);
		
		//Remainder
		
		BigInteger rem = B.remainder(A);
		
		System.out.println(B+" divided by "+A+" gives remainder: "+rem);
		
		//Power
		
		BigInteger power = A.pow(5);
		System.out.println(A+" exponent "+5+ " is: "+power); 
		
		scan.close();
	}

}
