public class DryGoodMain {
    public static void main(String[] args) {
        System.out.println("Online price: Rs." + new OnlineOrder().finalPrice(2000));
        System.out.println("Store price:  Rs." + new StoreOrder().finalPrice(2000));
    } 
}
