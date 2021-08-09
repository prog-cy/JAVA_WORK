package collection;

import java.util.*;

public class Hashtable1 {

	public static void main(String[] args) {
		Hashtable<Integer, String> hm = new Hashtable<Integer, String>();
		
		  hm.put(100,"Amit");  
		  hm.put(102,"Ravi");  
		  hm.put(101,"Vijay");  
		  hm.put(103,"Rahul"); 
		  
		  for(Map.Entry<Integer, String> m : hm.entrySet())
				System.out.println(m.getKey()+" "+m.getValue());
		  
		  System.out.println("getorDefault(): "+hm.getOrDefault(100, "None"));
		  System.out.println("getorDetault(): "+hm.getOrDefault(105, "None"));

	}

}
