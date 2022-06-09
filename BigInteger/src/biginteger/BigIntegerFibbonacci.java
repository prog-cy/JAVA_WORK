package biginteger;
import java.math.BigInteger;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BigIntegerFibbonacci {
	
	static BigInteger fibonacci(BigInteger N) {
		
		BigInteger a = BigInteger.ZERO;
		BigInteger b = BigInteger.ONE;
		
		if(N.equals(BigInteger.ONE))
			return a;
		else if(N.equals(new BigInteger("2")))
			return b;
		else {
			
			for(BigInteger i = new BigInteger("3"); i.compareTo(N)<=0; i = i.add(BigInteger.ONE)) {
				
				
				BigInteger c = a.add(b);
				a = b;
				b = c;
			}
			return b;
		}
	}
	
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter number which fibonacci you want: ");
		
		BigInteger N = new BigInteger(br.readLine());
		
		if(N.equals(BigInteger.ONE)) {
			
			System.out.println(N+"st fibonacci number: "+fibonacci(N));
			
		}else if(N.equals(new BigInteger("2"))) {
			
			System.out.println(N+"nd fibonacci number: "+fibonacci(N));
			
		}else if(N.equals(new BigInteger("3"))) {
			System.out.println(N+"rd fibonacci number: "+fibonacci(N));
			
		}else {
			System.out.println(N+"th fibonacci number: "+fibonacci(N));
		}
	}

}
