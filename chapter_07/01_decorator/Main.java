public class Main {
    public static void main(String[] args) {
        Coffee c1 = new PlainCoffee();
        System.out.println(c1.getDescription() + " = Rs." + c1.getCost());
        
        Coffee c2 = new Milk(new PlainCoffee());
        System.out.println(c1.getDescription() + " = Rs." + c1.getCost());
        
        Coffee c3 = new Chocolate(new Milk(new PlainCoffee()));
        
        System.out.println(c1.getDescription() + " = Rs." + c1.getCost());
        
        Coffee c4 = new Caramel(new Chocolate(new Milk(new PlainCoffee()))); 
        
         System.out.println(c1.getDescription() + " = Rs." + c1.getCost());
    }
}
