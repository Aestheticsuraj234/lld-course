
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        Playlist playlist = new Playlist();
        
        for (String song : playlist) {
            System.out.println("Playing " + song);
        }
        
        Iterator<String> it = playlist.iterator();
        
        while(it.hasNext()){
             System.out.println("Again: " + it.next());
        }
    }
}
