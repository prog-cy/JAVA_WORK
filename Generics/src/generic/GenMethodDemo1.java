package generic;

public class GenMethodDemo1 {
	
	// generic method to return value
	<T> T method(T val){			
		return val;
	}
	
	@SuppressWarnings("unchecked")
	// using variable argument to take n values
	<T> void method1(T... v){	
		for(T x : v)
			System.out.print(x+" ");
		System.out.println();
	}
	
	//using array to take n values
	<T> void method2(T[] arr) {
		for(T x : arr)
			System.out.print(x+" ");
		System.out.println();
	}
	
	public static void main(String[] args) {
		
		GenMethodDemo1 genmethod = new GenMethodDemo1();
		System.out.println("Value: "+genmethod.method("45678"));
		System.out.println("Value: "+genmethod.method(34.5678));
		System.out.println("Value: "+genmethod.method(345));
		
		Integer i1 = 45;
		System.out.println("Value: "+genmethod.method(i1));
		
		String s = "34567";
		System.out.println("Value: "+genmethod.method(s));
		
		System.out.println("\nValues");
		genmethod.method1(23, 45, 67, 89, 90);
		genmethod.method1(34.55, 67.78, 78.90, 45.67);
		genmethod.method1("34", "45", "67");
		
		System.out.println("\nValues");
		Integer[] arr = {23, 45, 67, 78};
		genmethod.method2(arr);
		genmethod.method1(arr);
	}

}
