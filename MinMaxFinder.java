public class MinMaxFinder {
    public static void main(String[] args) {
        int[] numbers = {5, 12, 3, 19, 8, 2};
        
        int min = numbers[0];
        int max = numbers[0];
        
        for (int num : numbers) {
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
        }
        
        System.out.println("Maximum: " + max);
        System.out.println("Minimum: " + min);
    }
}

