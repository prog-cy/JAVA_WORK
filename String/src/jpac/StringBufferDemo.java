package jpac;

public class StringBufferDemo {

	public static void main(String[] args) {
		
		/*
		 * StringBuffer class gives us power to create modifiable string
		 * There are four constructor we can use to create a string object of type StringBuffer class
		 * StringBuffer()
		 * StringBuffer(int size);
		 * StringBuffer(String str)
		 * StringBuffer(CharSequence chars)
		 */
		
		StringBuffer str = new StringBuffer();
		System.out.println("String is: "+str);
		
		StringBuffer str1 = new StringBuffer("Hello");
		System.out.println("String is: "+str1);
		
		String stringLiteral = "hello";
		StringBuffer str2 = new StringBuffer(stringLiteral);
		System.out.println("Strin is: "+str2);
		System.out.println("String len: "+str2.length());
		System.out.println("String capacity: "+str2.capacity());
		
		/*
		 * charAt(int index)
		 * setCharAt(int index, char c)
		 * setLength(int len)
		 */
		System.out.println("capacity of str2: "+str2.capacity());
		str.ensureCapacity(20);
		System.out.println("capacity of str: "+str.capacity());
		System.out.println("String str1: "+str1);
		
		System.out.println("Char at index 1 in "+str1+" string: "+str1.charAt(1));
		
		str1.setCharAt(1, 'i');
		str1.setLength(2);
		System.out.println("String str1 after modifying length and char at index 1 is: "+str1);
		System.out.println("Capacity of str1: "+str1.capacity());
		
		
	}

}
