package collection;

import java.util.ArrayList;

//In this program I will test ArrayList class of Collection framework

public class ArrayList2 {

	public static void main(String[] args) {


		ArrayList<Integer> ls = new ArrayList<Integer>(); //declaration of generic ArrayList class
		
		ls.add(12);
		ls.add(13);
		ls.add(45);
		ls.add(40);
		
		System.out.println(ls);
		
		Object[] arr = ls.toArray(); // this line will convert list to Object array
		
		Integer[] arr1 = new Integer[ls.size()]; // we will create a Integer array
		
		int[] arr2 = new int[ls.size()];
		System.arraycopy(arr, 0, arr1, 0, ls.size()); // this line will copy all the element from Object array to Integer.
		
		int i = 0;
		for(int x : arr1) {
			arr2[i] = x;
			i++;
		}
			
		
		for(int x : arr1)
			System.out.println(x);
		
		
		
	}

}
