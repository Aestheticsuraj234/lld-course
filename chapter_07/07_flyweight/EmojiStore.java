import java.util.HashMap;
import java.util.Map;

// Gives the saved emoji if we already have it, otherwise makes a new one
public class EmojiStore {
    private static Map<String, Emoji> emojis = new HashMap<>();

    public static Emoji get(String name) {
        if (!emojis.containsKey(name)) {
            emojis.put(name, new Emoji(name));
        }
        return emojis.get(name);
    }
}