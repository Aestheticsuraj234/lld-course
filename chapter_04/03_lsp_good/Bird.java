public abstract  class Bird {
    protected final String name;

    public Bird(String name) {
        this.name = name;
    }

    public void eat() {
        System.out.println(name + " is eating");
    }
}
