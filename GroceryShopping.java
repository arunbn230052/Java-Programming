import java.util.ArrayList;
import java.util.Scanner;

public class GroceryShopping {

    public static void main(String[] args) {
        ArrayList<String> shoppingList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n=== Grocery Shopping App ===");
            System.out.println("1. Add Item");
            System.out.println("2. Remove Item");
            System.out.println("3. Display Shopping List");
            System.out.println("4. Exit");
            System.out.print("Enter your choice (1-4): ");
            choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter item to add: ");
                    String itemToAdd = scanner.nextLine();
                    shoppingList.add(itemToAdd);
                    System.out.println(itemToAdd + " added to the shopping list.");
                    break;

                case 2:
                    System.out.print("Enter item to remove: ");
                    String itemToRemove = scanner.nextLine();
                    if (shoppingList.remove(itemToRemove)) {
                        System.out.println(itemToRemove + " removed from the shopping list.");
                    } else {
                        System.out.println(itemToRemove + " not found in the list.");
                    }
                    break;

                case 3:
                    System.out.println("\nShopping List:");
                    if (shoppingList.isEmpty()) {
                        System.out.println("Your shopping list is empty.");
                    } else {
                        for (int i = 0; i < shoppingList.size(); i++) {
                            System.out.println((i + 1) + ". " + shoppingList.get(i));
                        }
                    }
                    break;

                case 4:
                    System.out.println("Exiting the app. Happy shopping!");
                    break;

                default:
                    System.out.println("Invalid choice. Please enter 1-4.");
            }
        } while (choice != 4);

        scanner.close();
    }
}

