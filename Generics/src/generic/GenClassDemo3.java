package generic;

//UnBounded Generic Class 
class UnBound<T>{
	
	T[] nums; //nums is an array of type T
	
	UnBound(T[] arr){
		nums = arr;
	}
	
	
	// this method will throw an error because T can take any kind of Data
//	double average() {
//		
//		double sum = 0.0;
//		for(int i = 0; i<nums.length; i++)
//			sum += nums[i].doubleValue(); //Error!!
//		
//		return sum/nums.length;
//	}
	
}

// To fix above problem we use Bound Generic class
// In the below class we will bound our class to work with only Numbers 
class Bound<T extends Number >{
	
	T[] nums; //nums is an array of type T
	
	//Constructor
	Bound(T[] arr){
		nums = arr;
	}
	
	//calculates average
	double average() {
		
		double sum = 0;
		for(int i = 0; i<nums.length; i++){
			sum += nums[i].doubleValue();
			
		}
		
		return sum/nums.length;
	}
		
}


public class GenClassDemo3 {

	public static void main(String[] args) {
		 
		//creating object of Bound class
		Double[] arr = {23.45, 56.78, 78.99};
		Bound<Double> bound = new Bound<>(arr);
		
		System.out.format("Average of array is: %.3f", bound.average());
		
		Integer[] arr1 = {12, 34, 56, 67};
		Bound<Integer> bound1 = new Bound<>(arr1);
		System.out.format("\nAverage of array is: %.2f", bound1.average());
		
		Float[] arr2 = {23.45f, 56.78f, 67.890f};
		Bound<Float> bound2 = new Bound<>(arr2);
		System.out.format("\nAverage of array is: %.2f", bound2.average());
		
		Short[] sarr = {12, 34, 56, 67};
		Bound<Short> bound3 = new Bound<>(sarr);
		System.out.format("\nAverage of array is: %.2f", bound3.average());
		
//		String[] arr2 = {"23", "34", "45", "56"};
//		Bound<String> bound2 = new Bound<>(arr2); //Error because Bound can only work with numbers
	}

}
