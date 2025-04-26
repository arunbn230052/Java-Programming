public class ExceptionHandle {
    public static void main(String[] args) {
        int i = 0;

        try {
            int result = 20 / i;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero.");
        }

        System.out.println("Finisher");
    }
}
