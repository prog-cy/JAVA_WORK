package thread;

//In this program we will see why we can't call run() method directly using thread
class MyThread3 extends Thread{
	
	@Override
	public void run() {
		
		int n;
		n = 10/0;
		System.out.println("Result is: "+n);
	}
}

public class ThreadDemo3 {
	
	public static void main(String[] args) {
		
		MyThread3 th = new MyThread3(); //The name of the thread is 'Thread-0' given by the java
		
		th.start(); 
		// When we call this start() method then we get this result
		/*
		 * Exception in thread "Thread-0" java.lang.ArithmeticException: / by zero
		 * at thread.MyThread3.run(ThreadDemo3.java:10)
		 */
		
		
		th.run();
		// When we call this run() method then we get this result
		/*   
		 * 	Exception in thread "main" java.lang.ArithmeticException: / by zero
		 *	at thread.MyThread3.run(ThreadDemo3.java:10)
		 *	at thread.ThreadDemo3.main(ThreadDemo3.java:27)
		 */
	}

}
