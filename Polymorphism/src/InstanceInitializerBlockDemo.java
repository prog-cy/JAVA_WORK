//Instance initialization block in java

public class InstanceInitializerBlockDemo {
	
	int speed;
	
	InstanceInitializerBlockDemo() {
		System.out.println("This is constructor");
	}
	
	
	//Instance initializer block
	{
		System.out.println("Instance initializer block");
		speed = 100;
	}

	public static void main(String[] args) {
		
		InstanceInitializerBlockDemo ob = new InstanceInitializerBlockDemo();
		
		System.out.println("Speed is: "+ob.speed);

	}

}
