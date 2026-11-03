public class RealImage implements Image{
    private String fileName;

    public RealImage(String fileName) {
        this.fileName = fileName;
        System.out.println("Loading " + fileName + " from disk... (slow)");
    }

    public void display() {
        System.out.println("Showing " + fileName);
    }
}
