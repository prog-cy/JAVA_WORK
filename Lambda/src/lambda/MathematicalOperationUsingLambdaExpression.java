package lambda;


//Functional interface
interface MatheMaticalOperation{
	
	//abstract method
	int operation(int num1, int num2);
}

//Main class
public class MathematicalOperationUsingLambdaExpression {
	
	static int n1, n2;
	
	public static void main(String[] args) {
		
		java.util.Scanner scan = new java.util.Scanner(System.in);
		
		System.out.println("Enter first number: ");
		n1 = scan.nextInt();
		
		System.out.println("Enter second number: ");
		n2 = scan.nextInt();
		
		scan.close();
		
		//Lambda expression for addition
		MatheMaticalOperation addition = (n1, n2)->n1+n2;
		System.out.println("Addition of "+n1+" and "+n2+" is "+addition.operation(n1, n2));
		
		//Lambda expression for subtraction
		MatheMaticalOperation subtract = (n1, n2)->n1-n2;
		System.out.println("Subtracting "+n2+" from "+n1+" result is: "+subtract.operation(n1, n2));
		
		//Lambda expression for multiplication
		MatheMaticalOperation product = (n1, n2)-> n1 * n2;
		System.out.println("Multiplication of "+n1+" and "+n2+" is: "+product.operation(n1, n2));
		
		//Lambda expression for remainder
		MatheMaticalOperation remainder = (n1, n2)-> n1 % n2;
		System.out.println(n2+" divides "+n1+" produces remainder: "+remainder.operation(n1, n2));
		
		//Lambda expression for calculating quotient
		MatheMaticalOperation quotient = (n1, n2)-> n1 / n2;
		System.out.println(n2+" divides "+n1+" gives quotient: "+quotient.operation(n1, n2));
	}

}
