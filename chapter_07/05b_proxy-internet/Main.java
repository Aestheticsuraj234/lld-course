public class Main {
    public static void main(String[] args) {
        Internet officeWifi = new InternetProxy();

        officeWifi.open("google.com");
        officeWifi.open("games.com");
        officeWifi.open("github.com");
    }
}