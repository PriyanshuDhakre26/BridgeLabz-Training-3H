public class HotelBookingMain {
    public static void main(String[] args) {
        HotelBooking booking1 = new HotelBooking();
        System.out.println("Default Booking: " + booking1);

        HotelBooking booking2 = new HotelBooking("Alice", "Deluxe", 3);
        System.out.println("Parameterized Booking: " + booking2);

        HotelBooking booking3 = new HotelBooking(booking2);
        System.out.println("Copy Booking: " + booking3);

        // Modifying copy to check independence
        booking3.setGuestName("Bob");
        booking3.setRoomType("Suite");
        booking3.setNights(5);

        System.out.println("\nAfter modifying copied booking:");
        System.out.println("Original Booking: " + booking2);
        System.out.println("Copied Booking: " + booking3);
    }
}
