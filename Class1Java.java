import java.util.Scanner;
public class Class1Java {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your total purchase amount: $");
        double purchaseAmount = scanner.nextDouble();
        double discount = 0.0;

        if (purchaseAmount > 500) {
            discount = 0.20;
        } else if (purchaseAmount >= 200 && purchaseAmount <= 500) {
            discount = 0.10;
        } else {
            discount = 0.0;
        }

        double discountedAmount = purchaseAmount * (1 - discount);
        System.out.printf("Total amount after discount: $%.2f%n", discountedAmount);

        scanner.close();
    }
}
