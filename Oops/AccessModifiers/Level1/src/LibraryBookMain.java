public class LibraryBookMain {
    public static void main(String[] args) {
        LibraryBook book1 = new LibraryBook("The Alchemist", "Paulo Coelho", 299.99, true);
        LibraryBook book2 = new LibraryBook("1984", "George Orwell", 349.50, false);

        System.out.println(book1);
        System.out.println(book2);

        System.out.println("\nBorrowing '" + book1.getTitle() + "':");
        if (book1.borrowBook()) {
            System.out.println("Successfully borrowed!");
        } else {
            System.out.println("Book is not available.");
        }

        System.out.println("\nBorrowing '" + book2.getTitle() + "':");
        if (book2.borrowBook()) {
            System.out.println("Successfully borrowed!");
        } else {
            System.out.println("Book is not available.");
        }

        System.out.println("\nUpdated Book Details:");
        System.out.println(book1);
        System.out.println(book2);
    }
}
