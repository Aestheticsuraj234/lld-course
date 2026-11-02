public enum DatabaseConnection {
    INSTANCE; // Java makes sure there is only ever ONE of this

    DatabaseConnection() {
        System.out.println("Connection opened");
    }

    public void query(String sql) {
        System.out.println("Running: " + sql);
    }
}