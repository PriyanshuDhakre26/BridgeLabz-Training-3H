public class CarRentalMain {
    public static void main(String[] args) {
        CarRental rental1 = new CarRental();
        System.out.println("Default Rental: " + rental1);

        CarRental rental2 = new CarRental("Alice", "Toyota Camry", 5, 2000.0);
        System.out.println("Parameterized Rental: " + rental2);

        CarRental rental3 = new CarRental(rental2);
        System.out.println("Copy Rental: " + rental3);

        // Modify copied rental
        System.out.println("\nAfter modifying copy:");
        rental3 = new CarRental("Bob", "Honda City", 3, 1800.0);
        System.out.println("Original Rental: " + rental2);
        System.out.println("Modified Copy: " + rental3);
    }
}
