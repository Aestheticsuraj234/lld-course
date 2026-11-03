public class PaymentAdapter implements PaymentGateway{
    private ThirdPartyPaymentSdk sdk = new ThirdPartyPaymentSdk();
    
    public void pay(int rupees) {
        long paise = rupees * 100L;   // convert to what the SDK understands
        sdk.makePayment(paise);
    }
}
