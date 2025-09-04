public class BookMain {
    public static void main(String[] args) {
        Book defaultBook = new Book();
        Book paramBook = new Book("1984", "George Orwell", 350.50);

        System.out.println(defaultBook);
        System.out.println(paramBook);
    }
}
