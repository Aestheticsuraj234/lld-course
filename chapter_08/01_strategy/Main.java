public class Main {
    public static void main(String[] args) {
        Checkout checkout = new Checkout();

        checkout.setPaymentMethod(new UpiPayment());
        checkout.payBill(500);

        checkout.setPaymentMethod(new CardPayment());
        checkout.payBill(1200);
    }
}