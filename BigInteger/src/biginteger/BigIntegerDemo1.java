package biginteger;
import java.math.BigInteger;

public class BigIntegerDemo1 {
	
	public static void main(String[] args) {
		
		//Declaration of BigInteger
		BigInteger A, B;
		
		//Initialization of BigInteger 
		
		A = BigInteger.valueOf(344455237); //If passed argument is int or long then we will use this method
		
		B = new BigInteger("3468764271648376187347843786347887"); // If passed argument is string we will use this method to initialize the BigInteger
		
		
		System.out.println("Value of BigInteger A: "+A);
		
		System.out.println("Value of BigInteger B: "+B);
		
		int a = 4366387;
		
		long b = 547848794l;
		
		BigInteger A1 = BigInteger.valueOf(a);
		
		BigInteger B1 = BigInteger.valueOf(b);
		
		System.out.println("Value of A1: "+A1);
		
		System.out.println("Valur of B1: "+B1);
		
		String num = "4736164637167463786643682716487632643616438761643641267863486873";
		
		BigInteger NUM = new BigInteger(num);
		
		System.out.println("Value of NUM: "+NUM);
	}

}
