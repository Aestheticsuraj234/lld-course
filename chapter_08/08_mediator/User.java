public class User {
    private String name;
    private ChatRoom room;

    public User(String name, ChatRoom room) {
        this.name = name;
        this.room = room;
        room.join(this);
    }

    public String getName() {
        return name;
    }

    public void send(String message) {
        room.send(message, this);   // talk to the room, not to other users
    }

    public void receive(String message) {
        System.out.println(name + " received -> " + message);
    }
}