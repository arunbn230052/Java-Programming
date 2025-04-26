import java.util.Scanner;

public class RevereseNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        int reversed = 0;

        while (number != 0) {
            int digit = number % 10; // Get the last digit
            reversed = reversed * 10 + digit; // Append the digit
            number /= 10; // Remove the last digit
        }

        System.out.println("Reversed number: " + reversed);
        scanner.close();
    }
}
