package jpac;

public class MathOperation {
	
	public static void main(String args[]) {
		
		System.out.println("PI = "+Math.PI);
		System.out.println("min(10,90): "+Math.min(10,90));
		System.out.println("max(10, 90): "+Math.max(10, 90));
		System.out.println("Sqrt(4): "+Math.sqrt(4));
		System.out.println("Power(4, 2): "+(int)Math.pow(4,  2)); // arguments which is passed in pow() method must be double
		
		System.out.println(5/0.0);
		System.out.println(Math.sqrt(-1));
		System.out.println(0/0.0);
		
		System.out.println(Math.round(20.0/3.0));
		
		System.out.println(Math.random()); //This random function prints double value in between 0.0 to 1.0
		
		
		System.out.println((int)(Math.random()*10+1)); //This prints integer value in between 1 to 10
		
		
		System.out.println((int)(Math.random()*20 + 5)); //This prints integer value in between 5 to 25
		
		double deg = 30;
		
		double deg_to_rad = deg * (Math.PI/180);
		
		System.out.println(Math.sin(deg_to_rad));
	}

}
