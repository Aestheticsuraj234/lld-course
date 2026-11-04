// One method for each type of item
public interface Visitor {
    void visit(Book book);
    void visit(Food food);
}