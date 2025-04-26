import java.util.Scanner;
public class SwitchCase {
    public static void main(String[] args) {
        System.out.println("Enter 1 for +");
        System.out.println("Enter 2 for -");
        System.out.println("Enter 3 for *");
        System.out.println("Enter 4 for /");

        Scanner sc = new Scanner(System.in);

        System.out.print("Choose an option: ");
        int option = sc.nextInt();

        System.out.print("Enter first value: ");
        int fval = sc.nextInt();

        System.out.print("Enter second value: ");
        int sval = sc.nextInt();

        switch (option) {
            case 1 -> System.out.println("Sum = " + (fval + sval));
            case 2 -> System.out.println("Difference = " + (fval - sval));
            case 3 -> System.out.println("Multiplication = " + (fval * sval));
            case 4 -> {
                if (sval != 0) {
                    System.out.println("Division = " + (fval / sval));
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                }
            }
            default -> System.out.println("Invalid option. Please choose a valid operation.");
        }

        sc.close();
    }
}
