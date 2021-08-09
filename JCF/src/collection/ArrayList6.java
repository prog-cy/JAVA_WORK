package collection;

import java.util.*;

public class ArrayList6 {

	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<String>();
		
		System.out.println("List is empty: "+list.isEmpty());
		
		list.add("Ram");
		list.add("Rohan");
		list.add("Rupesh");
		
		System.out.println("List is empty: "+list.isEmpty());
		
		ArrayList<String> list1 = new ArrayList<String>();
		list1.add("Ram");
		list1.add("Rupesh");
		
		list.retainAll(list1); // this method adds intersection of two list in one list
		
		System.out.println(list);
		
		Iterator<String> it = list.iterator();
		
		while(it.hasNext())
			System.out.println(it.next());
	}

}
