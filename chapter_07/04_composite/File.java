public class File implements  FileSystemItem {
        private int size;

    public File(int size) {
        this.size = size;
    }

    public int getSize() {
        return size;
    }
}
