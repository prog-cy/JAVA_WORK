package jpac;

import java.util.Arrays;

// (Ctrl+Mouse Left) to know about any class in java in Eclipse IDE 
//(Ctrl+1) to know suggestions



public class ArrayDemo {
	
	public static void main(String args[]) {
		
		//Array declaration in java
		/*
		 * In java array size is fixed ones declared can't be change again
		 * Method1
		 * 
		 * int[] arrary_name;
		 * 
		 * Method2 
		 * int array_name[];
		 * 
		 * Method3
		 * int[] array_name = new int[size];
		 * 
		 */
		
		//1-D array;
		int[] arr; 
		int arr1[];
		
		arr = new int[10]; //allocating size for the array
		System.out.println(arr[0]); // default value is 0 in Integer type array
		
		arr1 = new int[2];
		arr1[0] = 10; // Storing values in the array
		System.out.println(arr1[0]);
		
		double[] arr3 = new double[10];
		System.out.println(arr3[0]); // default value is 0.0 in double array
		
		boolean[] arr4 = new boolean[5];
		System.out.println(arr4[0]); //default value is false in boolean array
		
		int[] arr5 = {4, 5, 1, 2,6}; //array literals
		System.out.println(arr5[3]);
		
		//2-D array
		
		int[][] matrix = {
				
				{1, 2, 3, 4},
				{4, 5, 6, 7}
		};
		
		System.out.println(matrix[0][0]);
		
		char[] ch = {'A', 'P', 'E'};
		
		String[] str = {"Apple", "Boy", "Cat"};
		
		//Using Array class to print the array
		System.out.println(Arrays.toString(arr5));
		Arrays.sort(arr5);
		System.out.println(Arrays.toString(arr5));
		
		Arrays.sort(matrix[1]);
		System.out.println(Arrays.toString(matrix[1]));
		
		System.out.println(Arrays.toString(ch));
		
		System.out.println(Arrays.toString(str));
		
	}

}
