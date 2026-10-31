public class DependencyMain {
    public static void main(String[] args) {
        Printer printer = new Printer();

        printer.print(new Document("The Great Gatsby", "In my younger and more vulnerable years my father gave me some advice..."));
        printer.print(new Document("1984", "It was a bright cold day in April, and the clocks were striking thirteen."));
    }
}
