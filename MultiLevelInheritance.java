class Animal {
    public void eat() {
        System.out.println("Eating...");
    }
}

class Mammal extends Animal {
    public void walk() {
        System.out.println("Walking...");
    }
}

class Dog extends Mammal {
    public void bark() {
        System.out.println("Barking...");
    }
}

public class MultiLevelInheritance {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.eat();  
        myDog.walk();
        myDog.bark(); 
    }
}

