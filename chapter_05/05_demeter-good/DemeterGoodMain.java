public class DemeterGoodMain {
    public static void main(String[] args) {
        Order order = new Order(new Customer("Riya", new Address("Bengaluru")));
        new DeliveryService().assignRider(order);
    }
}
