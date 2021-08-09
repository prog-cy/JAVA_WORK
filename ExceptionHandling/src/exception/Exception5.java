package exception;

public class Exception5 {

	public static void main(String[] args) {
		
		//Using parent class to handle the exception.
		//Exception is parent class of all kind of exception in java.
		
		try {
			
			int data = 50/0;
			System.out.println("This code will not be executed."+data);
		}catch(Exception e) {
			
			System.out.println(e.getMessage()+" error");
		}
		
		System.out.println("rest code...");
	}

}
