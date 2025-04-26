interface Animal {
    void sound();
}
class Cat implements Animal {
    @Override
    public void sound() {
        System.out.println("Cat meows");
    }
}

class Dog implements Animal {
    @Override
    public void sound() {
        System.out.println("Dog barks");
    }
}

public class InterfacesExample {
    public static void main(String[] args) {
        Animal myCat = new Cat();
        Animal myDog = new Dog();
        myCat.sound();
        myDog.sound();
    }
}
