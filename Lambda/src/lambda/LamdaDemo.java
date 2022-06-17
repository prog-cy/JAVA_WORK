package lambda;

// Functional interface: Functional interface is a special interface which only 
//contains one abstract method.

// Lambda Expression: A lambda expression is an anonymous method which provides implementation of the functional
// interface's  abstract method.
interface FuncInterface{
	
	//abstract method
	void show();
}

//Main class
public class LamdaDemo {
	
	public static void main(String[] args) {
		
		FuncInterface fobj = ()->System.out.println("I am learning Lambda Expression.");
		
		fobj.show(); // Calling abstract method
	}
}
