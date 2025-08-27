import java.util.Scanner;

public class RailwayReservation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean bookingOpen = true;

        System.out.println("=== Welcome to Railway Reservation System ===");

        do {
            System.out.println("\nSelect Train:");
            System.out.println("1. Express - Rs 500");
            System.out.println("2. Superfast - Rs 800");
            System.out.println("3. AC Special - Rs 1200");
            System.out.print("Enter choice: ");
            int trainChoice = sc.nextInt();

            int capacity = 5, booked = 0, waiting = 0;
            double fare = 0;

            switch (trainChoice) {
                case 1: fare = 500; break;
                case 2: fare = 800; break;
                case 3: fare = 1200; break;
                default: fare = 500;
            }

            System.out.print("Enter number of passengers to book: ");
            int passengers = sc.nextInt();

            for (int i = 1; i <= passengers; i++) {
                if (booked < capacity) {
                    booked++;
                    System.out.println("Passenger " + i + " booked seat. Fare = Rs " + fare);
                } else {
                    waiting++;
                    System.out.println("Passenger " + i + " on waiting list.");
                }
            }

            System.out.println("Total booked = " + booked + ", Waiting = " + waiting);

            while (booked >= capacity) {
                System.out.println("Train is full. No more bookings allowed.");
                break;
            }

            System.out.print("\nDo you want to make another booking? (yes/no): ");
            String choice = sc.next();
            if (choice.equalsIgnoreCase("no")) bookingOpen = false;

        } while (bookingOpen);

        System.out.println("\n=== Reservation Closed ===");
        sc.close();
    }
}
