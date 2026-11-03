public class Caramel extends CoffeeDecorator{
    public Caramel(Coffee coffee){
        super(coffee);
    }
    
         public String getDescription() {
        return coffee.getDescription() + " + Caramel";
    }

    public int getCost() {
        return coffee.getCost() + 90;   // old price + price of milk
    }
}
