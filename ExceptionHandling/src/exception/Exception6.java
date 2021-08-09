package exception;

//handling exception in catch block.

public class Exception6 {

	public static void main(String[] args) {
		
		int i = 50;
		
		int j = 0;
		
		try {
			
			int data = i/j;
			
			System.out.println(data);
		}catch(ArithmeticException e) {
			
			int data = i/(j+2);
			System.out.println(data);
		}
		
		System.out.println("Exeption is handled in catch block.");
		
	}

}
