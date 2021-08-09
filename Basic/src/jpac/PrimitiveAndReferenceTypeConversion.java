package jpac;

import java.util.Arrays;

public class PrimitiveAndReferenceTypeConversion {
	
	public static void main(String args[]) {
		
		int i = 128; //primitive type variable
		int i1 = 128;
		System.out.println("i == i1: "+(i == i1)); // true We are comparing values
		
		Integer i2 = 128;
		Integer i3 = 128;
		System.out.println("i2 == i3: "+(i2 == i3)); //false We are comparing reference values
		
		Integer i4 = 127;
		Integer i5 = 127;
		// We are comparing reference but these objects values in Integer pool (-128, 127)
		System.out.println("i4 == i5: "+(i4 == i5)); // true
		System.out.println("i2.equals(i3): "+i2.equals(i3));
		
		Integer a = Integer.valueOf(127);
		Integer a1 = Integer.valueOf(127);
		System.out.println("a == a1: "+(a == a1));
		
		int[] arr1 = {1, 2, 3};
		int[] arr2 = {1, 2, 3};
		
		System.out.println("arr1 == arr2: "+ (arr1 == arr2));
		System.out.println("arr1.equals(arr2): "+arr1.equals(arr2));
		System.out.println("Arrays.equals(arr1, arr2): "+ Arrays.equals(arr1, arr2));
	}

}
