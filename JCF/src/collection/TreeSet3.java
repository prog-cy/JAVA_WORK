package collection;

import java.util.*;

public class TreeSet3 {

	public static void main(String[] args) {

		TreeSet<Integer> set = new TreeSet<Integer>();
		
		set.add(34);  
        set.add(40);  
        set.add(11); 
        set.add(13);
        
        System.out.println("Lowest value: "+set.pollFirst());
        System.out.println("Highest value: "+set.pollLast());
	}

}
