package thread1;

//In this method we will see join() method of Thread class which is used to suspend the thread
//join() method 
// this method first complete that thread, for the thread we call this method
// it suspends the thread in which it is called.
// we can not call same method inside which is called because it generates the problem of deadlock


class MyThread extends Thread{
	
	public void run() {
		
		Thread th = Thread.currentThread();
		String name = th.getName();
		
		try {
			this.join(); // This method will also called MyThread which  generate deadlock.
		}catch(InterruptedException e) {System.out.println(e);}
		
		for(int i = 1; i<=5; i++) {
			
			System.out.println(i+" "+name);
		}
	}
}

public class ThreadDemo1 {
	
	public static void main(String[] args) throws InterruptedException {
		
		MyThread th1 = new MyThread();
		th1.start();
		th1.join(); //this join() method will call the MyThread
		
		Thread th = Thread.currentThread();
		String name = th.getName();
		
		for(int i = 1; i<=5; i++) {
			
			System.out.println(i+" "+name);
		}
	}

}
