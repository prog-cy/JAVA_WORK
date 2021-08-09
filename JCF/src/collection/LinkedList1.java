package collection;

import java.util.*;

public class LinkedList1 {

	public static void main(String[] args) {

		//creating LinkedList 
		LinkedList<String> list = new LinkedList<String>();
		
		list.add("java");
		list.add("is");
		list.add("Very");
		list.add("powerful");
		list.add("programming language");
		
		System.out.println(list);
		
		Iterator<String> it = list.iterator();
		
		while(it.hasNext())
			System.out.println(it.next());

	}

}
