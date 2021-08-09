package jpac;

public class StringBuilderDemo {

	public static void main(String[] args) {
		
		StringBuilder str = new StringBuilder();
		
		System.out.println("str: "+str);
		System.out.println("capacity of str: "+str.capacity());
		
		StringBuilder str1 = new StringBuilder("Rupesh");
		System.out.println("str1: "+str1);
		
		str1.append(" Kumar");
		System.out.println("str1: "+str1);
		
		str1.insert(str1.length(), " Dubey");
		System.out.println("str1: "+str1);
		
		System.out.println("length of str1: "+str1.length());
		System.out.println("Capacity of str1: "+str1.capacity());
		
		str1.delete(7, 13);
		System.out.println("str1: "+str1);
		
		System.out.println("length of str1: "+str1.length());
		System.out.println("Capacity of str1: "+str1.capacity());
		
		
		System.out.println("Before reverse str1: "+str1);
		str1.reverse();
		System.out.println("Reverse of str1: "+str1);

	}

}
