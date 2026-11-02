public class RazorpayGateway implements PaymentGateway {
    private final String apiKey = "rzp_test_123"; // a private detail now

    @Override
    public void charge(double amount) {
        System.out.println("Razorpay charged Rs." + amount);
    }
}
