import java.util.ArrayList;
import java.util.List;

public class Team {
    private final String name;
    private final List<Player> players = new ArrayList<>(); // team HAS players (weak)

    public Team(String name) {
        this.name = name;
    }

    // Players come from OUTSIDE. The team doesn't create them.
    public void addPlayer(Player player) {
        players.add(player);
    }

    public void disband() {
        System.out.println(name + " is disbanded");
        players.clear(); // the team lets go of the players, but the players still exist
    }

    public void printPlayers() {
        System.out.print(name + " players: ");
        for (Player p : players) {
            System.out.print(p.getName() + " ");
        }
        System.out.println();
    }
}