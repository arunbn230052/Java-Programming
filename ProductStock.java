import java.util.HashMap;
import java.util.Map;

public class ProductStock {
    public static void main(String[] args) {
        HashMap<String, Integer> stock = new HashMap<>();
        stock.put("Apple", 50);
        stock.put("Banana", 30);
        stock.put("Milk", 20);
        stock.put("Bread", 15);
        stock.put("Eggs", 100);

        String product = "Milk";
        if (stock.containsKey(product)) {
            System.out.println("Stock for " + product + ": " + stock.get(product) + " units");
        } else {
            System.out.println("Product not found in stock.");
        }
        stock.put("Banana", stock.get("Banana") + 10); // restock 10 bananas

        stock.remove("Bread");

        System.out.println("\nCurrent Product Stock:");
        for (Map.Entry<String, Integer> entry : stock.entrySet()) {
            System.out.println("Product: " + entry.getKey() + " => Stock: " + entry.getValue());
        }
    }
}

