import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class House {
    private final String address;
    private final List<Room> rooms = new ArrayList<>(); // house OWNS its rooms (strong)

    public House(String address, String... roomNames) {
        this.address = address;
        // Rooms are created INSIDE the house. Nobody outside made them.
        for (String roomName : roomNames) {
            rooms.add(new Room(roomName));
        }
    }

    public void printRooms() {
        System.out.print("House at " + address + " has: ");
        for (Room r : rooms) {
            System.out.print(r.getName() + " ");
        }
        System.out.println();
    }

    // Others can LOOK at the rooms, but can't add or remove them
    public List<Room> getRooms() {
        return Collections.unmodifiableList(rooms);
    }
}