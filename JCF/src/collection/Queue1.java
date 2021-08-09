package collection;

import java.util.*;

public class Queue1 {
	
	public static void main(String args[]) {
		
		Queue<String> queue = new PriorityQueue<String>();
		
		queue.add("Amit");  
		queue.add("Vijay");  
		queue.add("Karan");  
		queue.add("Jai");  
		queue.add("Rahul");  
		
		for(String name : queue)
			System.out.println(name);
	}

}
