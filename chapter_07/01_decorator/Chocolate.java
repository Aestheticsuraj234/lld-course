public class Chocolate extends CoffeeDecorator{
    public  Chocolate(Coffee coffee){
        super(coffee);
    }
    
   public String getDescription() {
        return coffee.getDescription() + " + Chocolate";
    }

    public int getCost() {
        return coffee.getCost() + 30;
    } 
}
