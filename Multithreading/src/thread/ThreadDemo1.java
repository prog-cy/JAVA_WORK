package thread;

class MyThread extends Thread{
	
	@Override
	public void run() {
		
		System.out.println("I am learning multithreading in Java.");
	}
}

//Main class 
public class ThreadDemo1 {

	public static void main(String[] args) {
		
		MyThread th = new MyThread();
		th.start();

	}

}
