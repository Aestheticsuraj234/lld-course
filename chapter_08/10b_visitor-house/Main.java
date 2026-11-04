public class Main {
    public static void main(String[] args) {
        Room[] house = {new Kitchen(), new Bedroom()};

        // Visitor 1 goes through the house
        Visitor cleaner = new Cleaner();
        for (Room room : house) {
            room.accept(cleaner);
        }

        // Visitor 2 goes through the SAME house. No room class changed.
        Visitor painter = new Painter();
        for (Room room : house) {
            room.accept(painter);
        }
    }
}

// Cleaner: washing the dishes in the Kitchen
// Cleaner: making the bed in the Bedroom
// Painter: painting the Kitchen white
// Painter: painting the Bedroom blue