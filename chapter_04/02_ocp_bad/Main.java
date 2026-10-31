public class Main {
    public static void main(String[] args) {
        NotficationService service = new NotficationService();
        service.send("EMAIL", "Order placed");
        service.send("SMS", "Order placed");
        service.send("WHATSAPP", "Order placed");
        service.send("PUSH", "Order placed"); // not supported until we EDIT the class
    }
}
