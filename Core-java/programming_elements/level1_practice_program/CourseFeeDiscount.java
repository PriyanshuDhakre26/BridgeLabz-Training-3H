public class CourseFeeDiscount {
    public static void main(String[] args) {
        // Given data
        double fee = 125000;
        double discountPercent = 10;

        // Calculate discount amount
        double discount = (fee * discountPercent) / 100;

        // Calculate final fee
        double finalFee = fee - discount;

        // Output
        System.out.println("The discount amount is INR " + discount +
                           " and final discounted fee is INR " + finalFee);
    }
}
