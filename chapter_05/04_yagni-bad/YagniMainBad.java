public class YagniMainBad {
    public static void main(String[] args) {
        // The ONLY real requirement: send a welcome email
        Sender sender = SenderFactory.create("EMAIL");
        sender.send("riya@gmail.com", "Welcome to our app!");
    }
}
