package collection;

//List example
import java.util.*;

public class List1 {

	public static void main(String[] args) {


		List<String> list = new ArrayList<String>();
		
		list.add("Mango");
		list.add("Banana");
		list.add("Grapes");
		list.add("Dates");
		
		System.out.println(list);
		
		for(String s : list)
			System.out.println(s);
		
		List<String> list1 = new LinkedList<String>();
		
		list1.add("Ravi");
		list1.add("Rahul");
		list1.add("Rohit");
		list1.add("Rupesh");
		
		System.out.println("\n");
		System.out.println(list1);
		
		for(String name : list1)
			System.out.println(name);
	}

}
