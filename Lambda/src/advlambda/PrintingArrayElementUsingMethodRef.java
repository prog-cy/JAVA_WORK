package advlambda;

import java.util.*;

public class PrintingArrayElementUsingMethodRef {
	
	public static void main(String[] args) {
		
		Integer[] arr = {10, 20, 30, 40, 50, 60, 70}; //declaring array of type Integer
		
		//asList() method of Arrays class is only compatible with wrapper class arrays
		List<Integer> arrL = Arrays.asList(arr); //Making array as List.
		
		System.out.println("Array element: ");
		//Because forEach loop is only compatible with Collections.
		arrL.forEach(System.out::println); //traversing array element using method reference
	}
}
