package rand.gen;

public class UsingMathclass {

	public static void main(String[] args) {
		
		/*
		 * random() method is defined inside the Math class which is defined inside the java.lang package
		 * java.lang class is pre-imported in every java program that's why we are not importing Math class
		 *
		 */
		
		// To print double values between a given range
		System.out.println(Math.random()); // this will generate double value b/w 0.0 to 1.0(excluded)
		System.out.println(Math.random()*100 + 1); // this will generate double value b/w 1.0 to 100.0(excluded)
		
		// To print integer values b/w a given range
		/* will use formula (int)(Math.random() * (max - min +1) + min) // using this formula we can print 
		 * values in the range min to max(included).
		 */
		
		
		for(int i = 0; i<10; i++) {
			
			int n = (int)(Math.random() * (10 - 1 + 1) + 1); //number b/w 1 to 10
			System.out.println(n);
		}
	}

}
