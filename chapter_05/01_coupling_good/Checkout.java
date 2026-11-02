public class Checkout {
    private final PaymentGateway gateway;

    public Checkout(PaymentGateway gateway) {
        this.gateway = gateway;
    }

    public void pay(Cart cart) {
        gateway.charge(cart.getTotal());
    }

}
