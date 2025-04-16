package Qno1;
import java.util.Scanner;
import java.util.Random;

public class Mathprogram {

    // 1. Square Root Finder
    static class SquareRootFinder {
        public static void run() {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter a number to find its square root: ");
            double num = scanner.nextDouble();
            System.out.println("Square root of " + num + " is: " + Math.sqrt(num));
        }
    }

    // 2. Random Number Generator
    static class RandomNumberGenerator {
        public static void run() {
            Random random = new Random();
            System.out.println("5 Random numbers between 1 and 100:");
            for (int i = 0; i < 5; i++) {
                int randNum = random.nextInt(100) + 1; 
                System.out.println(randNum);
            }
        }
    }

    // 3. Power Calculator
    static class PowerCalculator {
        public static void run() {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter base: ");
            double base = scanner.nextDouble();
            System.out.print("Enter exponent: ");
            double exponent = scanner.nextDouble();
            double result = Math.pow(base, exponent);
            System.out.println(base + " raised to the power " + exponent + " is: " + result);
        }
    }

    // 4. Absolute Difference
    static class AbsoluteDifference {
        public static void run() {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter first integer: ");
            int a = scanner.nextInt();
            System.out.print("Enter second integer: ");
            int b = scanner.nextInt();
            int diff = Math.abs(a - b);
            System.out.println("Absolute difference between " + a + " and " + b + " is: " + diff);
        }
    }

    // 5. Maximum of Three Numbers
    static class MaximumOfThree {
        public static void run() {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter first number: ");
            int x = scanner.nextInt();
            System.out.print("Enter second number: ");
            int y = scanner.nextInt();
            System.out.print("Enter third number: ");
            int z = scanner.nextInt();
            int max = Math.max(x, Math.max(y, z));
            System.out.println("The maximum of the three numbers is: " + max);
        }
    }

   
    public static void main(String[] args) {
        System.out.println("== Square Root Finder ==");
        SquareRootFinder.run();
        
        System.out.println("\n== Random Number Generator ==");
        RandomNumberGenerator.run();
        
        System.out.println("\n== Power Calculator ==");
        PowerCalculator.run();
        
        System.out.println("\n== Absolute Difference ==");
        AbsoluteDifference.run();
        
        System.out.println("\n== Maximum of Three Numbers ==");
        MaximumOfThree.run();
    }
}

