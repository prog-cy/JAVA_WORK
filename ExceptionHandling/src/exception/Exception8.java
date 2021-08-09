package exception;

public class Exception8 {

	public static void main(String[] args) {
		
      try {
			
			int data = 50/0;
			
			System.out.println(data);
		}catch(ArithmeticException e) {
			
			System.out.println(e.getLocalizedMessage());
		}
	
	
      	catch(Exception e) {
      			System.out.println(e.getMessage());
      	}
	}

}
