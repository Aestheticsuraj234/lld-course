public class CouplingMain {
    public static void main(String[] args) {
        Cart cart = new Cart();
        cart.itemNames.add("Shoes");
        cart.itemPrices.add(2000.0);
        cart.itemNames.add("Socks");
        cart.itemPrices.add(200.0);

        new Checkout().pay(cart);
        // If Cart changes its lists into a Map, Checkout breaks.
        // If we move to Paytm, Checkout breaks.
    }

}
