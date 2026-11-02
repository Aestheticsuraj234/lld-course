public class Main {
    public static void main(String[] args) {
        DatabaseConnection a = DatabaseConnection.getInstance();
        DatabaseConnection b = DatabaseConnection.getInstance();

        a.query("SELECT * FROM users");
        System.out.println("Same object? " + (a == b));
    }
}