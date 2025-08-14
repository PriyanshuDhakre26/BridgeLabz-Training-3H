import java.util.Scanner;

public class HeightConverter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take height input in centimeters
        System.out.print("Enter your height in centimeters: ");
        double heightCm = input.nextDouble();

        // Conversion factors
        double inchPerCm = 1 / 2.54; // 1 inch = 2.54 cm
        double totalInches = heightCm * inchPerCm;
        double feet = totalInches / 12; // 1 foot = 12 inches

        // Extract whole feet and remaining inches
        int feetPart = (int) feet;
        double inchesPart = totalInches - (feetPart * 12);

        // Output
        System.out.println("Your Height in cm is " + heightCm +
                           " while in feet is " + feetPart +
                           " and inches is " + String.format("%.2f", inchesPart));

        input.close();
    }
}
