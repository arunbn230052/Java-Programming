class Vehicle {
    String brandName;
    int maxSpeed;
    
    Vehicle(String brandName, int maxSpeed) {
        this.brandName = brandName;
        this.maxSpeed = maxSpeed;
    }
    
    public void displayInfo() {
        System.out.println("Brand Name: " + brandName);
        System.out.println("Max Speed: " + maxSpeed);
    }
}

class Car extends Vehicle {
    int noOfDoors;
    
    Car(String brandName, int maxSpeed, int noOfDoors) {
        super(brandName, maxSpeed);
        this.noOfDoors = noOfDoors;
    }
    
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("No. of Doors: " + noOfDoors);
    }
}

class Bike extends Vehicle {
    String handlebarType;
    
    Bike(String brandName, int maxSpeed, String handlebarType) {
        super(brandName, maxSpeed);
        this.handlebarType = handlebarType;
    }
    
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Handlebar Type: " + handlebarType);
    }
}

public class VehicleManagement {
    public static void main(String[] args) {
        Bike b1 = new Bike("Hero", 200, "Sport");
        b1.displayInfo();
    }
}