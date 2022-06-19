package advlambda;

interface MyGenericFunc<T>{
	
	int func(T[] vals, T v);
	
}

class MyArrayOps{
	
	static <T> int countMatch(T[] values, T v) {
		
		int count = 0;
		
		for(T val : values) {
			
			if(val == v)
				count++;
		}
		
		return count;
	}
}

public class GenericMethodRed {
	
	public static void main(String[] args) {
		
		Integer[] vals = {1, 2, 3, 4, 2, 3, 4, 4, 5};
		
		MyGenericFunc<Integer> lambda = MyArrayOps::<Integer>countMatch;
		
		System.out.println("Total number of 4 presents in vals array: "+lambda.func(vals, 4));
		
		String[] sts = {"One", "Two", "Three", "Two"};
		
		MyGenericFunc<String> lambda1 = MyArrayOps::<String>countMatch;
		
		System.out.println("Total number of \"Two\" presents in sts array: "+lambda1.func(sts, "Two"));
	}
}
