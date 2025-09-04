public class VehicleMain {
    public static void main(String[] args) {
        Vehicle v1 = new Vehicle("Alice", "Car");
        Vehicle v2 = new Vehicle("Bob", "Bike");
        Vehicle v3 = new Vehicle("Charlie", "Truck");

        System.out.println("Before updating registration fee:");
        v1.displayVehicleDetails();
        v2.displayVehicleDetails();
        v3.displayVehicleDetails();

        Vehicle.updateRegistrationFee(7500.0);

        System.out.println("\nAfter updating registration fee:");
        v1.displayVehicleDetails();
        v2.displayVehicleDetails();
        v3.displayVehicleDetails();
    }
}
