package Array_practice.level1;

import java.util.Scanner;

public class FizzBuzzArray {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Get input
        System.out.print("Enter a positive integer: ");
        int number = sc.nextInt();

        // Check validity
        if (number <= 0) {
            System.out.println("Error: Please enter a positive integer.");
            sc.close();
            return;
        }

        // Create String array to store results
        String[] results = new String[number + 1];

        // Loop to fill results
        for (int i = 0; i <= number; i++) {
            if (i % 3 == 0 && i % 5 == 0 && i != 0) {
                results[i] = "FizzBuzz";
            } else if (i % 3 == 0 && i != 0) {
                results[i] = "Fizz";
            } else if (i % 5 == 0 && i != 0) {
                results[i] = "Buzz";
            } else {
                results[i] = String.valueOf(i);
            }
        }

        // Print results with positions
        for (int i = 0; i <= number; i++) {
            System.out.println("Position " + i + " = " + results[i]);
        }

        sc.close();
    }
}
