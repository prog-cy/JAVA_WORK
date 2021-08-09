import java.util.Scanner;

public class Pattern8 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter n: ");
		
		int n  = sc.nextInt();
		
		System.out.println("Number pattern");
		
		for(int i = 0; i<n; i++) {
			int num = 1;
			for(int j = 0; j<=i; j++) {
				System.out.print(num+" ");
				num++;
			}
			
			System.out.println();
		}
		
		sc.close();

	}

}
