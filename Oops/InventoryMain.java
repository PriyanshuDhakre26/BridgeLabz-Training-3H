public class InventoryMain {
    public static void main(String[] args) {
        Item item1 = new Item(101, "Laptop", 50000);
        Item item2 = new Item(102, "Headphones", 2000);

        item1.displayItem();
        System.out.println("Total Cost for 2 units: " + item1.calculateTotalCost(2));
        System.out.println("-------------------------");

        item2.displayItem();
        System.out.println("Total Cost for 5 units: " + item2.calculateTotalCost(5));
        System.out.println("-------------------------");
    }
}
