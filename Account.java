public class Account {

    // Private fields for balance and ownerName
    private double balance;
    private String ownerName;

    // Constructor for Account class
    public Account(String name, double balance) {
        this.ownerName = name;
        this.balance = balance;
    }

    // Method to add an amount to the balance
    public void add(double amount) {
        if (amount > 0) {
            balance += amount;
        } else {
            System.out.println("Amount must be positive.");
        }
    }

    // Method to withdraw an amount from the balance
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Insufficient balance or invalid amount.");
        }
    }

    // Getter for balance
    public double getBalance() {
        return balance;
    }

    // Setter for ownerName
    public void setOwnerName(String name) {
        this.ownerName = name;
    }

    // Getter for ownerName
    public String getOwnerName() {
        return ownerName;
    }

    // You can add any other methods, as needed, but ensure that they align with the intended functionality.
}