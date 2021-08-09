import java.util.Scanner;

public class Pattern5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter n: ");
		
		int n = sc.nextInt();
		
		sc.close();
		
		System.out.println("Diamond star pattern");
		//upper half diamond
		for(int i = 0; i<n; i++) {
			
			for(int j = n-i; j>0; j--)
				System.out.print(" ");
			for(int k = 0; k<=i; k++)
				System.out.print("* ");
			System.out.println();
		}
		
		//Lower half diamond
		for(int i = 0; i<n; i++) {
			
			for(int j = 0; j<=i+1; j++)
				System.out.print(" ");
			for(int k = n-i; k>1; k--)
				System.out.print("* ");
			System.out.println();
		}

	}

}
