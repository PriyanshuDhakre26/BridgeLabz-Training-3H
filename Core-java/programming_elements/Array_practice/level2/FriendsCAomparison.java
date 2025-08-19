package Array_practice.level2;

import java.util.Scanner;

public class FriendsCAomparison {
      public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Names of the friends
        String[] names = {"Amar", "Akbar", "Anthony"};

        // Arrays to store ages and heights
        int[] ages = new int[3];
        int[] heights = new int[3];

        // Input ages and heights
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter age of " + names[i] + ": ");
            ages[i] = sc.nextInt();

            System.out.print("Enter height (in cm) of " + names[i] + ": ");
            heights[i] = sc.nextInt();
        }

        // Find youngest
        int minAgeIndex = 0;
        for (int i = 1; i < ages.length; i++) {
            if (ages[i] < ages[minAgeIndex]) {
                minAgeIndex = i;
            }
        }

        // Find tallest
        int maxHeightIndex = 0;
        for (int i = 1; i < heights.length; i++) {
            if (heights[i] > heights[maxHeightIndex]) {
                maxHeightIndex = i;
            }
        }

        // Output
        System.out.println("\n--- Results ---");
        System.out.println("Youngest friend: " + names[minAgeIndex] + " (Age: " + ages[minAgeIndex] + ")");
        System.out.println("Tallest friend: " + names[maxHeightIndex] + " (Height: " + heights[maxHeightIndex] + " cm)");

        sc.close();
    }
}
