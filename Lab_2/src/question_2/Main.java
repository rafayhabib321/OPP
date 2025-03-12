package question_2;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int oldpass;
		int newpass;
		
		 Manager m1 = new Manager ();
		 Scanner input = new Scanner (System.in);
		 
		 System.out.println("Enter old password ");
		 oldpass=input.nextInt();
		 
		 System.out.println("Enter new password ");
		 newpass=input.nextInt();
		 
		 m1.changepassword(oldpass, newpass);
		 
		 System.out.println("\nEnter password ");
		 newpass=input.nextInt();
		 m1.validatepassword(newpass);
	}

}
