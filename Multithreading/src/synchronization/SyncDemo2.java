package synchronization;

//Making a block synchronized inside a method

class Table1{
	
	public void display(int n) {
		
		synchronized(this) {
			
			for(int i = 1; i<=10; i++) {
				
				System.out.println(n*i);
			}
		}
	}
}

class MyThread1 extends Thread{
	
	Table1 t;
	
	MyThread1(Table1 t){
		this.t = t;
	}
	
	public void run() {
		
		t.display(5);
	}
}

class MyThread2 extends Thread{
	
	Table1 t;
	
	MyThread2(Table1 t){
		
		this.t = t;
	}
	
	public void run() {
		
		t.display(6);
	}
}

public class SyncDemo2 {
	
	public static void main(String[] args) {
		
		Table1 t = new Table1();
		
		MyThread1 th1 = new MyThread1(t);
		MyThread2 th2 = new MyThread2(t);
		
		th2.start();
		th1.start();
	}

}
