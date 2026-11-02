public class SenderFactory {
    public static final int MAX_RETRIES = 3;        // never used
    public static final String DEFAULT_PRIORITY = "NORMAL"; // never used

    public static Sender create(String type) {
        switch (type) {
            case "EMAIL": return new EmailSender();
            case "FAX": return new FaxSender();
            case "PIGEON": return new CarrierPigeonSender();
            default: throw new IllegalArgumentException("Unknown type " + type);
        }
    }
}