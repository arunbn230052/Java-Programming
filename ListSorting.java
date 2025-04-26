import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListSorting {
    public static void main(String[] args) {
        List<Integer> numberList = new ArrayList<>();
        numberList.add(5);
        numberList.add(1);
        numberList.add(10);
        numberList.add(3);
        numberList.add(7);

        System.out.println("Original Integer List: " + numberList);
        Collections.sort(numberList);
        System.out.println("Sorted Integer List: " + numberList);

        List<String> nameList = new ArrayList<>();
        nameList.add("Charlie");
        nameList.add("Alice");
        nameList.add("Eve");
        nameList.add("Bob");

        System.out.println("\nOriginal String List: " + nameList);
        Collections.sort(nameList);
        System.out.println("Sorted String List: " + nameList);
    }
}

