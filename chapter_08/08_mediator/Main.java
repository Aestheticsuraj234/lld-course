public class Main {
    public static void main(String[] args) {
        ChatRoom room = new ChatRoom();
        User amit = new User("Amit", room);
        User priya = new User("Priya", room);
        User rahul = new User("Rahul", room);
        User neha = new User("Neha" , room);

        amit.send("Hi everyone!");
        priya.send("Hello Amit");
    }
}

// Priya received -> Amit: Hi everyone!
// Rahul received -> Amit: Hi everyone!
// Amit received -> Priya: Hello Amit
// Rahul received -> Priya: Hello Amit