public class Bird {
    protected final String name;

    public Bird(String name) {
        this.name = name;
    }

    // The parent PROMISES: every bird can fly
    public void fly() {
        System.out.println(name + " is flying");
    }
}