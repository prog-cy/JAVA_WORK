//Thread is class resides  inside java.lang package
// It has method start without start method the execution of out thread does not start
// When we call start() method of thread class in Ram we have thread pool where our thread has been created
// and now it is ready to scheduled on CPU.

// Thread is execution unit.
// Multithreading is way to execute multiple thread simultaneously

public class ThreadDemo1 {

	public static void main(String[] args) {
		
		Thread th = new Thread(); // This state is called 'Born state'
		th.start(); // start() is a method  in Thread class which is used to start a thread.
		// this state is called 'runnable state'
		//until start() method is not called thread does not goes inside Thread Pool which is inside the RAM
		
		
		// start() method has below implemention inside the Thread class 
		// start() method calls run() method, it does not have any implementation that's why
		// when we  call start() method it does not print anything.
		// but we can override run() method according to our needs 
		/*
		 *   public void start(){
		 *   	
		 *   		...........
		 *   		...........
		 *   		...........
		 *   		run();
		 *
		 *   }
		 *   
		 *   public void run(){
		 *   
		 *   }
		 */

	}

}
