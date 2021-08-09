package collection;

import java.util.*;

public class ArrayList1 {

	public static void main(String[] args) {

		ArrayList<String> ls = new ArrayList<String>(); //creating list
		
		//add() method is used to add data into the list
		ls.add("Apple");
		ls.add("Mango");
		ls.add("Banana");
		ls.add("Grapes");
		
		System.out.println(ls);// printing list.
		
		Iterator<String> it = ls.iterator(); // this interface is used to iterate a list
		
		System.out.println("\nList elements");
		while(it.hasNext())
			System.out.println(it.next());
		
		System.out.println("\nusing for each loop");
		
		for(String fruit : ls)
			System.out.println(fruit);
		
		System.out.println("\nElement at position 3: "+ls.get(2)); //get(index) method is used to get specific element
		
		ls.set(1, "Dates"); //set(index, data) method is used to set at specific position
		
		System.out.println(ls);
		
		//Below method is used to sort an ArrayList
		Collections.sort(ls);
		
		System.out.println("\nAfter sorting the list");
		System.out.println(ls);
		
		
		
		
		
	}

}
