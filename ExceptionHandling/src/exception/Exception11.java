package exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception11 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		try {
			
			System.out.println("Enter a whole number: ");
			int x = scan.nextInt();
			
			System.out.println("Enter a whole number divide by: ");
			int y = scan.nextInt();
			
			int z = x/y;
			System.out.println("Result: "+z);
		}
		catch(ArithmeticException e) {
			System.out.println("Can't divide by zero.");
		}
		catch(InputMismatchException e) {
			System.out.println("Input is invalid.");
		}
		finally {
			
			System.out.println("Two exception has been handled by this program");
			scan.close();
		}
		

	}

}
