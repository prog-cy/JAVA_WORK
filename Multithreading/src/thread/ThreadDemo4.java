package thread;

//In this program we will see the  sleep() method of Thread class
// sleep() is static method which used to block the thread for few milliseconds
// We will also see few more important methods of Thread class like currentThread()

class MyThread4 extends Thread{
	
	public void run() {
		
		Thread th = Thread.currentThread();
		String name = th.getName();
		
		for(int i = 1; i<=5; i++) {
			System.out.println(i+" "+name);
			
			try {
				Thread.sleep(250);
			}catch(InterruptedException e) {System.out.println(e);}
		}
		
	}
}

public class ThreadDemo4 {
	
	public static void main(String[] args) {
		
		MyThread4 th1 = new MyThread4();
		th1.start();
		
		Thread th = Thread.currentThread();
		String name = th.getName();
		
		for(int i = 1; i<=5; i++) {
			
			System.out.println(i+" "+name);
			
			try {
				
				Thread.sleep(250);
			}catch(InterruptedException e) {System.out.println(e);}
		}
	}
}
