public class OrderService {
    private final MySqlDatabase database = new MySqlDatabase();
    private final EmailSender emailSender = new EmailSender();

    public void placeOrder(String order) {
        database.save(order);
        emailSender.send("Your order '" + order + "' is placed");
    }
}
