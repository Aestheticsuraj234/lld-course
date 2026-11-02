public class PaytmGateway implements PaymentGateway {
    @Override
    public void charge(double amount) {
        System.out.println("Paytm charged Rs." + amount);
    }
}