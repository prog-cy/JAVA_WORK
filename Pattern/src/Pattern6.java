import java.util.Scanner;

public class Pattern6 {

	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter n: ");
		
		int n = sc.nextInt();
		
		sc.close();
		
		System.out.println("Hour glass star pattern");
		//upper half diamond
		for(int i = 0; i<n; i++) {
			
			for(int j = 0; j<=i; j++)
				System.out.print(" ");
			for(int k = n-i; k>0; k--)
				System.out.print("* ");
			System.out.println();
		}
		
		//Lower half diamond
		for(int i = 0; i<n; i++) {
			
			for(int j = n-i; j>0; j--)
				System.out.print(" ");
			for(int k = 0; k<=i; k++)
				System.out.print("* ");
			System.out.println();
		}
	}

}
