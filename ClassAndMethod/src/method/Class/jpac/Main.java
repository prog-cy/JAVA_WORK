package method.Class.jpac;

public class Main {

	public static void main(String[] args) {
		
		Human human1 = new Human("Rohan", 20, 56);
		Human human2 = new Human("Raju", 30, 40);
		Human human3 = new Human("Radhika", 20, 60);		
		
		System.out.println(human1.name+", "+human1.age+", "+human1.weight);
		System.out.println(human2.name+", "+human2.age+", "+human2.weight);
		System.out.println(human3.name+", "+human3.age+", "+human3.weight);
		
		human1.eat();
		human2.eat();
		human3.eat();
		
		human1.drink();
		human2.drink();
		human3.drink();

	}

}
