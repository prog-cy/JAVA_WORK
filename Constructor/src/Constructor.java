public class Constructor {
	
	float radius; //defining a instance variable name radius
	
	//Default constructor is defined
	Constructor(){
		radius = 2.5f;	
	}
	
	//method to calculate the circle radius
	double circleArea() {
		
		return (Math.PI)*radius*radius;
	}
	
	//Parameterized constructor with one parameter
	Constructor(float r){
		
		radius = r;
	}
	
	
	
}
