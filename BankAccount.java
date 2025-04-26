class BankAccount {
    private String accountName;
    private String accountHolder;
    private double balance;

    // Constructor
    public BankAccount(String accountName, String accountHolder, double balance) {
        this.accountName = accountName;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount");
        }
    }
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Invalid withdrawal amount or insufficient balance");
        }
    }
    public void displayAccountDetails() {
        System.out.println("Account Name: " + accountName);
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: " + balance);
    }
    public static void main(String[] args) {
        BankAccount account = new BankAccount("Savings Account", "Arun Prasad Patel", 1000.00);
        account.displayAccountDetails();
        account.deposit(500);
        account.withdraw(300);
        account.displayAccountDetails();
    }
}

