import java.util.Scanner;

public class MaxHandShakes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Get number of students
        System.out.print("Enter the number of students: ");
        int numberOfStudents = sc.nextInt();

        // Formula for maximum number of handshakes
        int maxHandshakes = (numberOfStudents * (numberOfStudents - 1)) / 2;

        // Display result
        System.out.println("Maximum number of possible handshakes: " + maxHandshakes);

        sc.close();
    }
}
