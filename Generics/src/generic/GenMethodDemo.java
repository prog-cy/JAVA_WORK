package generic;

//In this program I am going to demonstrate generic method in java
/*
 * Generic method is a different method which is used to implement a 
 * single method to perform a single task for all kind of data type
 * data type can be primitive or it can be wrapper classes or an object
 */
/*
 * There is problem for example 
 * if I have to swap a number regardless of data type
 * I can not do without generic method 
 */
public class GenMethodDemo {
	
	//method to swap any data type using generic method 
	//T is a type parameter that will be replaced by a real type 
	//when object of type <T> is created
	<T> void swap(T a, T b) {
	
		T temp = a;
		a = b;
		b = temp;
		System.out.println("a: "+a+" "+"b: "+b);
	}

	public static void main(String args[]) {
		
		GenMethodDemo genmethod = new GenMethodDemo();
		
		Integer a = 30;
		Integer b = 45;
		System.out.println("Integer class object");
		System.out.println("Before swapping");
		System.out.println("a: "+a+" "+"b: "+b);
		System.out.println("After swapping");
		genmethod.swap(a, b);
		
		Float a1 = 30.45f;
		Float b1 = 34.56f;
		System.out.println("\nFloat class object");
		System.out.println("Before swapping");
		System.out.println("a: "+a1+" "+"b: "+b1);
		System.out.println("After swapping");
		genmethod.swap(a1, b1);
		
		int a2 = 34;
		int b2 = 45;
		System.out.println("\nint data type");
		System.out.println("Before swapping");
		System.out.println("a: "+a2+" "+"b: "+b2);
		System.out.println("After swapping");
		genmethod.swap(a2, b2);
		
		double a3 = 34.5678;
		double b3 = 56.7898;
		System.out.println("\ndouble data type");
		System.out.println("Before swapping");
		System.out.println("a: "+a3+" "+"b: "+b3);
		System.out.println("After swapping");
		genmethod.swap(a3, b3);
		
	}
}
