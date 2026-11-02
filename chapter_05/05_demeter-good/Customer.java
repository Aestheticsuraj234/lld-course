public class Customer {
    private final String name;
    private final Address address;

    public Customer(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    // Customer answers questions about ITSELF
    public String getCity() {
        return address.getCity();
    }
}