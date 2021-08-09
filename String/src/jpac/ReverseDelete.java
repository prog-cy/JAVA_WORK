package jpac;

public class ReverseDelete {

	public static void main(String[] args) {
		
		// Using reverse() method we can reverse a string
		StringBuffer str = new StringBuffer(40);
		
		str.append("reverse");
		System.out.println("Original str: "+str);
		
		str.reverse();
		System.out.println("After reversing str: "+str);
		
		str.append(" string");
		System.out.println("Before deleting the str: "+str);
		
		str.delete(0, 7);
		System.out.println("After deleting the str: "+str);
		
		str.deleteCharAt(1);
		System.out.println("After deleting first char from str: "+str);

	}

}
