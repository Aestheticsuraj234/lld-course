public class Main {
    public static void main(String[] args) {
        String[] messages = {"laugh", "heart", "laugh", "laugh", "heart"};

        for (String m : messages) {
            Emoji e = EmojiStore.get(m);
            System.out.println("Sent: " + e.getName());
        }

        System.out.println("Same object? " + (EmojiStore.get("laugh") == EmojiStore.get("laugh")));
    }
}

// //Loading laugh image
// Sent: laugh
// Loading heart image
// Sent: heart
// Sent: laugh
// Sent: laugh
// Sent: heart
// Same object? true