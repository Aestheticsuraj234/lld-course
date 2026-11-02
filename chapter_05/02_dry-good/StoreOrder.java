public class StoreOrder {
    private final PriceCalculator calculator = new PriceCalculator();

    public double finalPrice(double amount) {
        return calculator.finalPrice(amount);
    }
}