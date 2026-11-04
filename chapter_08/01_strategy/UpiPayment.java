public class UpiPayment implements PaymentStrategy{
    public void pay(int amount) {
        System.out.println("Paid Rs." + amount + " using UPI");
    }
}
