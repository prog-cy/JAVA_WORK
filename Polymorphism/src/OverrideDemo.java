//method overriding is used to achieve (runtime or dynamic polymorphism)

class Bank{
	
	int getRateOfInterest() {return 0;}
}

class SBI extends Bank{
	
	int getRateOfInterest() {return 8;}
}

class ICICI extends Bank{
	
	int getRateOfInterest() { return 7;}
}

class AXIS extends Bank{
	
	int getRateOfInterest() { return 9;}
}
public class OverrideDemo {

	public static void main(String[] args) {
		SBI s = new SBI();
		
		ICICI i = new ICICI();
		
		AXIS a = new AXIS();
		
		System.out.println(s.getRateOfInterest());
		System.out.println(i.getRateOfInterest());
		System.out.println(a.getRateOfInterest());

	}

}
