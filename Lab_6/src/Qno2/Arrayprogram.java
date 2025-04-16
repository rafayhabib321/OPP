package Qno2;
import java.util.*;

public class Arrayprogram {

    // 6. Sum of Array Elements
    class SumOfArray {
        public void run() {
            int[] numbers = {10, 20, 30, 40, 50};
            int sum = 0;
            for (int num : numbers) {
                sum += num;
            }
            System.out.println("Sum of array elements: " + sum);
        }
    }

    // 7. Find the Maximum Element
    class MaxElementFinder {
        public void run() {
            int[] numbers = {12, 5, 98, 34, 76, 3};
            int max = numbers[0];
            for (int num : numbers) {
                if (num > max) {
                    max = num;
                }
            }
            System.out.println("Maximum element: " + max);
        }
    }

    // 8. Reverse an Array
    class ReverseArray {
        public void run() {
            int[] numbers = {1, 2, 3, 4, 5};
            System.out.print("Array in reverse: ");
            for (int i = numbers.length - 1; i >= 0; i--) {
                System.out.print(numbers[i] + " ");
            }
            System.out.println();
        }
    }

    // 9. Even Numbers in Array
    class EvenNumbers {
        public void run() {
            int[] numbers = {3, 8, 15, 22, 10, 11, 18, 21, 6, 4};
            System.out.print("Even numbers: ");
            for (int num : numbers) {
                if (num % 2 == 0) {
                    System.out.print(num + " ");
                }
            }
            System.out.println();
        }
    }

    // Main method to run everything
    public static void main(String[] args) {
        Arrayprogram app = new Arrayprogram(); 

        SumOfArray sumTask = app.new SumOfArray();
        MaxElementFinder maxTask = app.new MaxElementFinder();
        ReverseArray reverseTask = app.new ReverseArray();
        EvenNumbers evenTask = app.new EvenNumbers();

        System.out.println("== Sum of Array ==");
        sumTask.run();

        System.out.println("\n== Maximum Element ==");
        maxTask.run();

        System.out.println("\n== Reverse Array ==");
        reverseTask.run();

        System.out.println("\n== Even Numbers ==");
        evenTask.run();
    }
}
