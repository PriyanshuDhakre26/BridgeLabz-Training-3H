package Array_practice.level1;

import java.util.Scanner;

public class TwoDtoOneD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Get user input for rows and columns
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter number of columns: ");
        int cols = sc.nextInt();

        // Create 2D array
        int[][] matrix = new int[rows][cols];

        // Input matrix elements
        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        // Create 1D array to copy elements
        int[] array = new int[rows * cols];
        int index = 0;

        // Copy elements from 2D to 1D
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                array[index] = matrix[i][j];
                index++;
            }
        }

        // Print 1D array
        System.out.println("1D Array elements:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

        sc.close();
    }
}
