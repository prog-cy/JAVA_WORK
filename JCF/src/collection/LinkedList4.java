package collection;

import java.util.*;

//reverse a list of elements

public class LinkedList4 {
	
	public static void main(String args[]) {

		LinkedList<String> list = new LinkedList<String>();
		
		list.add("ravi");
		list.add("rahul");
		list.add("ratan");
		list.add("ram");
		
		Iterator<String> it = list.descendingIterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
		
}
