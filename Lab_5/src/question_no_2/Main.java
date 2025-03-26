package question_no_2;

public class Main {

	public static void main(String[] args) {
		Animal name = new Animal();
		name.makesound();
	}

}
class Animal{
	 final public void makesound() {
		System.out.println("Animal make sound");
	}
}
class Dog extends Animal{
//	 public void makesound() {
//			System.out.println("Animal make sound");
//		}
}
//Can`t access the animal class (method)because of final keyword.