
public class Conversion {
	
	//this method is used to convert a decimal number to any other number
	static String DecimalToAny(int n, int m) {
		
		if(n == 0) return "";
		return ""+DecimalToAny(n/m, m)+(n%m);	
	}
	
	static long power(int a, int b) {
		
		int res = 1;
		
		while(b != 0) {
			
			if((b&1) == 1)
				res *= a;
			b >>= 1;
			a *= a;
		}
		
		return res;
	}
	
	static long AnyToDecimal(String n, int m) {
		
		long res = 0;
		
		int len = n.length();
		
		for(int i = 1; i<=len; i++) {
			
			int j = (int)(n.charAt(i-1))-48;
			res = res + j * power(m, len-i);
		}
		
		return res;
	}
	
	public static void main(String[] args) {

			String num = "1110111011101";
			long res = AnyToDecimal(num, 2);
			System.out.println(num+" in decimal " +res);
			System.out.println(res+" to Binary "+DecimalToAny((int)res, 2));
			System.out.println(14+" octal in decimal "+AnyToDecimal("14", 8));
			System.out.println((int)Math.ceil(Math.log(40))+1);
			
			
	}

}
