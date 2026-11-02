public class SmsSender extends NotificationSender {
    Notification createNotification() {
        return new SmsNotification();
    }
}