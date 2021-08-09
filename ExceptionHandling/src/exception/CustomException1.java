package exception;

// Custom exception

@SuppressWarnings("serial")
class MyException extends Exception{
	
	private int detail;
	
	MyException(int a){
		detail = a;
	}
	
	public String toString() {
		
		return "MyException[" + detail + "]";
	}
}

public class CustomException1 {
	
	static void compute(int a) throws MyException{
		System.out.println("called "+"("+a+")");
		if(a>10)
			throw new MyException(a);
		System.out.println("normal exit");
	}
	
	public static void main(String[] args) {
		  
		try {
			compute(1);
			compute(20);
		}catch(MyException e) {
			
			System.out.println("Caugth: "+e);
		}
	}

}
