public class Food implements Item {
    int price = 200;

    public void accept(Visitor visitor) {
        visitor.visit(this);   // "visitor, here is a Food"
    }
}