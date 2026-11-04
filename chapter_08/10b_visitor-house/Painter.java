public class Painter implements Visitor {
    public void visit(Kitchen kitchen) {
        System.out.println("Painter: painting the Kitchen white");
    }

    public void visit(Bedroom bedroom) {
        System.out.println("Painter: painting the Bedroom blue");
    }
}