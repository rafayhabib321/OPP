package question_no_4;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int id;
		String name;
		Scanner input = new Scanner(System.in);
		Employee e1 = new Employee();
		
		System.err.println("Enter your name :");
		name=input.nextLine();
		System.err.println("Enter your id :");
		id=input.nextInt();
		
		e1.printDetails(name);
		e1.printDetails(id);
		e1.printDetails(id,name);
	}

}
