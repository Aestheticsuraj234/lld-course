public class RazorpayGateway {
    public String apiKey = "rzp_test_123";

    public void charge(String key, double amount) {
        System.out.println("Razorpay (key " + key + ") charged Rs." + amount);
    }
}