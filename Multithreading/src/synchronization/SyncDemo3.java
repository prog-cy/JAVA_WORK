package synchronization;

//Making a static method synchronized

class Table3{
	
	public synchronized static void display(int n) {
		
		for(int i = 1; i<=10; i++) {
			
			System.out.println(n*i);
		}
	}
}

class MyThread3 extends Thread{
	
	public void run() {
		
		Table3.display(5);
	}
}

class MyThread4 extends Thread{
	
	public void run() {
		Table3.display(6);
	}
}

public class SyncDemo3 {
	
	public static void main(String[] args) {
		
		MyThread3 th1 = new MyThread3();
		MyThread4 th2 = new MyThread4();
		
		th1.start();
		th2.start();
	}
	
	
}
