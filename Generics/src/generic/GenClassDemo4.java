package generic;

//Non Wild card method defined inside this class

class NonWildCardMethod<T extends Number>{
	
	T[] nums; //array object of type T
	
	//constructor to assign reference to nums array
	NonWildCardMethod(T[] arr){
		nums = arr;
	}
	
	//method to calculate the average
	double average() {
		
		double sum = 0;
		for(int i = 0; i<nums.length; i++)
			sum += nums[i].doubleValue();
		return sum/nums.length;
	}
	
	//method to check two array object's average are equal or not
	boolean sameAvg(NonWildCardMethod<T> ob) {
		
		if(average() == ob.average())
			return true;
		else
			return false;
	}
}

//Wild card method defined in below class
class WildCardMethod<T extends Number>{
	
	T[] nums;
	
	WildCardMethod(T[] arr){
		nums = arr;
	}
	
	//method to calculate the average
	double average() {
		
		double sum = 0;
		for(int i = 0; i<nums.length; i++)
			sum += nums[i].doubleValue();
		return sum/nums.length;
	}
	
	boolean sameAvg(WildCardMethod<?> ob) {
		
		if(average() == ob.average())
			return true;
		else
			return false;
	}
	
}

public class GenClassDemo4 {

	public static void main(String[] args) {
		
		Integer[] arr = {10, 20, 30, 40, 50};
		NonWildCardMethod<Integer> iob = new NonWildCardMethod<>(arr);
		System.out.printf("Average: %.2f", iob.average());
		
		Integer[] arr1 = {10, 20, 30, 40, 50};
		NonWildCardMethod<Integer> iob1 = new NonWildCardMethod<>(arr1);
		System.out.printf("\nAverage: %.2f", iob1.average());
		
		//check average is equal or not
		if(iob.sameAvg(iob1))
			System.out.println("\nAverage is same");
		else
			System.out.println("Average is differ");
		
		Double[] darr = {10.0, 20.0, 30.0, 40.0, 50.0};
//		NonWildCardMethod<Double> dob = new NonWildCardMethod<>(darr);
		
		//Error due to below if statement argument
//		if(iob.sameAvg(dob)) //this line will throw an error
//			System.out.println("Average are same");
//		else
//			System.out.println("Average are differ");
		
		WildCardMethod<Integer> ob = new WildCardMethod<>(arr);
		WildCardMethod<Double> ob1 = new WildCardMethod<>(darr);
		
		if(ob.sameAvg(ob1))
			System.out.println("Average is same");
		else
			System.out.println("Average is differ");
		
				
	}

}
