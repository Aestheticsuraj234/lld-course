// The SHARED object: one emoji image, used by many messages
public class Emoji {
    private final String name;

    public Emoji(String name) {
        this.name = name;
        System.out.println("Loading " + name + " image");   // the costly part
    }

    public String getName() {
        return name;
    }
}