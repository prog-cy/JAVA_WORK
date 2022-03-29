public class BitMagic {
	
	static int convertEvenBitToZero(int n) {
		
		int mask = 0b10101010101010101010101010101010;
		
		return n&mask;
	}
	
	static int convertOddBitToZero(int n) {
		
		int mask = 0b01010101010101010101010101010101;
		
		return (n & mask);
	}

	public static void main(String[] args) {
		
		System.out.println("After converting even bits to zero of "+30+" becomes "+convertEvenBitToZero(30));
		System.out.println("After converting odd bits to zero of "+30+" becomes "+convertOddBitToZero(30));
	
	}

}
