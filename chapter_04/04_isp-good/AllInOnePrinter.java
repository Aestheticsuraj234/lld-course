public class AllInOnePrinter implements Printer , Scanner , Fax{
    @Override
    public void print(String doc) {
        System.out.println("AllInOne printing " + doc);
    }

    @Override
    public void scan(String doc) {
        System.out.println("AllInOne scanning " + doc);
    }

    @Override
    public void fax(String doc) {
        System.out.println("AllInOne faxing " + doc);
    }
}
