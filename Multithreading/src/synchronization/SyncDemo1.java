package synchronization;

//Making a method synchronized

class Table{
	
	public synchronized void display(int n) {
		
		for(int i = 1; i<=10; i++) {
			System.out.println(n*i);
		}
	}
}

class Thread1 extends Thread{
	
	Table t;
	
	Thread1(Table t){
		this.t = t;
	}
	
	@Override
	public void run() {

		t.display(5);
	}
}

class Thread2 extends Thread{
	
	Table t;
	
	Thread2(Table t){
		this.t = t;
	}
	
	@Override
	public void run() {
		
		t.display(4);
	}
}


public class SyncDemo1 {
	
	public static void main(String[] args) {
		
		Table t = new Table();
		
		Thread1 th1 = new Thread1(t);
		Thread2 th2 = new Thread2(t);
		
		th1.start();
		th2.start();
	}

}
