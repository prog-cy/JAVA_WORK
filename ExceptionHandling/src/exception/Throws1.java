package exception;

import java.io.IOException;

public class Throws1 {
	
	void m() throws IOException{
		
		throw new IOException("Error");	
	}
	
	void n() {
		
		try {
			m();
		}catch(Exception e) {
			System.out.println("exception handled.");
		}
	}

	public static void main(String[] args) {
		
		Throws1 ob = new Throws1();
		
		ob.n();
		
		
	}

}
