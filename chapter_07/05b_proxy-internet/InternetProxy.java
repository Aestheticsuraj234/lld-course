import java.util.List;

// Proxy: checks the site first, then lets the real internet do the work
public class InternetProxy implements Internet {
    private Internet realInternet = new RealInternet();
    private List<String> blockedSites = List.of("games.com", "movies.com");

    public void open(String site) {
        if (blockedSites.contains(site)) {
            System.out.println("Access denied: " + site);
            return;
        }
        realInternet.open(site);
    }
}