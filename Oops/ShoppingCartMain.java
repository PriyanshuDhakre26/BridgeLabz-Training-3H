public class ShoppingCartMain {
    public static void main(String[] args) {
        CartItem item1 = new CartItem("Laptop", 50000, 1);
        CartItem item2 = new CartItem("Headphones", 2000, 2);

        item1.displayItem();
        item2.displayItem();
        System.out.println("Total Cart Cost: " + (item1.getTotalCost() + item2.getTotalCost()));
        System.out.println("---------------------------");

        item1.addItem(1);
        item1.displayItem();
        System.out.println("Total Cart Cost: " + (item1.getTotalCost() + item2.getTotalCost()));
        System.out.println("---------------------------");

        item2.removeItem(1);
        item2.displayItem();
        System.out.println("Total Cart Cost: " + (item1.getTotalCost() + item2.getTotalCost()));
    }
}
