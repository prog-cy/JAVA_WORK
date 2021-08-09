import java.io.*;

public class GFG {
	
	static void display(int[][] m) {
		
		for(int[] arr : m) {
			for(int x : arr)
				System.out.print(x+" ");
			System.out.println();
		}
	}
	
	public static void main (String[] args) throws IOException {
		InputStreamReader input = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(input);
		
		int t = Integer.parseInt(br.readLine());
		
		while(t-->0){
		    
		    int[][] m = new int[3][3];
		    
		    for(int i = 0; i<3; i++){
		    	
		        String s = br.readLine();
		        String[] s1 = s.split(" ");
		        
		        for(int j = 0; j<3; j++){
		            m[i][j] = Integer.parseInt(s1[j]);
		        }
		    }
		    
		    display(m);
		}
	}
}