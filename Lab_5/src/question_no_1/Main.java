package question_no_1;

public class Main {

	public static void main(String[] args) {
		//Can't overwrite this variable.
		final double pi = 3.14;
		
		double radius =35.2;
		double area;
		
		area = pi*(radius*radius);
		System.out.println("Area of circle is A = "+area );
	}

}
