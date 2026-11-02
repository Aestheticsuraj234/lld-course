public class Order {
    private final Customer customer;

    public Order(Customer customer) {
        this.customer = customer;
    }

    // Order answers questions about ITSELF. Callers don't need to know about Customer or Address.
    public String getDeliveryCity() {
        return customer.getCity();
    }
}