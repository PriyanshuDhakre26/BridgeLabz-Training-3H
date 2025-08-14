import java.util.Scanner;

public class KMToMilesScanner {
    public static void main(String[] args) {
        // Create Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Variable to store kilometers
        double km;

        // Take user input
        System.out.print("Enter distance in kilometers: ");
        km = input.nextDouble();

        // Conversion: 1 mile = 1.6 km
        double miles = km / 1.6;

        // Output
        System.out.println("The total miles is " + miles + " mile for the given " + km + " km");

        // Close scanner
        input.close();
    }
}
