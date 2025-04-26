public class ObjectClass1 {
    
    private String brand;
    private String model;
    private int year;
    private double price;

    public ObjectClass1(String brand, String model, int year, double price) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.price = price;
    }
    public void displayInfo() {
        System.out.println("Brand: " + brand + ", Model: " + model + ", Year: " + year + ", Price: $" + price);
    }
    public static void main(String[] args) {
        ObjectClass1 car1 = new ObjectClass1("Toyota", "Camry", 2022, 25000);
        ObjectClass1 car2 = new ObjectClass1("Honda", "Civic", 2023, 23000);

        car1.displayInfo();
        car2.displayInfo();
    }
}

