// 19. Write a program declaring a Java class called SavingsAccount with members ``accountNumber`` and ``Balance``. Provide member functions as ``depositAmount ()`` and ``withdrawAmount ()``. If user tries to withdraw an amount greater than their balance then throw a user-defined exception.

import java.util.Scanner;

class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String message) {
        super(message);
    }
}

class SavingsAccount {
    private String accountNumber;
    private double balance;

    public SavingsAccount(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    public void depositAmount(double amount) {
        balance += amount;
        System.out.println("Amount deposited successfully. Updated balance: " + balance);
    }

    public void withdrawAmount(double amount) throws InsufficientBalanceException {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Amount withdrawn successfully. Updated balance: " + balance);
        } else {
            throw new InsufficientBalanceException("Insufficient balance. Withdrawal failed.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter account number: ");
        String accountNumber = scanner.nextLine();

        System.out.print("Enter initial balance: ");
        double initialBalance = scanner.nextDouble();

        SavingsAccount account = new SavingsAccount(accountNumber, initialBalance);

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter amount to deposit: ");
                    double depositAmount = scanner.nextDouble();
                    account.depositAmount(depositAmount);
                    break;
                case 2:
                    System.out.print("Enter amount to withdraw: ");
                    double withdrawAmount = scanner.nextDouble();
                    try {
                        account.withdrawAmount(withdrawAmount);
                    } catch (InsufficientBalanceException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 3:
                    System.out.println("Exiting program. Goodbye!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
    }
}
