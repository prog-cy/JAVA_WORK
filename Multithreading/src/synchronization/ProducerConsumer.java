package synchronization;

//producer consumer problem of conditional synchronization

class SharedData{
	
	private int data; //shared data
	public boolean writable = true; //semaphore variable
	
	public synchronized void produce(int x) {
		
		if(writable == false) {
			
			try {wait();}catch(InterruptedException e) {System.out.println(e);}
		}
		
		writable = false;
		notify();
		data = x;
		System.out.println("Produced value is: "+data);
			
	}
	
	public synchronized int consume() {
		
		if(writable == true) {
			
			try {wait();}catch(InterruptedException e) {System.out.println(e);}
		}
		
		writable = true;
		notify();
		return data;
	}
}

class Producer extends Thread{
	
	SharedData d;
	
	Producer(SharedData d){
		
		this.d = d;
	}
	
	public void run() {
		
		for(int i = 1; i<=10; i++) {
			
			d.produce(i);
		}
	}
}

class Consumer extends Thread{
	
	SharedData d;
	
	Consumer(SharedData d){
		
		this.d = d;
	}
	
	public void run() {
		
		for(int i = 1; i<=10; i++)
			System.out.println("Consumed value is: "+d.consume());
	}
}


public class ProducerConsumer {
	
	public static void main(String[] args) {
		
		SharedData sd = new SharedData();
		Producer th1 = new Producer(sd);
		Consumer th2 = new Consumer(sd);
		
		th1.start();
		th2.start();
	}

}
