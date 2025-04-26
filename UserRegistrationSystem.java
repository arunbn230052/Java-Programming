import java.util.Scanner;

public class UserRegistrationSystem {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
        boolean running = true;

        System.out.println("===================================");
        System.out.println(" Welcome to the User Portal System ");
        System.out.println("===================================");
        while (running) {
            System.out.println("\nMenu:");
            System.out.println("1. Register");
            System.out.println("2. View Services");
            System.out.println("3. Exit");
            System.out.print("Enter your choice (1-3): ");

            int choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1:

                    System.out.print("\nEnter your full name: ");
                    String name = scanner.nextLine();

                    System.out.print("Enter your age: ");
                    int age = scanner.nextInt();
                    scanner.nextLine(); 

                    System.out.print("Enter your email address: ");
                    String email = scanner.nextLine();

                    System.out.println("\n--- Registration Summary ---");
                    System.out.println("Name: " + name);
                    System.out.println("Age: " + age);
                    System.out.println("Email: " + email);
                    System.out.println("Status: Successfully Registered!");
                    break;

                case 2:

                    System.out.println("\n--- Available Services ---");
                    System.out.println("1. Online Banking");
                    System.out.println("2. Appointment Booking");
                    System.out.println("3. Tech Support");
                    System.out.print("Select a service (1-3): ");
                    int serviceChoice = scanner.nextInt();
                    scanner.nextLine(); 

                    switch (serviceChoice) {
                        case 1:
                            System.out.println("You selected: Online Banking");
                            break;
                        case 2:
                            System.out.println("You selected: Appointment Booking");
                            break;
                        case 3:
                            System.out.println("You selected: Tech Support");
                            break;
                        default:
                            System.out.println("Invalid service option.");
                    }
                    break;

                case 3:
                    System.out.println("\nThank you for using the system. Goodbye!");
                    running = false;
                    break;

                default:
                    System.out.println("Invalid choice! Please select from 1 to 3.");
            }
        }

        scanner.close();
    }
}
