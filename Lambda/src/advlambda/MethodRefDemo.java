package advlambda;

// Note: Method References to static methods

//Functional interface
interface StringFunction{
	
	//abstract method
	String func(String n);
}

//This class defines a static method called strReverse() which is compatible with
// functional interface abstract method func().
class MyStringOps{
	
	static String strReverse(String str) {
		
		return new StringBuilder(str).reverse().toString();
	}
}

//Main class
public class MethodRefDemo {
	
	public static void main(String[] args) {
		
		String myString = "This is string which I am going to reverse.";
		
		StringFunction lambda = MyStringOps::strReverse; // Method Reference
		
		System.out.println("Reverse of string is "+lambda.func(myString));
	}
}
