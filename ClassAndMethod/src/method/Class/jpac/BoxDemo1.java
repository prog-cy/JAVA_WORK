package method.Class.jpac;

public class BoxDemo1 {

	public static void main(String[] args) {
		
		//Creating reference of a Box class
		Box mybox; //mybox is reference to the box class
		
		//allocating memory for mybox object using new keyword
		mybox = new Box();
		
		mybox.depth = 23;
		mybox.heigth = 22;
		mybox.width = 20;
		
		int volume = mybox.depth * mybox.heigth * mybox.width;
		
		System.out.println("Volume of box is: "+volume);


	}

}
