package question_no_2;

public class Manager_class extends Employee {
	public int salary = 5000;
@Override
void calculateSalary() {
	System.out.println("Manager salary : "+salary+"$");

	System.out.println("Manager salary : "+salary*0.05+"$ (5%) bonus");
}
}
