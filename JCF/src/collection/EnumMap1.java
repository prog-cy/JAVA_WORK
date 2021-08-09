package collection;

import java.util.*;

enum Key{
	
	SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
}

public class EnumMap1 {

	public static void main(String[] args) {
		
		EnumMap<Key, Integer> map = new EnumMap<Key, Integer>(Key.class);
		
		map.put(Key.SUNDAY, 1);
		map.put(Key.MONDAY, 2);
		map.put(Key.TUESDAY, 3);
		
		for(Map.Entry<Key, Integer> m : map.entrySet())
			System.out.println(m.getKey()+" "+m.getValue());
	}

}
