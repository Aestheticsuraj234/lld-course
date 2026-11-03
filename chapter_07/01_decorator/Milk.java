public class Milk extends CoffeeDecorator{
    public Milk(Coffee coffee){
        super(coffee);
    }
    
     public String getDescription() {
        return coffee.getDescription() + " + Milk";
    }

    public int getCost() {
        return coffee.getCost() + 20;   // old price + price of milk
    }
}
