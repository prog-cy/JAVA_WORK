import java.math.BigDecimal;

public class BigDecimal3 {

	public static void main(String[] args) {

		String[] s = {"23.34", "45.67", "56.78"};
		
		BigDecimal[] bd = new BigDecimal[s.length];
		
		for(int i = 0; i<s.length; i++) {
			
			bd[i] = new BigDecimal(s[i]);
		}
		
		
		for(int i = 0; i<s.length; i++)
			System.out.println(bd[i]);
 }
}
