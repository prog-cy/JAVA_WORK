package method.Class.jpac;

public class BoxWithMethod {

	int heigth;
	int width;
	int depth;
	
	//Method which will calculate the volume of the Box and does not return any value
	void volume() {
		
		System.out.println("Volume of the box is: "+(heigth*width*depth));
	}
	
	//Method will return area of rectangle
	int recArea() {
		
		return heigth * width;
	}
	
	//Method will take an argument and return a value
	int squareArea(int h) {
		return h*h;
	}
}
