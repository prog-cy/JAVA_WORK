package exception;

public class ProblemWithoutExceptionHandle {

	public static void main(String[] args) {
		
		int data = 50/0; //may throw exception.
		//In this case if exception is thrown then rest of the code will not be executed.
		
		System.out.println(data);
		
		int[] a = new int[2];
		
		a[3] = 30;// may throw exception.
		
		System.out.println("rest of the code.");

	}

}
