package lambda;

//Generic Functional interface
interface SomeFunc<T>{
	
	//generic abstract method
	T func(T t);
}

//Main class
public class GenericFunctionalInterface {
	
	
	public static void main(String[] args) {
		
		//Making abstract method implementation with String 
		SomeFunc<String> reverse = (str) -> {
			
			return new StringBuffer(str).reverse().toString();
		};
		
		System.out.println("Lambda reversed is "+reverse.func("Lambda"));
		System.out.println("Expression reversed is "+reverse.func("Expression"));
		
		//Now, use an Integer-based version of SomeFunc.
		SomeFunc<Integer> factorial = (n)->{
			
			if(n == 0 || n == 1)
				return 1;
			
			int fact = 1;
			for(int i = 1; i<=n; i++)
				fact *= i;
			
			return fact;
				
		};
		
		System.out.println("The factorial of 3 is: "+factorial.func(3));
		System.out.println("The factorial of 4 is: "+factorial.func(4));
	}
}
