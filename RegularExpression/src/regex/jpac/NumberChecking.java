package regex.jpac;

public class NumberChecking {

	public static void main(String[] args) {
		
		String p = "([0-9]{1,2}|1[0-9][0-9]|2[0-4][0-9]|25[0-5])";
		
		String pattern = p + "\\." + p + "\\." + p + "\\." + p;
		
		String num = "123.45.67.167";
		
		System.out.println(num.matches(pattern));	
	}

}
