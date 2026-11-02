// "We MIGHT need fax one day..." Nobody asked for this.
public class FaxSender implements Sender {
    @Override
    public void send(String to, String message) {
        throw new UnsupportedOperationException("TODO: fax not built yet");
    }
}