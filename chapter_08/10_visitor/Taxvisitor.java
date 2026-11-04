// The new operation lives here, not inside Book or Food
public class Taxvisitor implements Visitor {
    public void visit(Book book) {
        System.out.println("Book tax (5%): Rs." + book.price * 5 / 100);
    }

    public void visit(Food food) {
        System.out.println("Food tax (10%): Rs." + food.price * 10 / 100);
    }
}