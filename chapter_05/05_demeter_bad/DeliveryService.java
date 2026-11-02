public class DeliveryService {
    public void assignRider(Order order) {
        // A "train wreck": DeliveryService talks to strangers (Customer, Address)
        String city = order.getCustomer().getAddress().getCity();
        System.out.println("Assigning a rider in " + city);
    }
}