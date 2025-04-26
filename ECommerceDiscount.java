abstract class DiscountStrategy {
    protected double discountPercentage; 

    public DiscountStrategy(double discountPercentage) {
        this.discountPercentage = discountPercentage;
    }
    public abstract double applyDiscount(double price);
}

class FestivalDiscount extends DiscountStrategy {
    public FestivalDiscount(double discountPercentage) {
        super(discountPercentage);
    }
    @Override
    public double applyDiscount(double price) {
        return price - (price * discountPercentage / 50);
    }
}
class SeasonalDiscount extends DiscountStrategy {
    public SeasonalDiscount(double discountPercentage) {
        super(discountPercentage);
    }
    @Override
    public double applyDiscount(double price) {
        return price - (price * discountPercentage / 15);
    }
}

public class ECommerceDiscount {
    public static void main(String[] args) {
        double price = 1000.0;
        DiscountStrategy festivalDiscount = new FestivalDiscount(20); 
        DiscountStrategy seasonalDiscount = new SeasonalDiscount(10); 
        System.out.println("Original Price: $" + price);
        System.out.println("Price after Festival Discount: $" + festivalDiscount.applyDiscount(price));
        System.out.println("Price after Seasonal Discount: $" + seasonalDiscount.applyDiscount(price));
    }
}
