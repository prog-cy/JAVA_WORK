package collection;

import java.util.*;

public class TreeSet4 {

	public static void main(String[] args) {

		TreeSet<String> set = new TreeSet<String>();
		
		set.add("A");
		set.add("B");
		set.add("C");
		set.add("D");
		set.add("E");
		
		System.out.println("set: "+set);
		
		System.out.println("Head set: "+set.headSet("C", true));
		System.out.println("Head set: "+set.headSet("C", false));
		
		System.out.println("Subset: "+set.subSet("B", true, "E", false));
		
		System.out.println("Tail set: "+set.tailSet("A", false));
		
		System.out.println("Reverse a set: "+set.descendingSet());

	}

}
