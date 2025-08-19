package Array_practice.level2;

import java.util.Scanner;

public class DigitFrequency {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Take input
        System.out.print("Enter a number: ");
        long number = sc.nextLong();

        // Step 2: Convert number to string to find count of digits
        String numStr = Long.toString(number);
        int length = numStr.length();

        // Step 3: Store digits in an array
        int[] digits = new int[length];
        for (int i = 0; i < length; i++) {
            digits[i] = numStr.charAt(i) - '0';
        }

        // Step 4: Frequency array of size 10 (for digits 0–9)
        int[] freq = new int[10];
        for (int i = 0; i < length; i++) {
            freq[digits[i]]++;
        }

        // Step 5: Display frequency of each digit
        System.out.println("\nDigit Frequencies:");
        for (int i = 0; i < 10; i++) {
            if (freq[i] > 0) {   // Only display digits that appear
                System.out.println("Digit " + i + " occurs " + freq[i] + " times");
            }
        }

        sc.close();
    }
}
