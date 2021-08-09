import java.math.BigDecimal;

public class BigDecimal2 {

	public static void main(String[] args) {
		
		// Initialization of BigDecimal when double value is passed inside the valueOf(double d)
		
		BigDecimal a, b;
		
		a = BigDecimal.valueOf(34.56);
		b = BigDecimal.valueOf(45.67);
		
		BigDecimal A, B;
		
		A = new BigDecimal("345.678"); //Initialization of string values
		
		B = new BigDecimal("45.67");
		
		
		
		System.out.println(a+" + "+b+" = "+a.add(b));
		
		System.out.println(a+" - "+b+" = "+a.subtract(b));
		
		System.out.println(a+" * "+b+" = "+a.multiply(b));
		
		System.out.println(A+" + "+B+" = "+A.add(B));
		

	}

}
