public class NotificationFactory {
    public static Notification create(String type){
        if (type.equals("EMAIL")) return new EmailNotification();
        if (type.equals("SMS")) return new SmsNotification();
        throw new IllegalArgumentException("Unknown type: " + type); 
    }
}
