public class GoodCouplingMain {
   
        public static void main(String[] args) {
            Cart cart = new Cart();
            cart.add(new Item("Shoes", 2000));
            cart.add(new Item("Socks", 200));
    
            new Checkout(new RazorpayGateway()).pay(cart);
            new Checkout(new PaytmGateway()).pay(cart); // switching gateway: zero changes in Checkout
        }
    
}
