enum Car {
    TESLA(50000), TOYOTA(20000), FORD(25000);
    private int price;
    Car(int price) {
        this.price = price;
    }
    public int getPrice() {
        return this.price;
    }
}

public class EnumWithFieldsExample {
    public static void main(String[] args) {

        Car tesla = Car.TESLA;
        System.out.println("The price of " + tesla + " is $" + tesla.getPrice());

        Car toyota = Car.TOYOTA;
        System.out.println("The price of " + toyota + " is $" + toyota.getPrice());

        Car ford = Car.FORD;
        System.out.println("The price of " + ford + " is $" + ford.getPrice());
    }
}

