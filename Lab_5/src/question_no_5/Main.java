package question_no_5;

public class Main {

	public static void main(String[] args) {
		Person p = new Person("Ray");
        System.out.println("Name: " + p.name);

        // Attempt to modify the final variable
        // p.name = "Roe"; // This will cause a compilation error

        System.out.println("Final variable cannot be changed once assigned.");
	
	}

}
class Person{
	final String name;
	 Person(String name) {
	        this.name = name;
	    }
	   // Method to attempt modifying the final variable (this will cause an error)
	    void changeName(String newName) {
	        // this.name = newName; // Uncommenting this line will cause a compilation error
	    }

}