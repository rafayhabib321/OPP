package question_3;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int choice;
		Bulb b1 = new Bulb();
		do {
			System.out.println("-)Press (1) for on");
			System.out.println("-)Press (2) for off");
			System.out.println("-)Press (3) to show status");
			System.out.println("-)Press (4) to exit");
			
			 Scanner input = new Scanner (System.in);
			 choice=input.nextInt();
			 
			 switch (choice) {
			 case 1:
				 b1.turn_on();
			 case 2:
				 b1.turn_off();
			 case 3:
				 b1.showstatus();
			 case 4:
				 break;
				 
			 }
		}while(choice!=4);

	}

}
