package project2;

// This is the simple java project to create random OTP with the help of 0-9 digits

public class RandomOTPGenerator {
	
	public static String generator(int len) {
		
		String str = "0123456789";
		
		int n = str.length();
		
		String OTP = "";
		
		for(int i = 1; i<=len; i++) {
			
			OTP += (str.charAt((int)(Math.random()*n))); // In the charAt() function we are generation random number to get the character randomly
		}
		return OTP;
	}
	
	public static void main(String[] args) {
		
		int len = 4;
		
		System.out.println("OTP is: "+generator(len));
	}

}
