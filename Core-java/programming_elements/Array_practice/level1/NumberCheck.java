package Array_practice.level1;

import java.util.Scanner;

public class NumberCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[5];

        // Input
        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = sc.nextInt();
        }

        // Processing each number
        for (int i = 0; i < numbers.length; i++) {
            int num = numbers[i];

            if (num < 0) {
                System.out.println(num + " is Negative");
            } else if (num == 0) {
                System.out.println(num + " is Zero");
            } else { // positive
                if (num % 2 == 0) {
                    System.out.println(num + " is Positive and Even");
                } else {
                    System.out.println(num + " is Positive and Odd");
                }
            }
        }

        // Compare first and last element
        int first = numbers[0];
        int last = numbers[numbers.length - 1];

        if (first == last) {
            System.out.println("First element " + first + " is equal to last element " + last);
        } else if (first > last) {
            System.out.println("First element " + first + " is greater than last element " + last);
        } else {
            System.out.println("First element " + first + " is less than last element " + last);
        }

        sc.close();
    }
}

