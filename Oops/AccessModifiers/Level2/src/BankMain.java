public class BankMain {
    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount(1001, "Alice", 5000.0);
        acc1.displayAccountDetails();
        acc1.deposit(2000);
        acc1.withdraw(1500);
        acc1.displayAccountDetails();

        System.out.println();

        SavingsAccount sAcc = new SavingsAccount(2001, "Bob", 10000.0, 4.5);
        sAcc.displayAccountDetails();
        sAcc.displaySavingsDetails();
        sAcc.deposit(3000);
        sAcc.withdraw(2000);
        sAcc.displayAccountDetails();
    }
}
