package collection;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSet1 {

	public static void main(String[] args) {

		TreeSet<String> set = new TreeSet<String>();
		
		set.add("Ravi");
		set.add("Rahil");
		set.add("Rupesh");
		set.add("Ankur");
		set.add("Billu");
		
		System.out.println("Tree set: "+set);
		
		Iterator<String> it = set.iterator();
		
		while(it.hasNext())
			System.out.println(it.next());
	}

}
