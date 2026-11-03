public class Main {
    public static void main(String[] args) {
        new Circle(new VectorRenderer()).draw();
        
        new Circle(new PixelRenderer()).draw();
    }
}
