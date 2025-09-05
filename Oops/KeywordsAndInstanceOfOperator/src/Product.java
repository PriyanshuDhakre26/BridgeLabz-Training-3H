public class Product {
    static double discount = 5.0;
    private String productName;
    private double price;
    private int quantity;
    private final int productID;

    public Product(String productName, double price, int quantity, int productID) {
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
        this.productID = productID;
    }

    public static void updateDiscount(double newDiscount) {
        discount = newDiscount;
        System.out.println("Discount updated to: " + discount + "%");
    }

    public void displayDetails() {
        if (this instanceof Product) {
            double total = price * quantity;
            double discountedTotal = total - (total * discount / 100);
            System.out.println("Product ID: " + this.productID);
            System.out.println("Product Name: " + this.productName);
            System.out.println("Price: " + this.price);
            System.out.println("Quantity: " + this.quantity);
            System.out.println("Total Price: " + total);
            System.out.println("Price after Discount: " + discountedTotal);
        }
    }
}
