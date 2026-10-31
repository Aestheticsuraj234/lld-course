public class Main {
    public static void main(String[] args) {
        Invoice invoice = new Invoice("John Doe", 100.0, 200.0, 300.0);
        invoice.print();
        invoice.saveToFile();
    }
}
