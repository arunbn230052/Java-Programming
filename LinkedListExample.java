import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        LinkedList<Integer> newList = new LinkedList<>();

        newList.add(10);
        newList.add(20);
        newList.add(30);
        list.addAll(newList);

        list.add(1);
        list.add(2);
        list.add(3);
        list.addLast(100);
        System.out.println("Element at index 1: " + list.get(1));

        list.remove(1);

        list.removeFirst();
        list.removeLast();

        System.out.println("Final LinkedList:");
        for (int item : list) {
            System.out.println(item);
        }
    }
}
