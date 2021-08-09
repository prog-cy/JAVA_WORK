package enumeration.autobox;

public class Autoboxing {

	public static void main(String[] args) {
		
		// To convert a primitive data type to its correspondence wrapper class object
		
		int a = 50;
		
		Integer i = Integer.valueOf(a); // converting int to Integer explicitly
		
		Integer j = a; //autoboxing, compiler will write Integer.valueOf(a) internally
		
		System.out.println(a+" "+i+" "+j);
	}

}
