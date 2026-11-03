import java.util.ArrayList;
import java.util.List;

public class Folder implements FileSystemItem {
    private List<FileSystemItem> items = new ArrayList<>(); // can hold files AND folders

    public void add(FileSystemItem item) {
        items.add(item);
    }

    public int getSize() {
        int total = 0;
        for (FileSystemItem item : items) {
            total += item.getSize();   // a folder asks each item for its size
        }
        return total;
    }
}