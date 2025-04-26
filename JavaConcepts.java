// Interface
interface Vehicle {
    void start();
    void stop();
}

// Abstract class
abstract class Animal {
    public abstract void sound();
    public void sleep() {
        System.out.println("The animal is sleeping.");
    }
}

// Concrete class implementing Vehicle interface
class Car implements Vehicle {
    public void start() {
        System.out.println("The car is starting.");
    }
        public void stop() {
        System.out.println("The car is stopping.");
    }
}

// Concrete class extending Animal class
class Dog extends Animal {
    public void sound() {
        System.out.println("The dog barks.");
    }
}

// Main class with method overloading and examples
public class JavaConcepts {
    public static void main(String[] args) {
        // Method Overloading Example
        System.out.println("Method Overloading Example:");
        System.out.println("Sum of integers: " + add(10, 20));
        System.out.println("Sum of doubles: " + add(10.5, 20.3));
        System.out.println("Concatenated strings: " + add("Hello, ", "World!"));

        // Abstract Class and Method Example
        System.out.println("\nAbstract Class and Method Example:");
        Animal myDog = new Dog();
        myDog.sound();
        myDog.sleep();

        // Interface Example
        System.out.println("\nInterface Example:");
        Vehicle myCar = new Car();
        myCar.start();
        myCar.stop();
    }

    // Method Overloading
    public static int add(int a, int b) {
        return a + b;
    }

    public static double add(double a, double b) {
        return a + b;
    }

    public static String add(String a, String b) {
        return a + b;
    }
}

