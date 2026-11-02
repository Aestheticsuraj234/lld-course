public class DryBadMain {
    public static void main(String[] args) {
        // Same cart, same Rs.2000, two different prices. A bug born from copy-paste.
        System.out.println("Online price: Rs." + new OnlineOrder().finalPrice(2000));
        System.out.println("Store price:  Rs." + new StoreOrder().finalPrice(2000));
    }
}
