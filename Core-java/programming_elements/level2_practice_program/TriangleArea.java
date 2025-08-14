import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take base and height input in cm
        System.out.print("Enter the base of the triangle in cm: ");
        double baseCm = input.nextDouble();

        System.out.print("Enter the height of the triangle in cm: ");
        double heightCm = input.nextDouble();

        // Area in square centimeters
        double areaSqCm = 0.5 * baseCm * heightCm;

        // Convert to square inches (1 inch = 2.54 cm → 1 sq inch = 2.54^2 cm²)
        double areaSqIn = areaSqCm / (2.54 * 2.54);

        // Output
        System.out.println("The Area of the triangle in sq in is " + areaSqIn +
                           " and sq cm is " + areaSqCm);

        input.close();
    }
}
