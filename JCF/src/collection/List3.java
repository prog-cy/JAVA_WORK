package collection;

import java.util.*;

//converting list to array

public class List3 {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<String>();
		
		list.add("Mango");
		list.add("Banana");
		list.add("Grapes");
		list.add("Dates");
		
		
		
		String[] str = list.toArray(new String[list.size()]);
		
		System.out.println("List is: "+list);
		System.out.println("Array is: "+Arrays.toString(str));

	}

}
