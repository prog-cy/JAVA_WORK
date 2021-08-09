public class Box {
	
	double height;
	double width;
	double depth;
	
	//defining a Box constructor for setting instance variable values
	Box(double h, double w, double d){
		
		height = h;
		width = w;
		depth = d;
	}
	
	//return volume of the box
	double volume() {
		return height * width * depth;
	}

}
