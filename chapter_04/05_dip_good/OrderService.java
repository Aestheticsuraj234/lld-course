public class OrderService {
    private final OrderRepository repository;
    private final Notifier notifier; 

    public OrderService(OrderRepository repository, Notifier notifier) {
        this.repository = repository;
        this.notifier = notifier;
    }

    public void placeOrder(String order) {
        repository.save(order);
        notifier.send("Your order '" + order + "' is placed");
    }
}
