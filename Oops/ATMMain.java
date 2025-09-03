public class ATMMain {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("Priyanshu", 12345, 10000);

        account.displayBalance();

        account.deposit(5000);
        account.displayBalance();

        account.withdraw(3000);
        account.displayBalance();

        account.withdraw(15000); // Trying to withdraw more than balance
        account.displayBalance();
    }
}
