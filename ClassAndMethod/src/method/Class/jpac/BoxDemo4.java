package method.Class.jpac;

public class BoxDemo4 {

	public static void main(String[] args) {
		
		BoxWithMethod b1 = new BoxWithMethod();
		
		b1.depth = 10;
		b1.heigth = 20;
		b1.width = 5;
		
		b1.volume();
		
		System.out.println("Rectangle area: "+b1.recArea());
		
		System.out.println("Square area: "+b1.squareArea(b1.heigth));
	}

}
