
class MyNewException extends Exception {
    public MyNewException(String message) {
        super(message);
    }
}
public class ExceptionHandlingExample {
    public static void validateAge(int age) throws RuntimeException {
        if (age < 20) {
            throw new RuntimeException("Not eligible for license");
        } else {
            System.out.println("Eligible for license");
        }
    }

    public static void validateCustomAge(int age) throws MyNewException {
        if (age < 20) {
            throw new MyNewException("Not a valid age");
        }
    }

    public static void main(String[] args) {
        int i = 0;
        int[] arr = {1, 2, 3, 4};

        try {
            if (i <= 0) {
                throw new RuntimeException("i must be greater than zero");
            }
            int result = 20 / i; 
            System.out.println(result);

            System.out.println(arr[5]); 

        } catch (ArithmeticException e) {
            System.err.println("Something went wrong: " + e);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("Exception: " + e);

        } catch (RuntimeException e) {
            System.err.println("Runtime Exception: " + e);
        } finally {
            System.err.println("Finally block");
            try {
                validateAge(18); 
                validateCustomAge(18); 
            } catch (MyNewException e) {
                System.out.println("Custom Exception: " + e.getMessage());
            } catch (RuntimeException e) {
                System.out.println("Runtime Exception: " + e.getMessage());
            }
        }

        System.out.println("Finished");
    }
}


