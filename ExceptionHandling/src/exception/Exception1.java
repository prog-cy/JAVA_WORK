package exception;

//In this class we will try to catch one exception using try-catch block

public class Exception1 {

	public static void main(String[] args) {
	
		try {
			
			int a = 5;
			int c = a/0;
			System.out.println("c: "+c);
			
		}catch(ArithmeticException e){
			System.out.println(e.getMessage()+" error encountered.");
		}
		
		System.out.println("Code after handling exception.");

	}

}
