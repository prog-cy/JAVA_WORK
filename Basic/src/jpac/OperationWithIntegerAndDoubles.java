package jpac;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class OperationWithIntegerAndDoubles {

	public static void main(String[] args) {
		
		int i = 20;
		
		System.out.println(6);
		System.out.println(6/3);
		System.out.println((double)20/3);
		
		BigDecimal ridefee = BigDecimal.valueOf(i).setScale(2);
		BigDecimal amountOfPeople = BigDecimal.valueOf(3);
		BigDecimal chargePerPerson = ridefee.divide(amountOfPeople, RoundingMode.HALF_UP);
		System.out.println(chargePerPerson);
		
		double d1 = 3.1;
		double d2 = 1.23;
		
		BigDecimal num1 = BigDecimal.valueOf(d1).setScale(2);
		BigDecimal num2 = BigDecimal.valueOf(d2).setScale(2);
		
		System.out.println(num1.subtract(num2));
	}

}
