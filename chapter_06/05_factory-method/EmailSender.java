public class EmailSender extends NotificationSender {
    Notification createNotification() {
        return new EmailNotification();
    }
}