import java.util.ArrayList;
import java.util.List;

public class GameCharacter {
    private String name;
    private List<String> weapons = new ArrayList<>();

    public GameCharacter(String name) {
        System.out.println("Loading 3D model for " + name + "... (slow)");
        this.name = name;
    }

    // Make a copy without loading again
    public GameCharacter copy() {
        GameCharacter clone = new GameCharacter();
        clone.name = this.name;
        clone.weapons = new ArrayList<>(this.weapons); // NEW list, not the same list
        return clone;
    }

    private GameCharacter() { }        // used only by copy(), so no slow loading

    public void setName(String name) {
        this.name = name;
    }

    public void addWeapon(String weapon) {
        weapons.add(weapon);
    }

    public String toString() {
        return name + " " + weapons;
    }
}