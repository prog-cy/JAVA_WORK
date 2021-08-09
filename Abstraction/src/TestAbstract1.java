 abstract class Bike1{  
	 
   Bike1(){System.out.println("bike is created");}  
   
   abstract void run();
   
   void changeGear(){System.out.println("gear changed");}  
 }  
 
//Creating a Child class which inherits Abstract class  
 class Honda extends Bike1{  
	 void run()	{
		 System.out.println("running safely..");
	 }  
 }  
public class TestAbstract1 {

	public static void main(String[] args) {
		
		Bike1 b1 = new Honda();
		b1.run();
		b1.changeGear();
	}

}
