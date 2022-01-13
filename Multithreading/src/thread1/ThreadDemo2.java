package thread1;

//In this program we will see how to create thread using Runnable interface
// Because java does not support multiple inheritance so we can not extend another class
//when we create thread using Thread class 
// that's why we create thread using Runnable interface which allow us to extends another class in same thread

class MyThread2 implements Runnable{
	
	@Override
	public void run() {
		
		for(int i = 1; i<=10; i++) {
			
			System.out.println(i+" "+Thread.currentThread().getName());
		}
	}
	
}

public class ThreadDemo2 {
	
	public static void main(String[] args) {
		
		MyThread2 th1 = new MyThread2();
		Thread th = new Thread(th1);
		
		//We can instantiate MyThread2() class but it implements Runnable interface 
		// Runnable interface does not have start() method 
		// This interface only have run() unimplemented method 
		// That's why we call Thread class and we pass the MyThread2() class object inside this class
		th.start();
	}

}
