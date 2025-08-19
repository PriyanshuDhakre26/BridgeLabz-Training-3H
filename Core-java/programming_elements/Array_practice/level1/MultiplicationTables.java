package Array_practice.level1;

import java.util.Scanner;

public class MultiplicationTables {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Get user input (just to confirm start of range)
        System.out.print("Enter a number (must be between 6 and 9): ");
        int number = sc.nextInt();

        // Check valid input
        if (number < 6 || number > 9) {
            System.out.println("Please enter a number between 6 and 9.");
            sc.close();
            return;
        }

        // Define 2D array: 4 tables (6,7,8,9) each with 10 results
        int[][] multiplicationResult = new int[4][10];

        // Fill results
        for (int n = 6; n <= 9; n++) {
            for (int i = 1; i <= 10; i++) {
                multiplicationResult[n - 6][i - 1] = n * i;
            }
        }

        // Display results
        for (int n = 6; n <= 9; n++) {
            System.out.println("\nMultiplication Table of " + n + ":");
            for (int i = 1; i <= 10; i++) {
                System.out.println(n + " * " + i + " = " + multiplicationResult[n - 6][i - 1]);
            }
        }

        sc.close();
    }
}
