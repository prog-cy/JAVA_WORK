package method.Class.jpac;

/*
 * Creating two object of Box class
 * Every single object contains copy of all the data member defined in the Box class
 * and one object does not affect the another object
 */
public class BoxDemo2 {

	public static void main(String[] args) {
		
		Box mybox1 = new Box();
		Box mybox2 = new Box();
		
		mybox1.depth = 2;
		mybox1.heigth = 4;
		mybox1.width = 6;
		
		mybox2.depth = 23;
		mybox2.heigth = 22;
		mybox2.width = 20;
		
		int volume1 = mybox1.depth * mybox1.heigth * mybox1.width;
		
		int volume2 = mybox2.depth * mybox2.heigth * mybox2.width;
		
		System.out.println("Volume of Box 1 is: "+volume1);
		System.out.println("Volume of Bos 2 is: "+volume2);

	}

}
