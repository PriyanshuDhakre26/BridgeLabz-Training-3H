public class BankAssociationDemo {
    public static void main(String[] args) {
        Bank bank1 = new Bank("State Bank");
        Bank bank2 = new Bank("HDFC Bank");

        Customer c1 = new Customer("Alice");
        Customer c2 = new Customer("Bob");

        bank1.openAccount(c1, 5000);
        bank1.openAccount(c2, 8000);
        bank2.openAccount(c1, 12000);

        c1.viewBalance();
        c2.viewBalance();
    }
}
