class Addition {
    public void add(int a, int b) {
        System.out.println("Sum of two integers: " + (a + b));
    }
        public void add(int a, int b, int c) {
        System.out.println("Sum of three integers: " + (a + b + c));
    }
    public void add(double a, double b) {
        System.out.println("Sum of two doubles: " + (a + b)); 
    }
    public int addDecimal(int a, int b) {
        return a + b;
    }
    public void add(String a, String b) {
        System.out.println("Concatenated String: " + a + " " + b);
    }
    public double addWithReturnType(double a, double b) {
        return a + b;
    }
}
class Fruit {
    public void info() {
        System.out.println("This is a fruit.");
    }
    public void color() {
        System.out.println("Fruit color is usually natural.");
    }
}
class Apple extends Fruit {
    @Override
    public void info() {
        System.out.println("This is an apple, a type of fruit.");
    }
    @Override
    public void color() {
        System.out.println("Apple color is typically red or green.");
    }
}
class Banana extends Fruit {
    @Override
    public void info() {
        System.out.println("This is a banana, a tropical fruit.");
    }
    @Override
    public void color() {
        System.out.println("Banana color is usually yellow when ripe.");
    }
}

public class PolyMorphismExample {
    public static void main(String[] args) {
        Addition a1 = new Addition();

        a1.add(1, 2, 3); 
        a1.add(1, 2);    
        a1.add(1.5, 2.5); 
        int result = a1.addDecimal(5, 7); 
        System.out.println("Decimal sum: " + result);
        a1.add("Hello", "World");

        Fruit f = new Apple();
        f.info(); 
        f.color();

        f = new Banana(); 
        f.info();
        f.color();
    }
}
