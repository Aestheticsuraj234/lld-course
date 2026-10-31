public class Main {
    public static void main(String[] args) {
        MultiFunctionDevice device = (MultiFunctionDevice) new BasicPrinter();
        device.print("resume.pdf");
        device.scan("aadhaar.pdf"); // compiles fine, crashes at runtime
    }
}