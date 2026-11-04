import java.util.ArrayList;
import java.util.List;

// The middle person: every message goes through here
public class ChatRoom {
    private List<User> users = new ArrayList<>();

    public void join(User user) {
        users.add(user);
    }

    public void send(String message, User sender) {
        for (User u : users) {
            if (u != sender) {
                u.receive(sender.getName() + ": " + message);
            }
        }
    }
}