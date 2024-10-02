import java.util.Scanner;

public class Account {

    // Private fields for balance and ownerName
    private double balance;
    private String ownerName;
    private final int password = 1234; // Default password

    // Constructor for Account class
    public Account(String name, double balance) {
        this.ownerName = name;
        this.balance = balance;
    }
 /*   public Account(){
        ownerName = "no name";
        balance = 0;
    } */

    // Method to add an amount to the balance
    public void add(double amount) {
        if (amount > 0) {
            balance += amount;
        } else {
            System.out.println("Amount must be positive.");
        }
    }

    // Method to withdraw an amount from the balance with password verification
    public void withdraw() {
        Scanner input = new Scanner(System.in);
        int attempts = 0;
        boolean accessGranted = false;


        // Loop for password attempts
        while (attempts < 3) {
            System.out.print("Please enter the 4-digit pass: ");
            int userInput = input.nextInt();

            if (userInput == password) {
                accessGranted = true;
                break;
            } else {
                attempts++;
                if (attempts < 3) {
                    System.out.println("Incorrect password. Try again.");
                }
            }
        }

        if (accessGranted) {
            // If password is correct, process the withdrawal
            System.out.println("Please enter amount: ");
            double amount = input.nextDouble();

            if (amount > 0 && amount <= balance) {
                balance -= amount;
                System.out.println("Withdrawal successful. New balance: " + balance);
            } else {
                System.out.println("Insufficient balance or invalid amount.");
            }
        } else {
            // If the password is wrong after 3 attempts
            System.out.println("Your account has been blocked, please try again later.");
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
}