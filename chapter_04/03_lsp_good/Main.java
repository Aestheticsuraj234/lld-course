import java.util.List;

public class Main {
    public static void main(String[] args) {
        Sparrow sparrow = new Sparrow();
        Penguin penguin = new Penguin();

        // Every Bird can eat: safe for ALL birds
        List<Bird> birds = List.of(sparrow, penguin);
        for (Bird bird : birds) {
            bird.eat();
        }

        // Only FlyingBirds go in this list. Java won't even let you add a Penguin.
        List<FlyingBird> flyers = List.of(sparrow);
        for (FlyingBird bird : flyers) {
            bird.fly();
        }

        penguin.swim();
    }
}