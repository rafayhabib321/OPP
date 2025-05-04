package question_no_3;
import java.util.Scanner;

public class Calculator implements Operations {
    private double a, b;

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        a = sc.nextDouble();
        b = sc.nextDouble();
    }

    public void add() {
        System.out.println("Addition: " + (a + b));
    }

    public void subtract() {
        System.out.println("Subtraction: " + (a - b));
    }

    public void multiply() {
        System.out.println("Multiplication: " + (a * b));
    }

    public void divide() {
        if (b != 0)
            System.out.println("Division: " + (a / b));
        else
            System.out.println("Cannot divide by zero.");
    }
}
