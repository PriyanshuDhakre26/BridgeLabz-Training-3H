public class KM {
    public static void main(String[] args) {
        // Given distance in kilometers
        double kilometers = 10.8;

        // Conversion factor
        double kmToMiles = 1.6;

        // Calculate miles
        double miles = kilometers * kmToMiles;

        // Output
        System.out.println("The distance " + kilometers + " km in miles is " + miles);
    }
}
