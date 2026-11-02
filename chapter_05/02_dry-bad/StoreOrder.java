public class StoreOrder {
    public double finalPrice(double amount) {
        double discount = amount > 1000 ? amount * 10 / 100 : 0;
        double afterDiscount = amount - discount;
        return afterDiscount * 118 / 100; // ...but someone forgot to update this copy (still 18%)
    }
}