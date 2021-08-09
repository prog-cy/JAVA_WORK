package collection;

import java.util.*;


public class HashSet2 {

	public static void main(String[] args) {

		HashSet<String> set = new HashSet<String>();
		
		set.add("Ravi");
		set.add("Ravi");
		set.add("Rupesh");
		set.add("Rahul");
		
		Iterator<String> it = set.iterator();
		
		while(it.hasNext())
			System.out.println(it.next());
	}

}
