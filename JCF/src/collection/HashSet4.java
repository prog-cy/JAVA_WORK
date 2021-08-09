package collection;

//In this program I will create HashSet from another collection
import java.util.*;

public class HashSet4 {

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<String>();
		list.add("Ravi");  
        list.add("Vijay");  
        list.add("Ajay"); 
        
        //creating HashSet from this list
        HashSet<String> set = new HashSet<String>(list);
        
        System.out.println("Set: "+set);
        
	}

}
