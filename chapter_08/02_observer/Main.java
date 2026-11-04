public class Main {
    public static void main(String[] args) {
        Channel channel = new Channel();
        
        User amit = new User("Amit");
        User priya = new User("Priya");
        
        channel.subscribe(amit);
        channel.subscribe(priya);
        
        channel.uploadVideo("Java in 10 mins");
        
        channel.unsubscribe(amit);
        channel.uploadVideo("LLD basics");
    }
}

// New video uploaded: Java in 10 minutes
// Amit got a notification: Java in 10 minutes
// Priya got a notification: Java in 10 minutes
// New video uploaded: LLD basics
// Priya got a notification: LLD basics