public class CardPayment implements PaymentStrategy{
    public void pay(int amount) {
        System.out.println("Paid Rs." + amount + " using Card");
    }
}
