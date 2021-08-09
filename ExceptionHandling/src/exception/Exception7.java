package exception;

public class Exception7 {

	public static void main(String[] args) {
		
		try {
			
			int data = 50/0;
			
			System.out.println(data);
		}catch(Exception e) {
			
			System.out.println(e.getLocalizedMessage());
		}
	
//Unreached catch block 
//	catch(ArithmeticException e) {
//			System.out.println(e.getMessage());
//		}
//		
	}

}
