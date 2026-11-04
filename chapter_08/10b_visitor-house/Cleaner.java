public class Cleaner implements Visitor {
    public void visit(Kitchen kitchen) {
        System.out.println("Cleaner: washing the dishes in the Kitchen");
    }

    public void visit(Bedroom bedroom) {
        System.out.println("Cleaner: making the bed in the Bedroom");
    }
}