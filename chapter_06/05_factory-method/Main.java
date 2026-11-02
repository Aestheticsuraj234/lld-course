public class Main {
    public static void main(String[] args) {
        NotificationSender sender = new EmailSender();
        sender.notifyUser("Your order is placed");

        sender = new SmsSender();
        sender.notifyUser("Your order is placed");

        sender = new WhatsAppSender();

        sender.notifyUser("hello");
    }
}