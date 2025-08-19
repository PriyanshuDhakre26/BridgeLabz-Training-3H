package Array_practice.level1;
import java.util.Scanner;

public class VotingEligibility {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int[] ages = new int[10];  // array to store ages of 10 students
        
        // Taking input
        System.out.println("Enter the ages of 10 students:");
        for (int i = 0; i < ages.length; i++) {
            ages[i] = sc.nextInt();
        }
        
        // Checking voting eligibility
        for (int i = 0; i < ages.length; i++) {
            int age = ages[i];
            
            if (age < 0) {
                System.out.println("Invalid age: " + age);
            } else if (age >= 18) {
                System.out.println("The student with the age " + age + " can vote.");
            } else {
                System.out.println("The student with the age " + age + " cannot vote.");
            }
        }
        
        sc.close();
    }
}
