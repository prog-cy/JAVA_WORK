package biginteger;
import java.math.BigInteger;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BigIntegerFactorial {
	
	//This is the function which can calculate the any big number factorial.
	static BigInteger factorial(BigInteger N) {
		
		BigInteger ans = BigInteger.ONE;
		
		BigInteger increment = BigInteger.ONE;
		
		for(BigInteger i = BigInteger.valueOf(2); i.compareTo(N)<=0; i = i.add(increment)) {
			
			 ans = ans.multiply(i);
		}
		
		return ans;
	}
	
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter big number: ");
		BigInteger N = new BigInteger(br.readLine());
		
		System.out.println("Factorial of "+N+" is: "+factorial(N));
	}

}
