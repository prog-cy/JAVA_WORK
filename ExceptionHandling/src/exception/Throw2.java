package exception;

public class Throw2 {
	
		static void validate(int age) {
			
			if(age < 18)
				throw new ArithmeticException("not valid");
			else
				System.out.println("Welcome you are teen.");
			
		}
		
		public static void main(String[] args) {
			
			
			try {validate(17);}
			catch(Exception e) {
				
				System.out.println(e);
			}
			
			System.out.println("rest of code...");

		}
	

}
