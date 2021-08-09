package method.Class.jpac;

public class BoxDemo3 {

	public static void main(String[] args) {
		
		Box b1 = new Box();
		Box b2 = b1;
		/*
		 *  In this object initialization b1 and b2 same object
		 */
		
		b1.heigth = 10;
		
		System.out.println("Height of box is: "+b1.heigth);
		
		b2.heigth = 20;
		
		System.out.println("Height of box is: "+b1.heigth);
	}

}
