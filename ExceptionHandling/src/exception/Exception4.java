package exception;

public class Exception4 {

	public static void main(String[] args) {
		
		try {
			
			String ch = "abc";
			
			int a = Integer.parseInt(ch);
			
			System.out.println(a);
			
		}catch(NumberFormatException e) {
			
			System.out.println("Number format exception.");
		}
	}

}
