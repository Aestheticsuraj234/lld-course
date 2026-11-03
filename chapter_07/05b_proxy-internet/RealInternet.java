// The real internet connection
public class RealInternet implements Internet {
    public void open(String site) {
        System.out.println("Opening " + site);
    }
}