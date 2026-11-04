import java.util.Iterator;

public class Playlist implements Iterable<String> {
    private String[] songs = {"Song A", "Song B", "Song C"};

    // Gives an object that walks through the songs one by one
    public Iterator<String> iterator() {
        return new PlaylistIterator(songs);
    }
}