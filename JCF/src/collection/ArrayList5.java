package collection;

import java.util.*;

public class ArrayList5 {

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<String>();
		
		list.add("ram");
		list.add("rohan");
		list.add("rohit");
		list.add("ritik");
		list.add("Ritika");
		
		System.out.println(list);
		
		//Removing an element using index
		list.remove(3);
		System.out.println(list);
		
		//Removing an element using object
		list.remove("Ritika");
		System.out.println(list);
		
		//Creating new array list
		ArrayList<String> list2 = new ArrayList<String>();
		
		list2.add("Vaibhau");
		list2.add("Rupesh");
		
		//adding new list all data to previous list
		list.addAll(list2);
		
		System.out.println(list);
		
		//removeAll() method to remove all new element from the previous list
		list.removeAll(list2);
		
		System.out.println(list);
		
		//removeIf() removes element on basis of specified condition
		list.removeIf(s -> s.contains("ram"));
		System.out.println(list);
		
		//clear() removing all the elements using this method
		list.clear();
		System.out.println(list);
		
		
		

	}

}
