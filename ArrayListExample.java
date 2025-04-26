import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);

        System.out.println("Initial List: " + numbers);
        for (int i = 1; i <= 20; i++) {
            numbers.add(i);
        }

        System.out.println("List after adding 1 to 20: " + numbers);
        System.out.println("First Element: " + numbers.get(0));
        System.out.println("Second Element: " + numbers.get(1));
        numbers.set(0, 100);
        numbers.remove(3);

        System.out.println("List after update and removal: " + numbers);
        System.out.println("All Elements:");
        for (Integer number : numbers) {
            System.out.println(number);
        }
    }
}

