public class WhatsAppSender extends NotificationSender {
    Notification createNotification() {
        return new WhatsAppNotification();
    }
}