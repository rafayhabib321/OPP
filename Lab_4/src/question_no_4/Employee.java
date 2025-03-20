package question_no_4;

public class Employee {
public void printDetails(int a) {
	System.out.println("Employee ID : "+ a);
}
public void printDetails(String name) {
	System.out.println("Employee Name : "+ name);
}
public void printDetails(int a,String name) {
	System.out.println("/////////////////////////////////");
	System.out.println("Employee Name : "+ name +'\n'+"Employee ID : "+ a);
}

}
