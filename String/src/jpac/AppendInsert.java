package jpac;

public class AppendInsert {

	public static void main(String[] args) {
		
		/*
		 * Using str.append("string") method we can add string at the end of a string
		 */
		
		StringBuffer str = new StringBuffer();
		System.out.println("str: "+str);
		System.out.println("str length: "+str.length());
		System.out.println("str capacity: "+str.capacity());
		
		str.append("Rupesh");
		System.out.println("str: "+str);
		System.out.println("str length: "+str.length());
		System.out.println("str capacity: "+str.capacity());
		
		str.append(" Kumar");
		System.out.println("str: "+str);
		System.out.println("str length: "+str.length());
		System.out.println("str capacity: "+str.capacity());
		
		str.append(" Dubey");
		System.out.println("str: "+str);
		System.out.println("str length: "+str.length());
		System.out.println("str capacity: "+str.capacity());
		
		//Using str.insert(position, "String") to insert at specific position
		
		str.insert(6, " and Ankur ");
		System.out.println("str: "+str);
		System.out.println("str length: "+str.length());
		System.out.println("str capacity: "+str.capacity());
	}

}
