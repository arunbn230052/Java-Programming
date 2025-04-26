
import java.util.Arrays;
import java.util.List;

class Product {
    String name;
    double price;

    Product(String name, double price) {
        this.name = name;
        this.price = price;
    }
}

public class LambdaExamplePrice {
    public static void main(String[] args) {
        List<Product> products = Arrays.asList(
            new Product("Pen", 1.5),
            new Product("Notebook", 2.0),
            new Product("Pencil", 0.5)
        );

    
        double totalPrice = products.stream()
                                    .map(product -> product.price)
                                    .reduce(0.0, Double::sum);

        System.out.println("Total Price: " + totalPrice);
    }
}

    
