import java.util.Scanner;

class BankAccount {
    private String accountHolderName;
    private double balance;

    // Constructor to initialize a new account with an initial balance
    public BankAccount(String name, double initialBalance) {
        accountHolderName = name;
        if (initialBalance >= 1000) {
            balance = initialBalance;
        } else {
            balance = 1000; // Ensures minimum balance is Rs 1000
        }
    }

    // Method to display the balance
    public void displayBalance() {
        System.out.println("Current balance: Rs " + balance);
    }

    // Method to deposit money
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Rs " + amount + " deposited successfully.");
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    // Method to withdraw money
    public void withdraw(double amount) {
        if (amount > 0 && (balance - amount) >= 1000) {
            balance -= amount;
            System.out.println("Rs " + amount + " withdrawn successfully.");
        } else {
            System.out.println("Invalid withdraw amount or insufficient balance (min Rs 1000 must remain).");
        }
    }
}

public class BankingApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BankAccount account = null;
        boolean exit = false;

        // Menu-driven interface
        while (!exit) {
            System.out.println("\n===== Banking Application Menu =====");
            System.out.println("1. Create Account");
            System.out.println("2. Check Balance");
            System.out.println("3. Deposit");
            System.out.println("4. Withdraw");
            System.out.println("5. Exit");
            System.out.print("Select an option: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    // Create a new account
                    scanner.nextLine(); // Consume the newline character
                    System.out.print("Enter account holder name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter initial deposit amount (min Rs 1000): ");
                    double initialDeposit = scanner.nextDouble();
                    account = new BankAccount(name, initialDeposit);
                    System.out.println("Account created successfully for " + name);
                    break;

                case 2:
                    // Check balance
                    if (account != null) {
                        account.displayBalance();
                    } else {
                        System.out.println("No account found. Please create an account first.");
                    }
                    break;

                case 3:
                    // Deposit money
                    if (account != null) {
                        System.out.print("Enter deposit amount: ");
                        double depositAmount = scanner.nextDouble();
                        account.deposit(depositAmount);
                    } else {
                        System.out.println("No account found. Please create an account first.");
                    }
                    break;

                case 4:
                    // Withdraw money
                    if (account != null) {
                        System.out.print("Enter withdrawal amount: ");
                        double withdrawAmount = scanner.nextDouble();
                        account.withdraw(withdrawAmount);
                    } else {
                        System.out.println("No account found. Please create an account first.");
                    }
                    break;

                case 5:
                    // Exit the application
                    exit = true;
                    System.out.println("Exiting the application.");
                    break;

                default:
                    System.out.println("Invalid option! Please select a valid option.");
                    break;
            }
        }

        scanner.close();
    }
}
