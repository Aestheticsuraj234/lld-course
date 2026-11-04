import java.util.Iterator;

public class PlaylistIterator implements Iterator<String> {
    private String[] songs;
    private int index = 0;

    public PlaylistIterator(String[] songs) {
        this.songs = songs;
    }

    public boolean hasNext() {
        return index < songs.length;
    }

    public String next() {
        return songs[index++];
    }
}

