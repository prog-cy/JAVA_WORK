public class ConstructorDemo {

	public static void main(String[] args) {
		
		Constructor circle1 = new Constructor();
		Constructor circle2 = new Constructor(3.5f);
		
		System.out.printf("Area of circle: %.2f", circle1.circleArea());
		
		System.out.printf("\nArea of circle: %.2f", circle2.circleArea());
		
	}

}
