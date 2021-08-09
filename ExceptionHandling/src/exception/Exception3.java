package exception;

public class Exception3{
	
	public static void main(String[] args) {
		
		try {
			
			String s1 = "";
			System.out.println(s1.length());
			
//			String s = null;
//			System.out.println(s.length());
			
		}catch(NullPointerException ob) {
			System.out.println(ob.getMessage()+" pointer error.");
		}
		
		System.out.println("code after handling the exception.");
	}
}