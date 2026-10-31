public class Penguin extends Bird{
    public Penguin() {
        super("Penguin");
    }

    @Override 
    public void fly(){
        throw new UnsupportedOperationException("Penguins can't fly!");  
    }

}
