package Array_practice.level2;

import java.util.Scanner;

public class PackageDigits {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Take number input
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int maxDigit = 10; // array size limit
        int[] digits = new int[maxDigit];
        int index = 0;

        // Step 2: Extract digits and store in array
        while (number != 0) {
            int digit = number % 10; // last digit
            number = number / 10;    // remove last digit

            digits[index] = digit;   // store in array
            index++;

            // If array is full, stop storing more digits
            if (index == maxDigit) {
                break;
            }
        }

        // Step 3: Find largest and second largest
        int largest = -1;
        int secondLargest = -1;

        for (int i = 0; i < index; i++) {
            int d = digits[i];

            if (d > largest) {
                secondLargest = largest; // update second largest
                largest = d;
            } else if (d > secondLargest && d != largest) {
                secondLargest = d;
            }
        }

        // Step 4: Print results
        System.out.println("\n--- Results ---");
        System.out.print("Digits stored in array: ");
        for (int i = 0; i < index; i++) {
            System.out.print(digits[i] + " ");
        }
        System.out.println("\nLargest digit: " + largest);
        System.out.println("Second largest digit: " + (secondLargest == -1 ? "Not available" : secondLargest));

        sc.close();
    }
}
