package collection;

import java.util.*;


public class NavigableMap1 {

	public static void main(String[] args) {
		
			NavigableMap<Integer, String> map = new TreeMap<Integer, String>();
			
			map.put(100,"Amit");    
		    map.put(102,"Ravi");    
		    map.put(101,"Vijay");    
		    map.put(103,"Rahul");    
		    
		    System.out.println("Iterating map");
		    
		    for(Map.Entry<Integer, String> m : map.entrySet())
		    	System.out.println(m.getKey()+" "+m.getValue());
		    
		    System.out.println("Descending Map: "+map.descendingMap());
		    
		    System.out.println("Head Map: "+map.headMap(102, true));
		    
		    System.out.println("Tail Map: "+map.tailMap(101, true));
		    
		    System.out.println("SubMap: "+map.subMap(102, true, 103, true));
	}

}
