public class Main {
     public static void main(String[] args) {
        PaymentGateway gateway = new PaymentAdapter();
        gateway.pay(500);   // our app only knows "pay in rupees"
    }
}
