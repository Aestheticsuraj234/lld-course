public class DatabaseConnection {
    public static volatile DatabaseConnection instance; //every thread sees the latest value of instance
   
    private DatabaseConnection() {
        System.out.println("Connection opened");
    }

    public static DatabaseConnection getInstance() {
        if (instance == null) {                          // check 1: skip the lock if it already exists
            synchronized (DatabaseConnection.class) {    // only one thread at a time from here
                if (instance == null) {                  // check 2: maybe another thread made it while we waited
                    instance = new DatabaseConnection();
                }
            }
        }
        return instance;
    }

    public void query(String sql) {
        System.out.println("Running: " + sql);
    }

}
