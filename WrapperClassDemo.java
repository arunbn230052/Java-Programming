import java.util.ArrayList;

public class WrapperClassDemo {
    public static void main(String[] args) {
        int num = 100;
        Integer newNum = num;
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(newNum);
        numbers.add(num);
        Integer numData = numbers.get(0);
        int finalData = numData;
        System.out.println("Final Data: " + finalData);
    }
}
