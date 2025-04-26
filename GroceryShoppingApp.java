import java.util.ArrayList;
import java.util.Scanner;

public class GroceryShoppingApp {
    public static void main(String[] args) {
        ArrayList<String> shoppingList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nGrocery Shopping List");
            System.out.println("1. Add an item");
            System.out.println("2. Remove an item");
            System.out.println("3. Display all items");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter item to add: ");
                    String item = scanner.nextLine();
                    shoppingList.add(item);
                    System.out.println(item + " added to the shopping list.");
                    break;

                case 2:
                    System.out.print("Enter item to remove: ");
                    String removeItem = scanner.nextLine();
                    if (shoppingList.remove(removeItem)) {
                        System.out.println(removeItem + " removed from the list.");
                    } else {
                        System.out.println("Item not found in the list.");
                    }
                    break;

                case 3:
                    System.out.println("Shopping List:");
                    if (shoppingList.isEmpty()) {
                        System.out.println("Your shopping list is empty.");
                    } else {
                        for (int i = 0; i < shoppingList.size(); i++) {
                            System.out.println((i + 1) + ". " + shoppingList.get(i));
                        }
                    }
                    break;

                case 4:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice! Please enter a number between 1 and 4.");
            }
        } while (choice != 4);

        scanner.close();
    }
}


