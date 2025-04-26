interface Calculation {
    int calculation(int a, int b);
}

public class LambdaExpressionDemo {
    public static void main(String[] args) {
        Calculation add = (a, b) -> a + b;
        Calculation subtract = (a, b) -> a - b;
        Calculation multiply = (a, b) -> a * b;
        Calculation divide = (a, b) -> {
            if (b == 0) {
                System.out.println("Error: Division by zero");
                return 0;
            }
            return a / b;
        };
        Calculation modulo = (a, b) -> {
            if (b == 0) {
                System.out.println("Error: Modulo by zero");
                return 0;
            }
            return a % b;
        };

        int x = 20;
        int y = 5;
        System.out.println("Operands: x = " + x + ", y = " + y);
        System.out.println("----------------------------");
        System.out.println("Addition        = " + add.calculation(x, y));
        System.out.println("Subtraction     = " + subtract.calculation(x, y));
        System.out.println("Multiplication  = " + multiply.calculation(x, y));
        System.out.println("Division        = " + divide.calculation(x, y));
        System.out.println("Modulo          = " + modulo.calculation(x, y));
        int a = 10;
        int b = 0;
        System.out.println("\nAttempting division by zero...");
        System.out.println("Division        = " + divide.calculation(a, b));
        System.out.println("Modulo          = " + modulo.calculation(a, b));
    }
}
