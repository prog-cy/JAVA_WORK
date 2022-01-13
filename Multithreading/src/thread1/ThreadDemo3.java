package thread1;

class MyThread3 implements Runnable{
	
	MyThread3(){
		
		new Thread(this).start();
	}
	
	@Override
	public void run() {
		
		for(int i = 0; i<=5; i++)
			System.out.println(i+" "+Thread.currentThread().getName());
	}
}
public class ThreadDemo3 {
	
	public static void main(String[] args) {
		
		new MyThread3(); //This is consturctor call 
		
	}

}
