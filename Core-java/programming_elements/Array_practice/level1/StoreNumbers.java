package Array_practice.level1;

import java.util.Scanner;

public class StoreNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] numbers = new double[10]; // array of max 10 elements
        double total = 0.0;
        int index = 0;

        System.out.println("Enter numbers (up to 10). Enter 0 or a negative number to stop:");

        // Infinite loop until break condition
        while (true) {
            double num = sc.nextDouble();

            // Stop if 0 or negative
            if (num <= 0) {
                break;
            }

            // Stop if array is full
            if (index == 10) {
                System.out.println("Array is full (10 numbers stored).");
                break;
            }

            // Store number and increment index
            numbers[index] = num;
            index++;
        }

        // Display numbers and calculate total
        System.out.println("\nNumbers entered:");
        for (int i = 0; i < index; i++) {
            System.out.println(numbers[i]);
            total += numbers[i];
        }

        // Print total
        System.out.println("Sum of numbers = " + total);

        sc.close();
    }
}
