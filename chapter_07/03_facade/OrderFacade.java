public class OrderFacade {
    private Inventory inventory = new Inventory();
    private Payment payment = new Payment();
    private Delivery delivery = new Delivery();
    
      public void placeOrder(String item, int amount) {
        inventory.reserve(item);
        payment.charge(amount);
        delivery.schedule(item);
        System.out.println("Order placed!");
    }

}
