public class ProductMain {
    public static void main(String[] args) {
        Product p1 = new Product("Laptop", 55000.0);
        Product p2 = new Product("Smartphone", 30000.0);
        Product p3 = new Product("Headphones", 2500.0);

        p1.displayProductDetails();
        p2.displayProductDetails();
        p3.displayProductDetails();

        Product.displayTotalProducts();
    }
}
