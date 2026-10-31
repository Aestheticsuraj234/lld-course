public class Invoice {
    private final String customer;
    private final double[] prices;

    public Invoice(String customer, double... prices) {
        this.customer = customer;
        this.prices = prices;
    }

    public double calculateTotal() {
        double total = 0;
        for (double p : prices) {
            total += p;
        }
        return total * 1.18; // add 18% GST
    }

    public String getCustomer() {
        return customer;
    }

}