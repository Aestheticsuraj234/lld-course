public class Main {
     public static void main(String[] args) {
        OrderFacade shop = new OrderFacade();
        shop.placeOrder("Headphones", 1500);   // one call does everything
    }
}
