public class Checkout {
    private PaymentStrategy strategy;

    // The user picks the payment method
    public void setPaymentMethod(PaymentStrategy strategy) {
        this.strategy = strategy;
    }

    public void payBill(int amount) {
        strategy.pay(amount);   // Checkout doesn't care HOW the payment happens
    }
}