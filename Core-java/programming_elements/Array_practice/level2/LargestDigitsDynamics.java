package Array_practice.level2;

import java.util.Scanner;

public class LargestDigitsDynamics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Take number input
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int maxDigit = 10; // initial array size
        int[] digits = new int[maxDigit];
        int index = 0;

        // Step 2: Extract digits and store in array
        while (number != 0) {
            int digit = number % 10; // last digit
            number = number / 10;    // remove last digit

            // If array is full, expand its size by +10
            if (index == maxDigit) {
                maxDigit += 10;
                int[] temp = new int[maxDigit]; // new bigger array
                for (int i = 0; i < digits.length; i++) {
                    temp[i] = digits[i]; // copy old values
                }
                digits = temp; // reassign reference
            }

            digits[index] = digit;   // store digit
            index++;
        }

        // Step 3: Find largest and second largest
        int largest = -1;
        int secondLargest = -1;

        for (int i = 0; i < index; i++) {
            int d = digits[i];

            if (d > largest) {
                secondLargest = largest;
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
