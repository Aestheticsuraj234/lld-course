public class BasicPrinter implements MultiFunctionDevice{
    @Override
    public void print(String doc) {
        System.out.println("Printing " + doc);
    }

    @Override
    public void scan(String doc) {
        throw new UnsupportedOperationException("BasicPrinter can't scan");
    }

    @Override
    public void fax(String doc) {
        throw new UnsupportedOperationException("BasicPrinter can't fax");
    }   
}
