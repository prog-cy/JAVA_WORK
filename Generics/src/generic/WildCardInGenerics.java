package generic;

// WildCard(?) demo.

//This is a parent class
class Student{
	
	//This method will ensures that which branch student are living in hostel.
	void staysInCollegeHostel(Student s) {
		
		System.out.println(s.getClass()+" living in hostel.");
	}
}

//Multilevel inheritance
class Engineering extends Student{
	
	
	void computerScienceStudent() {
		
		System.out.println("These are computer science student");
	}
	
}

class Management extends Student{
	
	void MBAStudent() {
		
		System.out.println("These are MBA student");
	}
	
}

//Generic class
class GenericClass<T>{
	
}

//Main class
public class WildCardInGenerics {
	
	public static void main(String[] args) {
		
		//This list contains Student object
		GenericClass<Student> students = new GenericClass<>();
		GenericClass<Engineering> engineeringStudents = new GenericClass<>();
		GenericClass<Management> managementStudents = new GenericClass<>();
		System.out.println(students.getClass());
		
		
		//Assigning enginneringStudent list to student list;
		//We can not assign child generic object to its parent generic object
//		students = engineeringStudents; //This line will throw a compile time Exception
		
		//Now using WildCard
		//? this sign shows the wildCard
		//This initialization is not bounded so it can refer to its child class as well as its parent
		GenericClass<?> powerStudents = new GenericClass<>();
		GenericClass<Object> objList = new GenericClass<>();
		powerStudents = engineeringStudents;
		powerStudents = objList;
		System.out.println(powerStudents.getClass());
		
		//Upper bound of wildCard
		//Upper bounding of wildCard restricts to assign its parent generic object to this object
		//It can only refer to its child class generic objects
		GenericClass<? extends Student> upperBoundedStudent = new GenericClass<>();
		upperBoundedStudent = engineeringStudents;
		upperBoundedStudent = managementStudents;
//		upperBoundedStudent = objList; //Object is the parent of all objects so it can't be assigned 
		//to the generic object which upper bounded.
		System.out.println(upperBoundedStudent.getClass());
		
		//Lower bound of WildCard
		//Lower bounding of wildCard restricts to assign its child generic object to this object
		//It can only refer to its parent class generic objects
		GenericClass<? super Student> lowerBoundedStudent = new GenericClass<>();
		//engineeringStudents are child of student we have bounded wild card at lower level
		//so we can not assign objects of its child to this object it will throw a compile time 
		//exception
//		lowerBoundedStudent = engineeringStudents; 
		lowerBoundedStudent  = objList;
		System.out.println(lowerBoundedStudent.getClass());	
	}

}
