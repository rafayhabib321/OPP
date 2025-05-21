package question_no_01;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter radius of circle: ");
        double radius = sc.nextDouble();
        shape circle = new Circle(radius);
        System.out.println("Circle Area: " + circle.area());

        System.out.print("Enter length and width of rectangle: ");
        double length = sc.nextDouble();
        double width = sc.nextDouble();
        shape rectangle = new Rectangle(length, width);
        System.out.println("Rectangle Area: " + rectangle.area());

        sc.close();
    }
}
