
//in this class we are overloading abs method for all data types
public class Math {
	
	//method to calculate absolute value for integer literal
	int abs(int a) {
		
		return (a < 0 )? -a : a;
	}
	
	//method to calculate absolute value for double literal
	double abs(double a) {
		
		return a< 0 ? -a : a;
	}
	
	//method to calculate absolute value for long literal
	long abs(long a) {
		
		return a < 0 ? -a : a;
	}
	
	//method to calculate absolute value for float literal
	float abs(float a) {
		return a < 0 ? -a : a;
		
	}

}
