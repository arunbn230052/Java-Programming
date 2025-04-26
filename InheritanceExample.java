class Vehicle {
    void move() {
        System.out.println("Vehicle is moving");
    }
}
class Car extends Vehicle {
    @Override
    void move() {
        System.out.println("Car is driving");
    }
}

class Bike extends Vehicle {
    @Override
    void move() {
        System.out.println("Bike is cycling");
    }
}

public class InheritanceExample {
    public static void main(String[] args) {
        Vehicle myCar = new Car();
        Vehicle myBike = new Bike();
        myCar.move();
        myBike.move();
    }
}
