package jpac;

public class While {
	public static void main(String args[]) {
		
		int i = 10;
		
		int i1 = 10;
		//while - loop
		System.out.println("While loop");
		while(i-->0)
		{
			System.out.print(i+" ");
		}
		
		//do-while loop
		System.out.println("\n\ndo-while loop");
		do {
			
			System.out.print(i1+" ");
		}while(i1-->0);
		
		//for loop 
		System.out.println("\n\nfor loop");
		for(int j = 10; j>=0; j--)
			System.out.print(j+" ");
		
		int [] arr = {10, 20, 30, 40, 50, 60, 70};
		//for each loop
		System.out.println("\n\nfor each loop");
		for(int x : arr)
			System.out.print(x+" ");
	}

}
