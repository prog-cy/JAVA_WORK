package thread;

class MyThread2 extends Thread{
	
	@Override
	public void run() {
		
		for(int i = 1; i<=10; i++) {
			System.out.println(i);
		} 
	}
}

public class ThreadDemo2 {
	
	public static void main(String[] args) {
		
		MyThread2 th1 = new MyThread2();
		MyThread2 th2 = new MyThread2();
		
		th1.start();
		th2.start();
	}

}
