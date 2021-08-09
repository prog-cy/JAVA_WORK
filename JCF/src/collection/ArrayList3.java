package collection;

import java.util.*;

public class ArrayList3 {

	public static void main(String[] args) {


		ArrayList<Integer> list = new ArrayList<Integer>();
		
		for(int i = 0; i<10; i++) {
			
			int j = (int)((Math.random()*10)+1);
			list.add(j);
			
		}
		
		System.out.println("Traversing List using Iterator interface");
		Iterator<Integer> it = list.iterator();
		
		while(it.hasNext()) {
			System.out.print(it.next()+" ");
		}
		
		System.out.println("\n\nTraversing List using ListIterator interface");
		ListIterator<Integer> itr = list.listIterator(list.size());
		
		while(itr.hasPrevious())
			System.out.print(itr.previous()+" ");
		
		System.out.println("\n\nTraversing List using for loop");
		for(int i= 0; i<list.size(); i++)
			System.out.print(list.get(i)+" ");
		
		System.out.println("\n\nTraversing List using for each loop");
		for(int x : list)
			System.out.print(x+" ");
		
		System.out.println("\n\nTraversing List using forEachRemaining");
		
		Iterator<Integer> its = list.iterator();
		
		its.forEachRemaining(a->{ System.out.print(a+" ");});
		
		
	}

}
