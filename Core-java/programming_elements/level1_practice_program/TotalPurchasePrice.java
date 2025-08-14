import java.util.Scanner;

public class TotalPurchasePrice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input unit price
        System.out.print("Enter the unit price of the item (INR): ");
        double unitPrice = sc.nextDouble();

        // Input quantity
        System.out.print("Enter the quantity to be bought: ");
        int quantity = sc.nextInt();

        // Calculate total price
        double totalPrice = unitPrice * quantity;

        // Output in required format
        System.out.println("The total purchase price is INR " + totalPrice +
                " if the quantity is " + quantity +
                " and unit price is INR " + unitPrice);

        sc.close();
    }
}
