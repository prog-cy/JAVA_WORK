import java.math.BigDecimal;

//In this class I will perform all mathematical operation.
public class BigDecimal1 {

	public static void main(String[] args) {
		
		BigDecimal bd1 = new BigDecimal("34.56");
		
		BigDecimal bd2 = new BigDecimal("0.1");
		
		System.out.println(bd1+" + "+bd2+" = "+bd1.add(bd2));
		
		System.out.println(bd1+" - "+bd2+" = "+bd1.subtract(bd2));
		
		System.out.println(bd1+" / "+bd2+" = "+bd1.divide(bd2));
		
		System.out.println(bd1+" * "+bd2+" = "+bd1.multiply(bd2));
		
		System.out.println(bd1+" = "+bd1.negate());
		
		System.out.println(bd1.pow(2));
	}

}
