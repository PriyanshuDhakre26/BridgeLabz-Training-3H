package Array_practice.level2;

import java.util.Scanner;

public class StudentMarks {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Take input for number of students
        System.out.print("Enter the number of students: ");
        int number = sc.nextInt();

        // Step 2: Create 2D array for marks
        // marks[i][0] -> Physics, marks[i][1] -> Chemistry, marks[i][2] -> Maths
        double[][] marks = new double[number][3];
        double[] percentage = new double[number];
        String[] grade = new String[number];

        // Step 3: Input marks
        for (int i = 0; i < number; i++) {
            System.out.println("\nEnter marks for Student " + (i + 1) + ":");

            // Physics
            do {
                System.out.print("Physics: ");
                marks[i][0] = sc.nextDouble();
                if (marks[i][0] < 0 || marks[i][0] > 100) {
                    System.out.println("Marks must be between 0 and 100. Re-enter.");
                }
            } while (marks[i][0] < 0 || marks[i][0] > 100);

            // Chemistry
            do {
                System.out.print("Chemistry: ");
                marks[i][1] = sc.nextDouble();
                if (marks[i][1] < 0 || marks[i][1] > 100) {
                    System.out.println("Marks must be between 0 and 100. Re-enter.");
                }
            } while (marks[i][1] < 0 || marks[i][1] > 100);

            // Maths
            do {
                System.out.print("Maths: ");
                marks[i][2] = sc.nextDouble();
                if (marks[i][2] < 0 || marks[i][2] > 100) {
                    System.out.println("Marks must be between 0 and 100. Re-enter.");
                }
            } while (marks[i][2] < 0 || marks[i][2] > 100);

            // Step 4: Calculate percentage
            double total = marks[i][0] + marks[i][1] + marks[i][2];
            percentage[i] = total / 3.0;

            // Step 5: Assign grade
            if (percentage[i] >= 90) {
                grade[i] = "A+";
            } else if (percentage[i] >= 75) {
                grade[i] = "A";
            } else if (percentage[i] >= 60) {
                grade[i] = "B";
            } else if (percentage[i] >= 50) {
                grade[i] = "C";
            } else if (percentage[i] >= 35) {
                grade[i] = "D";
            } else {
                grade[i] = "F";
            }
        }

        // Step 6: Display results
        System.out.println("\n---- Student Report ----");
        System.out.printf("%-10s %-10s %-10s %-12s %-10s\n",
                "Physics", "Chemistry", "Maths", "Percentage", "Grade");

        for (int i = 0; i < number; i++) {
            System.out.printf("%-10.2f %-10.2f %-10.2f %-12.2f %-10s\n",
                    marks[i][0], marks[i][1], marks[i][2], percentage[i], grade[i]);
        }

        sc.close();
    }

}
