
public class OverloadCons {

	public static void main(String[] args) {
		
		//creating objects using various constructors
		Shape s1 = new Shape(1, 2, 3);
		Shape s2 = new Shape();
		Shape s3 = new Shape(6);
		
		System.out.println("Volume is: "+s1.volume());
		System.out.println("Volume is: "+s2.volume());
		System.out.println("Volume is: "+s3.volume());
	}

}
