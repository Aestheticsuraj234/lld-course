public abstract class Drink {
    // The template: the steps and their order are fixed here
    public final void make() {
        boilWater();
        addMain();
        pourInCup();
        System.out.println();
    }

    private void boilWater() {
        System.out.println("Boiling water");
    }

    private void pourInCup() {
        System.out.println("Pouring into cup");
    }

    // Only this step is different for each drink
    protected abstract void addMain();
}