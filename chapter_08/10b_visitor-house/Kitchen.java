public class Kitchen implements Room {
    public void accept(Visitor visitor) {
        visitor.visit(this);   // "visitor, I am the Kitchen"
    }
}