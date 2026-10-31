import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Bird> birds = List.of(new Sparrow(), new Penguin());

        // This code trusts the parent's promise: "every Bird can fly()"
        for (Bird bird : birds) {
            bird.fly(); // crashes on Penguin
        }
    }
}
