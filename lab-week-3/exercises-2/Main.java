public class Main {
    public static void main(String[] args) {
        // Creating an Account object
        Account myAccount = new Account("John Doe", 500.00);

        // Displaying initial balance
        System.out.println("Initial Balance: " + myAccount.getBalance());

        // Trying to withdraw with password verification
        myAccount.withdraw();
    }
}