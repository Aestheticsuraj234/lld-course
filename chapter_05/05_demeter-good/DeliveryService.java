public class DeliveryService {
    public void assignRider(Order order) {

        String city = order.getDeliveryCity();
        System.out.println("Assigning a rider in " + city);
    }
}