public class Main {
    public static void main(String[] args) {
        Invoice invoice = new Invoice("Riya", 100, 200);

        new InvoicePrinter().print(invoice);
        new InvoiceRepository().save(invoice);
    }
}
