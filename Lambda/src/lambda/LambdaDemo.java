package lambda;

// functional Interface to implement lambda
// functional interface is a special interface 
// it has only one abstract method.

interface FuncInterface{
	
	//abstract method
	void show();
}


public class LambdaDemo {
	
	public static void main(String[] args) {
		
		FuncInterface obj = ()->System.out.println("This is lambda expression.");
		
		obj.show();
	}
	
}
