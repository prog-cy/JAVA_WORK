package collection;

import java.util.*;

public class TreeMap1 {

	public static void main(String[] args) {


		TreeMap<Integer, String> tmap = new TreeMap<>();
		
		tmap.put(5, "Mangoes");
		tmap.put(10, "Bananas");
		tmap.put(1, "Black-Berry");
		tmap.put(3, "Grapes");
		
		System.out.println(tmap.entrySet());
		
		for(Map.Entry<Integer, String> m : tmap.entrySet())
			System.out.println(m.getKey()+" "+m.getValue());
	}

}
