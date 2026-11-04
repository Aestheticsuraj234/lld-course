public class Main {
    public static void main(String[] args) {
        Item[] cart = {new Book(), new Food()};
        Visitor tax = new Taxvisitor();

        for (Item item : cart) {
            item.accept(tax);
        }
    }
}