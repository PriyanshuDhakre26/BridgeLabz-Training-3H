public class BookMain {
    public static void main(String[] args) {
        Book.displayLibraryName();

        Book book1 = new Book("The Alchemist", "Paulo Coelho", "ISBN101");
        Book book2 = new Book("Atomic Habits", "James Clear", "ISBN102");

        book1.displayDetails();
        book2.displayDetails();
    }
}
