// The ONE place where pricing rules live
public class PriceCalculator {
    private static final int GST_PERCENT = 12;
    private static final int DISCOUNT_PERCENT = 10;
    private static final double DISCOUNT_ABOVE = 1000;

    public double finalPrice(double amount) {
        double discount = amount > DISCOUNT_ABOVE ? amount * DISCOUNT_PERCENT / 100 : 0;
        return (amount - discount) * (100 + GST_PERCENT) / 100;
    }
}