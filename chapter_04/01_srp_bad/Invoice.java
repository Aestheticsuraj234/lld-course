public class Invoice {
    private final String customer;
    private final double[] prices;

    public Invoice(String customer, double... prices) {
        this.customer = customer;
        this.prices = prices;
    }

    // Job 1: business logic
    public double calculateTotal() {
        double total = 0;
        for (double p : prices) {
            total += p;
        }
        return total * 1.18; // add 18% GST
    }
   // Job 2: printing
    public void print() {
        System.out.println("Invoice for " + customer + ": Rs." + calculateTotal());
    }
 

    // Job 3: saving
    public void saveToFile() {
        System.out.println("Saving invoice of " + customer + " to invoices.txt");
    }
}