public class Main {
    public static void main(String[] args) {
        Notification n1 = NotificationFactory.create("EMAIL");
        n1.send("Your order is placed");

        Notification n2 = NotificationFactory.create("SMS");
        n2.send("Your order is placed");
    }
}
