package jpac;

//In this class we will be discussing about operator in java
/**
 * There are mainly six group:
 * 1. Arithmetic
 * 2. Bitwise
 * 3. Relational
 * 4. Logical
 * 5. Assignment
 * 6. Ternary
 * @author rupes
 *
 */

public class Operator {

	public static void main(String[] args) {
		
		//Arithmetic Operator
		/*
		 * There are two group:
		 * 1. Unary Arithmetic Operator
		 * 			+, -, ++, --
		 * 2. Binary Arithmetic Operator
		 * 			+, -, *, %, /
		 */
		
		//Unary Arithmetic Operator
		System.out.println("Unary Operator");
		int a = +2; // default sign is unary '+'
		
		int b = -3; // unary '-'
		
		System.out.println(a+" "+b);
		
		int c = 9;
		int x = c++ ;// post increment
		System.out.println("x = "+x); //x = 9
		System.out.println("c = "+c); // c = 10
		
		int y = ++c; // pre increment
		System.out.println("y = "+y);// y = 11;
		System.out.println("c= "+c);// c = 11
		
		int x1 = c--; //post decrement
		System.out.println("x1= "+x1);// x1 = 11
		System.out.println("c = "+c);// c = 10;
		
		int y1 = --c; // pre decrement
		System.out.println("y1= "+y1); // y1 = 9
		System.out.println("c = "+c); // c = 9
		
		//Binary Arithmetic Operator
		System.out.println("\nBinary Arithmetic Operator");
		
		int s = x + y;
		System.out.println("Sum is: "+s);
		
		int sub = x1-x;
		System.out.println("Subtraction is: "+sub);
		
		int pro = x1 * c;
		System.out.println("Multiplication is: "+pro);
		
		double div = x1/y;
		System.out.println("Division is: "+div);
		
		int mod = y % 3;
		System.out.println("y mod 3: "+mod);
		// In java modulus operator can be used for floating operand it is not case with c, c++
		
		double floatmod = 20.25 % 2.5;
		System.out.println("20.25 mod 2.5: "+floatmod);
		
		// Bitwise Operator
		/*
		 * 	Bitwise AND(&)
		 * 	Bitwise OR(|)
		 *  Bitwise XOR(^)
		 *  Bitwise NOT(~)
		 *  Right shift(>>)
		 *  Left shift(<<)
		 *  Shift right (>>>) zero fill
		 */
		
		System.out.println("\nBitwise Operator");
		int and = x & y;
		/*
		 *  9 = 1 0 0 1
		 *      & & & &
		 * 11 = 1 0 1 1
		 * -------------
		 * 		1 0 0 1 = 9
		 */
		System.out.println("x & y: "+and);
		
		int or = x | y;
		/*
		 *  9 = 1 0 0 1
		 *      | | | |
		 * 11 = 1 0 1 1
		 * -------------
		 * 		1 0 1 1 = 11
		 */
		
		System.out.println("x | y: "+or);
		
		int xor = x ^ y;
		/*
		 *  9 = 1 0 0 1
		 *      ^ ^ ^ ^
		 * 11 = 1 0 1 1
		 * --------------
		 * 		0 0 1 0 = 2
		 */
		
		System.out.println("x ^ y: "+xor);
		
		int bnot = ~x;
		/*
		 *  x = 9
		 *  9 = 1 0 0 1
		 *  ~9 = 0 1 1 0 = -10
		 *  
		 *  1 0 0 1 = 9
		 *      + 1
		 *  -------
		 *  1 0 1 0 = 10 (1's complement of 9)
		 *  
		 *  10 = 1 0 1 0
		 *  	 
		 *  	 0 1 0 1
		 *  		 + 1
		 *  ------------
		 *       0 1 1 0 = -10 
		 *        
		 */
		System.out.println("x: "+x);
		System.out.println("~x: "+bnot);
		System.out.println("~100: "+(~100));
		
		int rshift = x1>>2; 
		/*
		 *  x1 = 11
		 *  11/(2^2) = x1>>2
		 */
		System.out.println("x1: "+Integer.toBinaryString(x1)+" = "+x1);
		System.out.println("x1>>2: "+Integer.toBinaryString(rshift)+" = "+rshift);
		
		int lshift = x1<<2;
		/*
		 *  x1 = 11
		 *  
		 *  11*(2^2) = 44
		 */
		
		System.out.println("x1: "+Integer.toBinaryString(x1)+" = "+x1);
		System.out.println("x1<<2: "+Integer.toBinaryString(lshift)+" = "+lshift);
		
		int rshiftzerofill = -1>>>25;
		System.out.println("-1: "+Integer.toBinaryString(-1));
		System.out.println("-1>>>25: "+Integer.toBinaryString(rshiftzerofill)+"  = "+rshiftzerofill);
		
		//Relational Operator
		/*
		 *  ==
		 *  !=
		 *  <=
		 *  >=
		 *  <
		 *  >
		 *  The result of Relational Operator is always is boolean value it may be true or false
		 */
		
		System.out.println("\nRelational Operator");
		
//		System.out.println("2 == 2: "+(2 == 2)); 
//		System.out.println("2 != 2: "+(2 != 2));
		System.out.println("2 <= 3: "+(2 <= 3));
		System.out.println("2 >= 3: "+(2 >= 3));
		System.out.println("2 < 3: "+(2 < 3));
		System.out.println("3 > 2: "+(3 > 2));
		
		// Logical Operator
		/*
		 *  Logical AND(&)
		 *  Logical OR(|)
		 *  Logical NOT(!)
		 *  Short - Circuit AND(&&)
		 *  Short - Circuit OR(||)
		 *  Logical XOR(^)
		 */
		
		System.out.println("\nLogical Operator");
		
//		int e = 10;
		
//		System.out.println((2 == 2) & (e++ <= 10)); // Logical AND(&) always checks the both condition
//		System.out.println("e = "+e); //e = 11
//		
//		System.out.println((2 != 2) && (e++ <= 10)); // if condition1 is false then (&&) operator does not check second 
//		System.out.println("e = "+e); //e =11
//		
//		System.out.println((2 == 2) | (e-- <= 10)); //Logical OR(|) checks the both condition
//		System.out.println("e = "+e); //e = 10
//		
//		System.out.println((2 == 2) || (e-- <= 10)); // if condition is true then (||) operatoe does not check second
//		System.out.println("e = "+e); //e = 10
		
		System.out.println("!true: "+ (!true));
		System.out.println("true ^ false: "+ (true ^ false));
		
		
		// Assignment Operator
		/*
		 *  +=, -=, *=, /=, %=, &=, |=, !=, =, ^=
		 */
		
		//Ternary Operator
		/*
		 *  condition ? statement1 : statement2
		 *  
		 *     if condition is true result is statement1 if false statement2
		 */
		System.out.println("\nTernary Operator");
		
//		int e1 = (2 == 2) ? 2 : 3;
//		System.out.println("e1 = "+e1);
		
		
		
		
		
	}

}
