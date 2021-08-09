// In this class we will overload constructors

public class Shape {
	
	int w, h, d;
	
	//constructor when all dimensions are specified
	Shape(int w, int h, int d){
		this.w = w;
		this.h = h;
		this.d = d;
	}
	
	//constructor when dimensions are not specified
	Shape(){
		w = -1;
		h = -1;
		d = -1;
	}
	
	//constructor when dimensions are equal
	Shape(int l){
		w = h = d = l;
	}
	
	//compute and return volume
	int volume() {
		
		return h * w * d;
	}
	

}
