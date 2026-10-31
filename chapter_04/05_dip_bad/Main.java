public class Main {
    public static void main(String[] args) {
        OrderService service = new OrderService();
        service.placeOrder("2 x Paneer Tikka");
        // Want MongoDB? Want SMS? Want a fake DB for testing? You must EDIT OrderService.
    }

}
