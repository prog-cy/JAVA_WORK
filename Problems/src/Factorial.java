//In this program I will calculate the factorial of the number
import java.io.*;

public class Factorial {
	
	public static long fact(int n) {
		
		if(n == 1)
			return 1;
		return n * fact(n-1);
	}
	
	public static void main(String[] args)throws IOException {
		
		InputStreamReader input = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(input);
		
		System.out.println("Enter number of test case: ");
		int t = Integer.parseInt(br.readLine());
	
		while(t-->0) {
			
			System.out.println("Enter the number which factroial you want: ");
			int n = Integer.parseInt(br.readLine());
			
			System.out.println("Factorial of "+n+" is "+fact(n));
			
			System.out.println();
		}

}

}
