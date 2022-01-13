package synchronization;

class Table4{
	
	public static void display(int n) {
		
		synchronized(Table.class) {
			
			for(int i = 1; i<=10; i++) {
				
				System.out.println(n*i);
			}
		}
	}
}

class MyThread5 extends Thread{
	
	public void run() {
		
		Table4.display(5);
	}
}

class MyThread6 extends Thread{
	
	public void run() {
		
		Table4.display(6);
	}
}

public class SyncDemo4 {
	
	 public static void main(String[] args) {
		
		 MyThread5 th1 = new MyThread5();
		 MyThread6 th2 = new MyThread6();
		 
		 th1.start();
		 th2.start();
	}

}
