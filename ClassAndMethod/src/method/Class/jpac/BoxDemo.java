package method.Class.jpac;

public class BoxDemo {

	public static void main(String[] args) {

		//Creating object of the Box class
		Box mybox = new Box();
		
		mybox.depth = 23;
		mybox.heigth = 22;
		mybox.width = 20;
		
		int volume = mybox.depth * mybox.heigth * mybox.width;
		
		System.out.println("Volume of box is: "+volume);
		

	}

}
