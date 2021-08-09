package generic;

//demonstration of upper bound wild card
//if class hierarchy is defined then we use bound wild card
class TwoD{
	
	int x, y;
	TwoD(int x, int y){
		this.x = x;
		this.y = y;
	}
}

class ThreeD extends TwoD{
	
	int z;
	ThreeD(int x, int y, int z){
		super(x, y);
		this.z = z;
	}
}

class FourD extends ThreeD{
	int t;
	FourD(int x, int y, int z, int t){
		super(x, y, z);
		this.t = t;
	}
}

class Coordinate<T extends TwoD>{
	
	T[] coords;
	
	Coordinate(T[] arr){
		coords = arr;
	}
	
	//without bound wild card 
	void showXY(Coordinate<?> o) {
		
		System.out.println("X   Y");
		for(int i = 0; i<o.coords.length; i++) {
			System.out.print(o.coords[i].x+"   "+o.coords[i].y);
			System.out.println();
		}
		
	}
	
	//with upper bound wild card
	// To create an upper bound wild card we have to use "extends" keyword and specified class
	void showXYZ(Coordinate<? extends ThreeD> o) {
		
		System.out.println("\nX  Y  Z");
		for(int i = 0; i<o.coords.length; i++) {
			System.out.println(o.coords[i].x+"  "+o.coords[i].y+"  "+o.coords[i].z);
			System.out.println();
		}
		
	}
	
	void showAll(Coordinate<? extends FourD> o) {
		
		System.out.println("\nX  Y  Z  T");
		for(int i = 0; i<o.coords.length; i++) {
			System.out.println(o.coords[i].x+"  "+o.coords[i].y+"  "+o.coords[i].z
					+"  "+o.coords[i].t);
			System.out.println();
		}
		
	}
}

public class GenClassDemo5 {
	public static void main(String[] args) {
		
		TwoD[] twod = {
						
						new TwoD(1, 2),
						new TwoD(4, 5),
						new TwoD(3, 4)
					};
		
		Coordinate<TwoD> ob = new Coordinate<>(twod);
		ob.showXY(ob);
//		ob.showXYZ(ob); //Error
//		ob.showAll(ob); //Error
		
		ThreeD[] threed = {
				
				new ThreeD(1, 2, 3),
				new ThreeD(3, 4, 5),
				new ThreeD(5, 6, 7)
		};
		
		Coordinate<ThreeD> tob = new Coordinate<>(threed);
		tob.showXY(tob);
		tob.showXYZ(tob);
		
		FourD[] fourd = {
				
				new FourD(1, 2, 3, 4),
				new FourD(1, 5, 3, 8),
				new FourD(3, 2, 5, 4)
		};
		
		Coordinate<FourD> ob1 = new Coordinate<>(fourd);
		ob1.showXY(ob1);
		ob1.showXYZ(ob1);
		ob1.showAll(ob1);
	}
}
