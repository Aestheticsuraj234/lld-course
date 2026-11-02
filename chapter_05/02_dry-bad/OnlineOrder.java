public class OnlineOrder {
    public double finalPrice(double amount) {
        double discount = amount > 1000 ? amount * 10 / 100 : 0;
        double afterDiscount = amount - discount;
        return afterDiscount * 112 / 100; // GST was updated to 12% here...
    }
}