public class Combination {
	
	
	// method to calculate the factorial of a number
	static long fact(int n) {
		
		if(n == 1 || n == 0) return 1;
		
		return n * fact(n-1);
	}
	
	//method to calculate the combination 
	static long nCr(int n, int m) {
		
		long res = 0;
		
		if(m == 0) res = 1;
		
		else if(m == 1) res = n;
		
		else if(m > n) res = -1;
		
		else
			res = fact(n)/(fact(m)*fact(n-m));
		
		return res;
	}
	
	//method to calculate the permutation
	static long nPr(int n, int m) {
		
		long res = 0;
		
		if(m == 0) res = 1;
		
		else if(m == 1) res = fact(n);
		
		else if(m > n) res = -1;
		
		else
			res = fact(n)/fact(n-m);
		
		return res;
		
		
	}
	
	// Driver code
	public static void main(String[] args) {
		
		System.out.println(nCr(50, 60));
		System.out.println(nPr(5, 7));
		
		int row = 4;
		int col = 4;
		
		//formula to find path in matrix from one end to other while traversing
		/*
		 *  formula = fact(m+n-2)/fact(n-1)*fact(m-1);
		 *  
		 *  where m and n are row and column respectively
		 */
		System.out.println(nCr(row+col-2, col-1));
	}

}
