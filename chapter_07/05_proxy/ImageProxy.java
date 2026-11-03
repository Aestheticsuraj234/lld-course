public class ImageProxy implements Image{
    private String fileName;
    private RealImage realImage;   // empty at first

    public ImageProxy(String fileName) {
        this.fileName = fileName;
    }

    public void display() {
        if (realImage == null) {
            realImage = new RealImage(fileName);   // load only the first time
        }
        realImage.display();
    }
}
