import java.util.Scanner;
public class Password {
    public static void main(String[] args) {
        final String CORRECT_PASSWORD = "12345";  
        final int MAX_ATTEMPTS = 3;
        int attempts = 0;
        boolean authenticated = false;
        Scanner scanner = new Scanner(System.in);
    
        while (attempts < MAX_ATTEMPTS && !authenticated) {
            System.out.print("Enter password (" + (MAX_ATTEMPTS - attempts) + " attempts remaining): ");
            String input = scanner.nextLine();
            
            if (input.equals(CORRECT_PASSWORD)) {
                authenticated = true;
            } else {
                System.out.println("Incorrect password. Please try again.\n");
                attempts++;
            }
        }
        
        scanner.close();
        
        if (authenticated) {
            System.out.println("\nAuthentication successful! Welcome.");
        } else {
            System.out.println("\nAccount locked. Too many failed attempts.");
        }
    }
}
