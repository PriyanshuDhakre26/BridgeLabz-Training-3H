public class BankAccountMain {
    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount("Priyanshu", 101);
        BankAccount acc2 = new BankAccount("Ravi", 102);

        acc1.displayDetails();
        acc2.displayDetails();

        System.out.println("Total Accounts: " + BankAccount.getTotalAccounts());
    }
}
