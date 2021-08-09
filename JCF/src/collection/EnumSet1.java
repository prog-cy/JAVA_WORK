package collection;

import java.util.*;

enum days{
	
	SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
}

public class EnumSet1 {

	public static void main(String[] args) {

		EnumSet<days> en = EnumSet.of(days.TUESDAY, days.SATURDAY);
		
		for(days e : en)
			System.out.println(e);
		
		Iterator<days> it = en.iterator();
		
		while(it.hasNext())
			System.out.println(it.next());
		
		EnumSet<days> set1 = EnumSet.allOf(days.class);
		
		System.out.println("List of all values in enum: "+set1);
		
		EnumSet<days> set2 = EnumSet.noneOf(days.class);
		System.out.println("List of no values in enum: "+set2);
		
		EnumSet<days> set3 = set1.clone();
		System.out.println("Copy of set: "+set3);
		
		EnumSet<days> set4 = EnumSet.range(days.TUESDAY, days.SATURDAY);
		System.out.println("Subset of enum list: "+set4);
	}

}
