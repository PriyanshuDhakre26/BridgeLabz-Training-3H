import java.util.Scanner;

public class WindChillCalculator {

    public static double calculateWindChill(double temperature, double windSpeed) {
        return 35.74 + 0.6215 * temperature
                + (0.4275 * temperature - 35.75) * Math.pow(windSpeed, 0.16);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter temperature (in Fahrenheit): ");
        double temp = sc.nextDouble();

        System.out.print("Enter wind speed (in miles per hour): ");
        double windSpeed = sc.nextDouble();

        if (temp > 50 || windSpeed < 3) {
            System.out.println("Formula is valid only if temperature <= 50F and wind speed >= 3 mph.");
        } else {
            double windChill = calculateWindChill(temp, windSpeed);
            System.out.println("The wind chill temperature is: " + windChill);
        }

        sc.close();
    }
}
