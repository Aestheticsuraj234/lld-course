public class MySqlOrderRepository implements OrderRepository{
    @Override 
    public void save(String order) {
        System.out.println("Saved '" + order + "' in MySQL");
    }
}
