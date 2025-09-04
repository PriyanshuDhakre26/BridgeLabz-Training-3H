public class LibraryBook {
    private String title;
    private String author;
    private double price;
    private boolean available;

    public LibraryBook(String title, String author, double price, boolean available) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.available = available;
    }

    public boolean borrowBook() {
        if (available) {
            available = false;
            return true;
        } else {
            return false;
        }
    }

    public String getTitle() {
        return title;
    }

    public boolean isAvailable() {
        return available;
    }

    @Override
    public String toString() {
        return "Book{title='" + title + "', author='" + author + "', price=" + price +
                ", available=" + available + "}";
    }
}
