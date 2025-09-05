public class ProductMain {
    public static void main(String[] args) {
        Product prod1 = new Product("Laptop", 50000, 1, 101);
        Product prod2 = new Product("Headphones", 2000, 2, 102);

        prod1.displayDetails();
        prod2.displayDetails();

        Product.updateDiscount(10);

        prod1.displayDetails();
        prod2.displayDetails();
    }
}
