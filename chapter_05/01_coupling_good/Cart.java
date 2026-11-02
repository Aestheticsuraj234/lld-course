import java.util.ArrayList;
import java.util.List;

// HIGH cohesion: everything about the cart's items lives here, including the total
public class Cart {
    private final List<Item> items = new ArrayList<>();

    public void add(Item item) {
        items.add(item);
    }

    public double getTotal() {
        double total = 0;
        for (Item item : items) {
            total += item.getPrice();
        }
        return total;
    }
}