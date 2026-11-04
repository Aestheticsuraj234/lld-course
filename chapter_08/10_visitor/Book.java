public class Book implements Item {
    int price = 500;

    public void accept(Visitor visitor) {
        visitor.visit(this);   // "visitor, here is a Book"
    }
}