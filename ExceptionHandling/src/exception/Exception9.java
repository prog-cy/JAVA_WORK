package exception;

// Multiple catch block

public class Exception9 {

	public static void main(String[] args) {
		
		
		try {
			
			int len = args.length;
			
			int[] a = new int[4];
			
			a[4]  = 30/len;
	
		}catch(ArrayIndexOutOfBoundsException e) {
			
			System.out.println(e.getLocalizedMessage());
		}catch(ArithmeticException e) {
			
			System.out.println(e.getLocalizedMessage());
		}catch(Exception e) {
			System.out.println(e.getLocalizedMessage());
		}
		
		System.out.println("rest of code...");

	}

}
