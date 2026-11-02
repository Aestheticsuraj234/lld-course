// Checkout knows TOO MUCH about Cart and Razorpay (high coupling)
public class Checkout {
    public void pay(Cart cart) {
        // Reaches into Cart's internal lists to do Cart's job (low cohesion in Cart)
        double total = 0;
        for (int i = 0; i < cart.itemPrices.size(); i++) {
            total += cart.itemPrices.get(i);
        }

        // Glued to one gateway and even to its secret field
        RazorpayGateway gateway = new RazorpayGateway();
        gateway.charge(gateway.apiKey, total);
    }
}