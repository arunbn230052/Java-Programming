import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {
    public static void main(String[] args) {
        HashSet<Integer> nums = new HashSet<>();
        nums.add(10);
        nums.add(20);
        nums.add(30);
        nums.add(40);
        nums.add(50);

        System.out.println("Initial HashSet: " + nums);
        System.out.println("\nTrying to add duplicate elements...");
        boolean added = nums.add(20);  // Already exists
        System.out.println("Was 20 added again? " + added);

        added = nums.add(60);
        System.out.println("Was 60 added? " + added);
        System.out.println("\nIterating through HashSet (Enhanced for loop):");
        for (int num : nums) {
            System.out.println(num);
        }
        System.out.println("\nIterating through HashSet (Iterator):");
        Iterator<Integer> iterator = nums.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        int valueToCheck = 30;
        System.out.println("\nDoes the set contain " + valueToCheck + "? " + nums.contains(valueToCheck));
        System.out.println("\nRemoving 40 from the set...");
        nums.remove(40);
        System.out.println("Updated HashSet: " + nums);
        System.out.println("\nSize of HashSet: " + nums.size());
        System.out.println("\nClearing the entire HashSet...");
        nums.clear();
        System.out.println("Is the HashSet empty? " + nums.isEmpty());
    }
}


