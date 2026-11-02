public class Main {
    public static void main(String[] args) {
        DatabaseConnection a = DatabaseConnection.INSTANCE;
        DatabaseConnection b = DatabaseConnection.INSTANCE;

        a.query("SELECT * FROM users");
        System.out.println("Same object? " + (a == b));
    }
}