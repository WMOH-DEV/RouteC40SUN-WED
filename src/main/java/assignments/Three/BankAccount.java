package assignments.Three;

/**
 * This is the third assignment [BankAccount]
 * 
 * @version 1.0
 * @since 2024-06-03
 */
public class BankAccount {
    // Private data fields
    private int accountId;
    private double balance;

    // Constructor that sets the balance to a given value
    public BankAccount(int accountId, double initialBalance) {
        this.accountId = accountId;
        this.balance = initialBalance;
    }

    // No-argument constructor that sets the balance to 0
    public BankAccount() {
        this.accountId = 0;
        this.balance = 0;
    }

    // Getter for account ID
    public int getAccountId() {
        return accountId;
    }

    // Setter for account ID
    public void setAccountId(int accountId) {
        this.accountId = accountId;
    }

    // Getter for balance
    public double getBalance() {
        return balance;
    }

    // Setter for balance
    public void setBalance(double balance) {
        this.balance = balance;
    }

    // Method to withdraw an amount from the account if the balance is sufficient
    public boolean withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            return true;
        } else {
            System.out.println("Laqad Nafz Rasidakom, Yourga E3adet el Sha7n :D");
            return false;
        }
    }

    // Method to deposit an amount into the account
    public void deposit(double amount) {
        if (amount < 0.1) {
            System.out.println("la wallahi ? hanhzar ?");
            return;
        }
        balance += amount;
        System.out.println("Allah ysahlo, B2a m3ak " + amount + " L.E");
    }

    public static void main(String[] args) {
        // Testing the BankAccount class
        BankAccount account1 = new BankAccount(12345, 1000.0);
        BankAccount account2 = new BankAccount();

        // Set account ID for account2
        account2.setAccountId(67890);

        // Deposit money
        account1.deposit(500.0);
        account2.deposit(200.0);

        // Withdraw money
        account1.withdraw(300.0);
        account2.withdraw(100.0);

        // Print account details
        System.out.println("Account ID: " + account1.getAccountId() + ", Balance: " + account1.getBalance());
        System.out.println("Account ID: " + account2.getAccountId() + ", Balance: " + account2.getBalance());
    }
}
