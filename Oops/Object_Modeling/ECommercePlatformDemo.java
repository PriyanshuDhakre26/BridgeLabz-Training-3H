import java.util.ArrayList;

class Product {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}

class Order {
    private int orderId;
    private ArrayList<Product> products;
    private Customer customer;

    public Order(int orderId, Customer customer) {
        this.orderId = orderId;
        this.customer = customer;
        this.products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public double calculateTotal() {
        double sum = 0;
        for (Product p : products) {
            sum += p.getPrice();
        }
        return sum;
    }

    public void showOrderDetails() {
        System.out.println("Order ID: " + orderId + " | Customer: " + customer.getName());
        for (Product p : products) {
            System.out.println("  Product: " + p.getName() + " | Price: " + p.getPrice());
        }
        System.out.println("  Total: " + calculateTotal());
    }
}

class Customer {
    private String name;
    private ArrayList<Order> orders;

    public Customer(String name) {
        this.name = name;
        this.orders = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void placeOrder(Order order) {
        orders.add(order);
    }

    public void showAllOrders() {
        System.out.println("Customer: " + name + " has placed " + orders.size() + " orders.");
        for (Order o : orders) {
            o.showOrderDetails();
        }
    }
}

public class ECommercePlatformDemo {
    public static void main(String[] args) {
        Product p1 = new Product("Laptop", 60000);
        Product p2 = new Product("Headphones", 2000);
        Product p3 = new Product("Smartphone", 25000);

        Customer c1 = new Customer("Alice");
        Customer c2 = new Customer("Bob");

        Order o1 = new Order(101, c1);
        o1.addProduct(p1);
        o1.addProduct(p2);

        Order o2 = new Order(102, c1);
        o2.addProduct(p3);

        Order o3 = new Order(103, c2);
        o3.addProduct(p2);

        c1.placeOrder(o1);
        c1.placeOrder(o2);
        c2.placeOrder(o3);

        c1.showAllOrders();
        System.out.println();
        c2.showAllOrders();
    }
}
