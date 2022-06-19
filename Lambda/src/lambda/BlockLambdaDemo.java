package lambda;

interface StringFunc{
	
	String func(String n);
}

public class BlockLambdaDemo {
	
	static String str;
	
	public static void main(String[] args) {
		
		java.util.Scanner scan = new java.util.Scanner(System.in);
		
		System.out.println("Enter the string: ");
		str = scan.nextLine();
		
		StringFunc reverse = (str) -> {
			
			StringBuffer strbuffer = new StringBuffer(str);
			
			return strbuffer.reverse().toString();
		};
		
		System.out.println("\""+str+"\""+" after reversing: "+reverse.func(str));
		scan.close();
	}
}
