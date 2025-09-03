public class CartItem {
    String itemName;
    double price;
    int quantity;

    public CartItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    public void addItem(int qty) {
        quantity += qty;
        System.out.println(qty + " " + itemName + "(s) added to cart.");
    }

    public void removeItem(int qty) {
        if (qty <= quantity) {
            quantity -= qty;
            System.out.println(qty + " " + itemName + "(s) removed from cart.");
        } else {
            System.out.println("Cannot remove more than present in cart.");
        }
    }

    public double getTotalCost() {
        return price * quantity;
    }

    public void displayItem() {
        System.out.println("Item: " + itemName + ", Price: " + price +
                ", Quantity: " + quantity +
                ", Subtotal: " + getTotalCost());
    }
}
