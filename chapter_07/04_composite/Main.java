public class Main {
    public static void main(String[] args) {
        Folder photos = new Folder();
        photos.add(new File(200));
        photos.add(new File(300));

        Folder documents = new Folder();
        documents.add(new File(50));
        documents.add(photos);          // a folder inside a folder

        System.out.println("Photos size: " + photos.getSize() + " KB");
        System.out.println("Documents size: " + documents.getSize() + " KB");
    }
}