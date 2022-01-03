/*
 * To achieve compile-time (static Polymorphism) we use method overloading technique
 */

public class Overload {
	
	//this is original method
	void test() {
		System.out.println("No parameter");
	}
	
	//method overloaded with one parameter
	void test(int a) {
		System.out.println("a= "+a);
	}
	
	//method overloaded with two parameter
	void test(int a, int b) {
		System.out.println("a = "+a);
		System.out.println("b = "+b);
	}

}
