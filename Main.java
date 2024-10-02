public class Main {
    public static void main(String[] args) {
        // Creating an Account object
        Account myAccount = new Account("John Doe", 500.00);

        // Display initial details
        System.out.println("Account Owner: " + myAccount.getOwnerName());
        System.out.println("Initial Balance: " + myAccount.getBalance());

        // Adding money to the account
        myAccount.add(200);
        System.out.println("Balance after adding 200: " + myAccount.getBalance());

        // Withdrawing money from the account
        myAccount.withdraw(150);
        System.out.println("Balance after withdrawing 150: " + myAccount.getBalance());

        // Updating the owner's name
        myAccount.setOwnerName("Jane Doe");
        System.out.println("Updated Account Owner: " + myAccount.getOwnerName());
    }
}