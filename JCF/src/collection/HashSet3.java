package collection;

import java.util.HashSet;

//all removing method discussed in this program.

public class HashSet3 {

	public static void main(String[] args) {


		HashSet<String> set = new HashSet<String>();
		
		set.add("Ravi");  
        set.add("Vijay");  
        set.add("Arun");  
        set.add("Sumit");  
        System.out.println("An initial list of elements: "+set);  
        
        set.remove("Vijay");
        System.out.println("After removing one element: "+set);
        
        //Creating another HashSet
        HashSet<String> set1 = new HashSet<String>();
        set1.add("Rinki");
        set1.add("Shreya");
        
        set.addAll(set1);
        System.out.println("After updating the set: "+set);
        
        set.removeAll(set1);
        System.out.println("After deleting all new added element: "+set);
        
        set.removeIf(s->s.contains("Ravi"));
        System.out.println("After deleting specific element from the set: "+set);
        
        set.clear();
        System.out.println("After deleting all element from the set: "+set);
	}

}
