public class ProductClass {
    private String name;
    private double price;
    private int stockQuantity;

    public ProductClass(String name, double price, int stockQuantity) {
        this.name = name;
        this.price = price;
        this.stockQuantity = stockQuantity;
    }
    public void updateStock(int quantity) {
        if (quantity > stockQuantity) {
            System.out.println("Insufficient stock available!");
        } else {
            stockQuantity -= quantity;
            System.out.println("Stock updated successfully!");
        }
    }
    public void displayProduct() {
        System.out.println("Product Name: " + name);
        System.out.println("Price: $" + price);
        System.out.println("Stock Quantity: " + stockQuantity);
    }

    public static void main(String[] args) {
        ProductClass laptop = new ProductClass("Laptop", 999.99, 10);
        System.out.println("Initial Product Details:");
        laptop.displayProduct();
        laptop.updateStock(3);
        System.out.println("\nUpdated Product Details:");
        laptop.displayProduct();
    }
}