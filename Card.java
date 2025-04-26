import java.util.Scanner;

public class Card {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double balance = 1000.0;

        while (balance > 0) {
            System.out.println("Current balance: $" + balance);
            System.out.print("Enter amount to withdraw: ");
            double withdrawAmount = scanner.nextDouble();

            if (withdrawAmount > balance) {
                System.out.println("Insufficient funds.");
            } else if (withdrawAmount <= 0) {
                System.out.println("Invalid amount. Please enter a positive number.");
            } else {
                balance -= withdrawAmount;
                System.out.println("Withdrawal successful! Remaining balance: $" + balance);
            }
        }

        System.out.println("Your account balance is zero. You're now broke.");
        scanner.close();
    }
}
