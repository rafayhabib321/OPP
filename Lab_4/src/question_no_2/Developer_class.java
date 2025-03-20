package question_no_2;

public class Developer_class extends Manager_class{
	public int salary = 4000;
@Override
void calculateSalary() {
	System.out.println("Developer salary : "+salary+"$");

	System.out.println("Developer salary : "+salary*0.1+"$ (10%) Project Allowance");
	
}
}
