
import java.util.ArrayList;
import java.util.List;

public class Channel {
    private List<Subscriber> subscribers = new ArrayList<>();

    public void subscribe(Subscriber s) {
        subscribers.add(s);
    }

    public void unsubscribe(Subscriber s) {
        subscribers.remove(s);
    }

    public void uploadVideo(String title) {
        System.out.println("New video uploaded: " + title);
        for (Subscriber s : subscribers) {
            s.notify(title);   // tell everyone on the list
        }
    }
}
