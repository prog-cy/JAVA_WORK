//this: to refer current class instance variable
public class ThiskeywordDemo {
	
	int side;
	
	/*
	 * the local variable "side" inside the constructor hides the instance variable "side"
	 * to refrain from this we used "this" keyword to give priority to the instance variable "side"
	 */
	
	ThiskeywordDemo(int side){ 
		
		this.side = side;
	}
	
	int squareArea() {
		return side * side;
	}
	

	public static void main(String[] args) {
		
		ThiskeywordDemo thisDemo = new ThiskeywordDemo(3);
		
		System.out.println("Area of square is: "+thisDemo.squareArea());
	}

}
