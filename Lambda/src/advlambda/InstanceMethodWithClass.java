package advlambda;

interface MyFunction<T>{
	
	boolean func(T t, T t1);
}

class HighTemp{
	
	private int htemp;
	
	HighTemp(int htemp){
		this.htemp = htemp;
	}
	
	//This will return true if temperature is same;
	boolean sameTemp(HighTemp temp) {
		
		return htemp == temp.htemp;
	}
	
	//This will return true if htemp is less than temp.htemp
	boolean lessTemp(HighTemp temp) {
		
		return htemp < temp.htemp;
	}
}

public class InstanceMethodWithClass {
	
	static <T> int counter(T[] val, MyFunction<T> lambda, T v){
		
		int count = 0;
		
		for(int i = 0; i<val.length; i++) {
			
			if(lambda.func(val[i], v))
				count++;
		}
		return count;
	}
	
	//Main method
	public static void main(String[] args) {
		
		HighTemp[] weekDayHighs = {new HighTemp(98), new HighTemp(100),
							 new HighTemp(90), new HighTemp(30),
							 new HighTemp(40), new HighTemp(98),
							 new HighTemp(98)};
		int count = counter(weekDayHighs, HighTemp::sameTemp, new HighTemp(98));
		System.out.println("Same temperature as 98: "+count);
		
		int less = counter(weekDayHighs, HighTemp::lessTemp, new HighTemp(90));
		System.out.println("Temperature less than 90: "+less);
	}

}
