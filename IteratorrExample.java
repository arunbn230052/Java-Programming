import java.util.ArrayList;
import java.util.Iterator;

public class IteratorrExample {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();

        names.add("Bob");
        names.add("Hari");
        names.add("Shyam");
        names.add("Peter");

        Iterator<String> newArray = names.iterator();
        while (newArray.hasNext()) {
            String name = newArray.next();
            System.out.println("name = " + name);

            if (name.equals("Hari")) {
                newArray.remove(); 
            }
        }

        System.out.println("\nUpdated names list: " + names);
    }
}

