// Job: store an invoice. Change this only if the storage changes (file, DB, cloud).
public class InvoiceRepository {
    public void save(Invoice invoice) {
        System.out.println("Saving invoice of " + invoice.getCustomer() + " to invoices.txt");
    }
}