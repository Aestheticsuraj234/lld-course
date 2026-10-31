public class NotficationService {
    public void send(String channel , String message){
        if (channel.equals("EMAIL")) {
            System.out.println("Email: " + message);
        } else if (channel.equals("SMS")) {
            System.out.println("SMS: " + message);
        } else if (channel.equals("WHATSAPP")) {
            System.out.println("WhatsApp: " + message);
        } else {
            System.out.println("Unknown channel: " + channel);
        }
    }
}
