import java.util.Scanner;
public class Switch1Case {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter HTTP status code: ");
        int statusCode = scanner.nextInt();

        switch (statusCode) {
            case 200:
                System.out.println("Ok");
                break;
            case 404:
                System.out.println("Not found");
                break;
            case 500:
                System.out.println("Internal server error");
                break;
            default:
                System.out.println("Unknown status");
                break;
        }

        scanner.close();
    }
}
