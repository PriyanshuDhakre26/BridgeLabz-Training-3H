import java.util.ArrayList;

class Account {
    private int accountNumber;
    private double balance;
    private Bank bank;

    public Account(int accountNumber, double balance, Bank bank) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.bank = bank;
    }

    public double getBalance() {
        return balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public Bank getBank() {
        return bank;
    }
}

class Customer {
    private String name;
    private ArrayList<Account> accounts = new ArrayList<>();

    public Customer(String name) {
        this.name = name;
    }

    public void addAccount(Account account) {
        accounts.add(account);
    }

    public void viewBalance() {
        System.out.println("Customer: " + name);
        for (Account acc : accounts) {
            System.out.println("  Account No: " + acc.getAccountNumber() +
                    " | Balance: " + acc.getBalance() +
                    " | Bank: " + acc.getBank().getBankName());
        }
    }

    public String getName() {
        return name;
    }
}

class Bank {
    private String bankName;
    private ArrayList<Customer> customers = new ArrayList<>();
    private int accountCounter = 1001;

    public Bank(String bankName) {
        this.bankName = bankName;
    }

    public void openAccount(Customer customer, double initialDeposit) {
        Account newAccount = new Account(accountCounter++, initialDeposit, this);
        customer.addAccount(newAccount);
        if (!customers.contains(customer)) {
            customers.add(customer);
        }
        System.out.println("Account opened for " + customer.getName() + " in " + bankName);
    }

    public String getBankName() {
        return bankName;
    }
}
