public class Main {
    public static void main(String[] args) {
        // Production setup: MySQL + Email
        OrderService live = new OrderService(new MySqlOrderRepository(), new EmailNotifier());
        live.placeOrder("2 x Paneer Tikka");

       
    }
}