package exception;

public class Exception2 {

	public static void main(String[] args) {
		
		try {
			
			int[] a = new int[5];
			a[6] = 2;
			
			System.out.println(a[6]);
		}catch(ArrayIndexOutOfBoundsException e) {
			
			System.out.println(e.getMessage()+" error.");
		}
		
		System.out.println("There are not a flow distrupts.");
	}

}
