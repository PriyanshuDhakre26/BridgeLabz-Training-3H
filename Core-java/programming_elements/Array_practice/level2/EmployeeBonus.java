package Array_practice.level2;

import java.util.Scanner;

public class EmployeeBonus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numEmployees = 10;

        double[] salary = new double[numEmployees];
        double[] years = new double[numEmployees];
        double[] bonus = new double[numEmployees];
        double[] newSalary = new double[numEmployees];

        double totalBonus = 0.0;
        double totalOldSalary = 0.0;
        double totalNewSalary = 0.0;

        // Input for employees
        for (int i = 0; i < numEmployees; i++) {
            System.out.println("Enter details for Employee " + (i + 1));

            System.out.print("Salary: ");
            double s = sc.nextDouble();
            System.out.print("Years of Service: ");
            double y = sc.nextDouble();

            // Validation
            if (s <= 0 || y < 0) {
                System.out.println("Invalid input. Please enter again.");
                i--; // redo this employee
                continue;
            }

            salary[i] = s;
            years[i] = y;
        }

        // Bonus Calculation
        for (int i = 0; i < numEmployees; i++) {
            if (years[i] > 5) {
                bonus[i] = salary[i] * 0.05;
            } else {
                bonus[i] = salary[i] * 0.02;
            }

            newSalary[i] = salary[i] + bonus[i];

            totalBonus += bonus[i];
            totalOldSalary += salary[i];
            totalNewSalary += newSalary[i];
        }

        // Output
        System.out.println("\n--- Company Bonus Report (Zara) ---");
        for (int i = 0; i < numEmployees; i++) {
            System.out.println("Employee " + (i + 1) + 
                               ": Old Salary = " + salary[i] + 
                               ", Bonus = " + bonus[i] + 
                               ", New Salary = " + newSalary[i]);
        }

        System.out.println("\nTotal Old Salary: " + totalOldSalary);
        System.out.println("Total Bonus Payout: " + totalBonus);
        System.out.println("Total New Salary: " + totalNewSalary);

        sc.close();
    }
}
