package question_no_1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int basesalary;
		double basesalary2;
		double base;
		int rate;
		
		Scanner input = new Scanner (System.in);
		Employee e1 = new Employee();
		
		System.out.println("Enter your salary");
		basesalary = input.nextInt();
		
		System.out.println("Enter your salary in double");
		basesalary2 = input.nextDouble();
		
		System.out.println("Enter your Rating(1->5)");
		rate = input.nextInt();
		
		System.out.println("Bonus for your basesalary "+basesalary+" is (5%): "+e1.calculateBonus(basesalary) );
	
		System.out.print("Bonus for your doublesalary "+basesalary2+" and rating "+ rate +" is: ");
		base=e1.calculateBonus(basesalary2, rate);
		if(base==basesalary2) {
			System.out.println("NO BONUS "+ base);
	}else if (base==0) {
		System.out.println("ERROR");
	}else{
		System.out.println(base);
	}
}
}
