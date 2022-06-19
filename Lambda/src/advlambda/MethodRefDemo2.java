package advlambda;

// This program will show method references to instance methods

interface NumericOperation{
	
	int operation(int n);
}

//This class has factorial() method which compatible with operation() method of NumericOperation
// functional interface.
class PerformOperation{
	
	int factorial(int n) {
		
		if(n == 1 || n == 0)
			return 1;
		
		int fact = 1;
		
		for(int i = 1; i<=n; i++)
			fact *= i;
		
		return fact;
	}
}

///main class
public class MethodRefDemo2 {
	
	public static void main(String[] args) {
		
		PerformOperation obj = new PerformOperation();
		
		NumericOperation lambda = obj::factorial;
		
		System.out.println("Factorial of 10 is "+lambda.operation(10));
	}
}
