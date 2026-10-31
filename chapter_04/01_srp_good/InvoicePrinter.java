public class InvoicePrinter {
    public void print(Invoice invoice) {
        System.out.println("Invoice for " + invoice.getCustomer() + ": Rs." + invoice.calculateTotal());
    }
}
