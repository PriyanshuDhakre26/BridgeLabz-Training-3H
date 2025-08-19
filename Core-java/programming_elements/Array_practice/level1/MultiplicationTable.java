package Array_practice.level1;
import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Get number input
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Array to store results
        int[] table = new int[10];

        // Generate multiplication table
        for (int i = 1; i <= 10; i++) {
            table[i - 1] = number * i; // store result in array
        }

        // Print multiplication table
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " * " + i + " = " + table[i - 1]);
        }

        sc.close();
    }
}


