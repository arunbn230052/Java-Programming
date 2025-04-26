public class ClassCar {
    String brand;
    String model;
    int year;
    double price;

    public ClassCar(String brand, String model, int year, double price) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.price = price;
    }
    public void displayDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Price: $" + price);
    }
    public static void main(String[] args) {
        ClassCar car1 = new ClassCar("Toyota", "Camry", 2022, 24000);
        ClassCar car2 = new ClassCar("Tesla", "Model 3", 2023, 35000);

        System.out.println("Car 1 Details:");
        car1.displayDetails();

        System.out.println("\nCar 2 Details:");
        car2.displayDetails();
    }
}
