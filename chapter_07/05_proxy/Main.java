public class Main {
    public static void main(String[] args) {
        Image photo = new ImageProxy("sample.png");
       System.out.println("Image created, nothing loaded yet");

         photo.display();   // loads now
        photo.display();   // already loaded, just shows 
    }
}

//Image created, nothing loaded yet
//Loading holiday.jpg from disk... (slow)
// Showing holiday.jpg
// Showing holiday.jpg