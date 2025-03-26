package question_no_4;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		final double radius;
		Circle c1 = new Circle();
		 Scanner input= new Scanner(System.in);
		 
		 System.out.println("Enter radius of circle");
		 radius=input.nextDouble();
		 
		System.out.println("Area of circle is "+c1.calculateArea(radius));
	}

}
class Circle{
	double calculateArea(double a) {
		final double pi = 3.14;
		double area;
		
		area = pi*(a*a);
		return area;
	}
}