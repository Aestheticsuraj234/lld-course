public abstract class NotificationSender {
    // The factory method: each child class decides WHAT to create
    abstract Notification createNotification();

    // The common steps are written only once, here
    public void notifyUser(String message) {
        Notification n = createNotification();
        n.send(message);
    }
}