// Every room lets a visitor in
public interface Room {
    void accept(Visitor visitor);
}