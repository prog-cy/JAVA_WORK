package synchronization;

class SharedArea{
	
	private int balance; //shared data
	
	public boolean writable = true; //semaphore variable
	
	public void setter(int balance) {
		
		System.out.println("Total Money in account: "+balance);
		this.balance = balance;
	}
	
	public synchronized void withdraw(int withdraw_amount){
		
		if(writable == false) {
			
			try {wait();}catch(InterruptedException e){System.out.println(e);}
		}
		

		writable = false;
		notify();
		System.out.println("Withdrawl amount is: "+withdraw_amount);
		balance -= withdraw_amount; //critical section
		
	}
	
	public synchronized void printReceipt() {
		
		if(writable == true) {
			
			try {wait();}catch(InterruptedException e) {System.out.println(e);}
		}
		
		writable = true;
		notify();
		System.out.println("Remaining amount is: "+balance); //critical section
	}
		
}

class WithDraw extends Thread{
	
	SharedArea d;
	
	WithDraw(SharedArea d){
		
		this.d = d;
	}
	
	public void run() {
		
		d.setter(200000);
		
		int withdraw_amt = 10000;
		
		for(int i = 1; i<=10; i++) {
			
			d.withdraw(withdraw_amt);
			withdraw_amt -= 1000;
		}
	}
}

class PrintReceipt extends Thread{
	
	SharedArea s;
	
	PrintReceipt(SharedArea s){
		
		this.s = s;
	}
	
	public void run() {
		
		for(int i = 1; i<=10; i++)
			s.printReceipt();
	}
}

public class ATM {
	
	public static void main(String[] args) {
		
		SharedArea sd = new SharedArea();
		WithDraw th1 = new WithDraw(sd);
		PrintReceipt th2 = new PrintReceipt(sd);
		
		th1.start();
		th2.start();
	}

}
