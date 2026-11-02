public class DatabaseConnection {
    private static DatabaseConnection instance; // the one and only object

    private DatabaseConnection() {              // private: no one outside can say "new"
        System.out.println("Connection opened");
    }

    public static DatabaseConnection getInstance() {
        if (instance == null) {                 // first time? create it
            instance = new DatabaseConnection();
        }
        return instance;                        // every other time: give back the same one
    }

    public void query(String sql) {
        System.out.println("Running: " + sql);
    }
}