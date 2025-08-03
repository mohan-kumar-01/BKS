package BKS;

import java.util.Scanner;

public class BankSimulator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Bank Account Simulator!");
        System.out.print("Enter account owner name: ");
        String name = scanner.nextLine();

        BankAccount account = new BankAccount(name, 0.0);

        int choice;
        do {
            System.out.println("\n===== Menu =====");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Show Account Details");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");

            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter deposit amount: ");
                    double depAmount = scanner.nextDouble();
                    account.deposit(depAmount);
                    break;
                case 2:
                    System.out.print("Enter withdrawal amount: ");
                    double withAmount = scanner.nextDouble();
                    account.withdraw(withAmount);
                    break;
                case 3:
                    System.out.println("Current balance: $" + account.getBalance());
                    break;
                case 4:
                    account.showDetails();
                    break;
                case 5:
                    System.out.println("Thank you for using the simulator. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid option. Try again.");
            }

        } while (choice != 5);

        scanner.close();
    }
}
