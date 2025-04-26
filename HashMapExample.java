import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {

        HashMap<Integer, String> map = new HashMap<>();
        map.put(101, "Amar");
        map.put(102, "John");
        map.put(103, "Peter");
        map.put(104, "Peter New");

        System.out.println(map);
        System.out.println(map.get(102));
        map.remove(104);
        for (int key : map.keySet()) {
            System.out.println(map.get(key));
        }
        for (Map.Entry<Integer, String> entry : map.entrySet()) { 
            System.out.println(entry);
            System.out.println(entry.getValue());
            System.out.println(entry.getKey());
        }
        System.out.println(map.containsKey(104));
        System.out.println(map.containsValue("John"));
    }
}

